package webDriverConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Opening google application
		
		driver.get("http://www.google.ca");
		
		driver.manage().window().maximize();
		
		//Opening amazon application
		//driver.get("http://amazon.ca");//better to use
		driver.navigate().to("http://www.amazon.ca");//method overloading (not to use)
		
		
		//Switching back to google application
		driver.navigate().back();
		
		//Switch back to amazon application
		driver.navigate().forward();
		
		//to press on refresh button
		driver.navigate().refresh();
		
		
		
		
		
		
	}

}
