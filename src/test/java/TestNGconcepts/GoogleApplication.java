package TestNGconcepts;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleApplication {
@Test
	public void launchGoogleapplication() {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//Launch Application
		driver.get("http://www.google.ca");
		
		String appTitle = driver.getTitle();
		
		//Assert.assertEquals(appTitle, "Facebook"); //Assertions and method overloading
		
		if (appTitle.equalsIgnoreCase("Google")) {
			System.out.println("Pass---->Google is opened");
				
		} else {
			System.out.println("Fail---->Google applicaion is not opened");
		}
	
			driver.quit();	
	}
}
