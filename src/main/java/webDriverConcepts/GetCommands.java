package webDriverConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//1.Open Chrome browser of selenium
		
		//Maximise the application
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");//2.Open application based on URL Provided

		
		//3.Capture Title of the application
		String appTitle=driver.getTitle();
		System.out.println("Title of the application is :"+appTitle);
		
		//to Compare values we use if conditions
		if (appTitle.equalsIgnoreCase("google")){
			System.out.println("Google application is opened");
		} else {
			System.out.println("Some other application is opened");
		}
		
		String appUrl=driver.getCurrentUrl();
		System.out.println("URL of the Application is:"+appUrl);
		
		/*
		 * if (appUrl.contains("google"))
		 * { System.out.println("URL is correct"); }
		 * else
		 * { System.out.println("URL is wrong"); }
		 */
		String updatedText=appUrl.substring(12,18);
		System.out.println(updatedText);
		if (updatedText.equals("google")){
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		//driver.getPageSource();
		System.out.println(driver.getPageSource());
		
		driver.close();//Close the application
	}

}
