package webDriverConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithDropDowns {

	public static void main(String[] args) throws InterruptedException {
	
		String expMonth = "Oct";
		boolean status = false;
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http:/www.facebook.com");
		
		driver.manage().window().maximize();
		
		//Clicking on 'Create New Account'button 
		driver.findElement(By.linkText("Create New Account")).click();
		
		Thread.sleep(5000);
		
				
		//Selecting Value from month drop down
		driver.findElement(By.id("month")).sendKeys("jan");
		
		//Selecting using Select Class
		Select select = new Select(driver.findElement(By.id("month")));
		
		select.selectByVisibleText("Aug");
		
		Thread.sleep(1000);
		
		Select select1 = new Select(driver.findElement(By.id("day")));
		
		select1.selectByIndex(6);
		
		Thread.sleep(1000);
		
		Select select2 = new Select(driver.findElement(By.id("year")));
		
		select2.selectByValue("1979");
		
		Thread.sleep(1000);
		
		//3.count number of values in a drop down
		
		List<WebElement> months = select.getOptions();
		
				System.out.println("Total no of values in Month Drop down is :"+ months.size());
		
		//4. Print all values of month drop down
		
		/*for (int i = 0; i < months.size(); i++) {
			String monthValue = months.get(i).getText();
			
			System.out.println("Vlaue of month drop down is: "+ monthValue);
			

			if (monthValue.equalsIgnoreCase(expMonth)) {
				status = true;
				break;
			} else {
				status = false;
				
						
				
			}
}
		if (status == true) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");*/
			
			//5. Printing all the Values of the Drop down with select class
			
		List<WebElement> months1 = driver.findElements(By.xpath("//*[@id='month']/option"));
				
				for (int i = 0; i < months1.size(); i++) {
					String MonthName = months1.get(i).getText();
					System.out.println(MonthName);
					
					
					//Selecting May from Drop down
					
					if (MonthName.equals("May")) {
					months1.get(i).click();
					break;
					
					
					
					}
					
			}
			
			
			
		}
			
			
			
		}
		
			
	
