package webDriverConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithInputFields {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=sem_lp&ut_source2=sem&ut_source3=megamenu");
		
		WebElement uId = driver.findElement(By.id("username"));
		
		String Val =driver.findElement(By.id("username")).getAttribute("value");
		
		//1. Entering Value in input field
		System.out.println("Before entering any value:----->"+ Val.isEmpty());
		//driver.findElement(By.id("username")).sendKeys("seleniumtraining1");
		uId.sendKeys("oldvalue");
		
		Thread.sleep(2000);//Wait for how much time we want to wait
		
		//2. Clear the Value that is in the input field
		uId.clear();
		Thread.sleep(2000);
		
		uId.sendKeys("seleniumtraining1");
		Thread.sleep(2000);
		
		//3. Capture the value that is entered in input field
		String usernameVal = uId.getAttribute("value");
		System.out.println("User Name entered is --------------->"+usernameVal);
		System.out.println("Is Empty Value is:"+usernameVal.isEmpty());
		if (usernameVal.isEmpty()) {
			System.out.println("Value is not entered");
		} else {
			System.out.println("Value is entered");
		}
		
		
		//Capturing the link value
		/*
		 String linkValue =driver.findElement(By.linkText("Forgot username or password?")).getText();
		 
		 System.out.println("Forgot Username and Passwoard Link vaule is:------->"+linkValue);
		 */
		
		//driver.findElement(By.id("username")).getAttribute("value");
		
		
		
		
		
	}

}
