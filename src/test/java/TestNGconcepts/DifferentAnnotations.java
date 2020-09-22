package TestNGconcepts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DifferentAnnotations {
	@BeforeTest 
	public void connectToDB() {
		System.out.println("Before Test----> Connect To DB");
	}
	@AfterTest
	public void disconnectFromDB() {
	System.out.println("After Test -----> Disconnect from DB");	
	}
	
	//@BeforeTest
	//public void login() {
		//System.out.println("Logging into application");
		
	@BeforeMethod 
	public void login() {
	 System.out.println("Before Method ----Logging into application");
	}
					
			@BeforeClass
			public void OpenBrowser() {
				System.out.println("Before Class ---> Open Browser ");
		
	}
	//@AfterTest
	//public void logout() {
		//System.out.println("Loggin out of application");
		
	@AfterMethod
	public void logout() {
	System.out.println("Loggin out of application");
	}
		
		@AfterClass
		public void closeBrowser() {
		System.out.println("After class----> Close Browser");
		
	}
			
@Test
	public void bookTickets() {
		System.out.println("Booking Tickets");
	}
@Test
	public void cancelTickets() {
	System.out.println("Cancelling Tickets");
	
}
@Test
	public void faxTickets() {
	System.out.println("Faxing Tickets");
}
	}


