package TestNGconcepts;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SurveryMonkeyLogin {

	@Test
	public void login() {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=sem_lp&ut_source2=sem&ut_source3=megamenu");	
		
		String actText = driver.findElement(By.xpath("//label[contains(text(),'Enter your username')]")).getText();
		
		if (actText.equalsIgnoreCase("Enter your username")) {
			System.out.println("Survery Monkey app is Lauched");
			
		} else {
			System.out.println("Someother app is Launched");
			

		}
		
		driver.findElement(By.id("username")).sendKeys("seleniumtraining1");
		driver.findElement(By.id("password")).sendKeys("selenium1234");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		

	String dashboardText = driver.findElement(By.xpath("//div[@class='inner-header clearfix']//a[@class='first-item current'][contains(text(),'Dashboard')]")).getText();
		
		
		if (dashboardText.equalsIgnoreCase("DashBoard")) {
			System.out.println("Pass---->Logged in successfully");
		} else {
			System.out.println("Login failed");
			
			driver.quit();
		}
	}
}
