package webDriverConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithLinks {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		String expLink = "Globle ERP";
		boolean status= false;
		
		
driver.get("https://www.surveymonkey.com/user/sign-in/?ut_source=sem_lp&ut_source2=sem&ut_source3=megamenu");
	//1.Click on a Link
	//driver.findElement(By.linkText("Log in with SSO")).click();

	//2. Capture the link name
	
	System.out.println(driver.findElement(By.linkText("Log in with SSO")).getText());
	
	//3.Count number of links
	
	
	List<WebElement> links = driver.findElements(By.tagName("a"));
	links.size();
	int totalLinks = links.size();
	System.out.println("Total number of links of Survery Money login page are:"+ totalLinks);
	
	
	//4.Print all the link names-for loop
	
	for (int i = 0; i < totalLinks; i++) {
		String linkName = links.get(i).getText();
		 
		
			if (!(linkName.isEmpty())) {
				System.out.println("Link Name is:"+linkName);	
			}
		}
		
		//System.out.println("Link Name is:"+linkName);
		/*
		 * if (linkName.equalsIgnoreCase(expLink)) {
		 * //System.out.println("Pass- Link is available");
		 * 
		 * status= true; break;
		 * 
		 * } else { //System.out.println("Fail- Link is missing"); status = false;
		 * 
		 * }
		 */
		
		if (status == true) {
			System.out.println("Pass-Link is Available");
		} else {
			System.out.println("Fail-Link is Missing");
		
	}
		
	
	//5. Verify if some link is present
	
	
		

	}

}
