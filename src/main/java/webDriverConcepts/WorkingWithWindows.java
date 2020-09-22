package webDriverConcepts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithWindows {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		/*
		 * Set<String>winIds = driver.getWindowHandles();
		 * System.out.println("Total no of windows open:-" +winIds.size());
		 */
		
		/*
		 * String win1 = driver.getWindowHandle();
		 * System.out.println("Window ID for facebook is-----> "+ win1);
		 */
			
		String faceBookTitle = driver.getTitle();
		System.out.println("Facebook Title is: " + faceBookTitle);
		//Clicking on Creat Account button
				driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
				
				//Clicking on Cookies Policy
				System.out.println("Clicking on Cookies Policy Link");
				Thread.sleep(3000);
				
				/*
				 * String win2 =driver.getWindowHandle();
				 * System.out.println("Window ID for Cookies policy is ----->" + win2); does not work
				 */
				
				
				
				
				driver.findElement(By.id("cookie-use-link")).click();
				 
				Set<String>winIds = driver.getWindowHandles();
				//System.out.println("Total no of windows open:-" +winIds.size());
				
				Iterator<String> itr = winIds.iterator();
				String facebookWindow =itr.next();
				String cookiesWindow = itr.next();
				
				//System.out.println(facebookWindow +" ------->"+ cookiesWindow);
				
				driver.switchTo().window(cookiesWindow);
				
				System.out.println("Cookies Policy title is: "+ driver.getTitle());
				
				driver.switchTo().window(facebookWindow);
				System.out.println(driver.getTitle());
				
				//driver.close(); - will close only the current window 
				
				//driver.quit(); - will close all the windows.
				
				
				
				
				
				
				
		
		
		
		
	}

}
