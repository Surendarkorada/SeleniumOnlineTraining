package webDriverConcepts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithWaits {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	
		String faceBookTitle = driver.getTitle();
		System.out.println("Facebook Title is: " + faceBookTitle);
		//Clicking on Creat Account button
				driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
				
				//Clicking on Cookies Policy
				System.out.println("Clicking on Cookies Policy Link");
				
							
				driver.findElement(By.id("cookie-use-link")).click();
				
				WebDriverWait wait = new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email"))));
				driver.findElement(By.id("email")).sendKeys("test1234");
				
				
						
				
				
	
		
		

	}

}
