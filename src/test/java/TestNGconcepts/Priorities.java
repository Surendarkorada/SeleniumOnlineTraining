package TestNGconcepts;

import org.testng.annotations.Test;

public class Priorities {

		@Test (priority =1)
		public void login() {
		System.out.println("Logging into application");
		}		
		@Test (priority =2)
		public void bookTickets() {
		System.out.println("Booking Tickets");
		}	
		@Test (priority = 3)
		public void logout() {
		System.out.println("Logging out from application");
		
				
	}
	
		
}
