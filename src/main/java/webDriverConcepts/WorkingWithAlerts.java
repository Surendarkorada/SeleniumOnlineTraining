package webDriverConcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		
		//Clicking on Submit button
		driver.findElement(By.name("proceed")).click();
		
		Alert alert = driver.switchTo().alert();
		
		String alertText = alert.getText();
		System.out.println("Text capatured from Alert is:" + alertText);
		
		Thread.sleep(5000);
		
		//Clicking on OK button
		
		alert.accept();
		
		//Clicking on Cancel button
		
		alert.dismiss();
		
		
		//Entering One Time Password(OTP)
		alert.sendKeys("9314");
		
		
		

	}

}
