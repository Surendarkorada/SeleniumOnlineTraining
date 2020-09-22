package TestNGconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RealTimeCode {
WebDriver driver;

//Page Object
By username = By.id("username");
By password = By.id("password");
By loginBtn = By.xpath("//button[@type='submit']");
By signUpLink = By.linkText("Sign Up");
By dasboardText = By.linkText("Dashboard");

@BeforeMethod
public void setup() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=homepage&ut_source3=megamenu");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	
	
}
//Test1
@Test (priority = 1, enabled = false)
public void singupLineTest() {
	/*
	 boolean actSignupLink = driver.findElement(signUpLink).isDisplayed();
	 Assert.assertEquals(actSignupLink, true);
	 */

	Assert.assertTrue(driver.findElement(signUpLink).isDisplayed());
	
}

//Test2
@Test (priority = 2, enabled = false)
public void checkApplicationTitle() {
	String aapTitle = driver.getTitle();
	System.out.println("Application Title is "+aapTitle);
	Assert.assertEquals(aapTitle, "Log in to your account","Title of the application is not matching");
	
	
}


//Test3
@Test(priority = 3)
	public void loginTest() {
	driver.findElement(username).sendKeys("seleniumtraining1");
	driver.findElement(password).sendKeys("selenium1234");
	driver.findElement(loginBtn).click();
	
	String actVal = driver.findElement(dasboardText).getText();
	Assert.assertEquals(actVal, "Dashboard");
	
	
}

@AfterMethod
public void tearDown() {
	driver.quit();
}


/*
 public void login() { driver = new ChromeDriver();
 driver.findElement(By.id("username")).sendKeys("abcd"); }
  
  driver.findElement(By.id("username")).sendKeys(retUsername);
  driver.findElement(By.id("password")).sendKeys(retPassword);
  driver.findElement(By.xpath("//button[@type='submit']")).click();
 */





//Before Method----> Prereq Script

	
}
