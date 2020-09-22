package webDriverConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=sem_lp&ut_source2=sem&ut_source3=megamenu");
		
		
		//ID
		
		
		/*
		 * driver.findElement(By.id("username")).sendKeys("seleniumtraining1");
		 * 
		 * driver.findElement(By.id("password")).sendKeys("selenium1234");
		 */
		 
		
		//Name
		
		/*
		 * driver.findElement(By.name("username")).sendKeys("seleniumtraining1");
		 * driver.findElement(By.name("password")).sendKeys("selenium1234");
		 */
		
		
		//Xpath		
		//driver.findElement(By.xpath("//*[@id='sign_in_form']/fieldset/div/div[5]/button")).click();
		
		//CSS-cascading style sheets
		//driver.findElement(By.cssSelector("#sign_in_form > fieldset > div > div:nth-child(5) > button")).click();
		
		
		//Class Name
		//driver.findElement(By.className("wds-button--arrow-right")).click();
		
		
		//LinkText
		driver.findElement(By.linkText("Log in with SSO")).click();
		
		
		
		
		
		
		
		
		
		
		

	}

}
