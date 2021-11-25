package Mav_Mav.Data_Driver;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority = 1)
	private void facebook() {
		System.out.println("Facebook launch");
		
		
	}
	@Test(priority = 3)
	private void telegram() {
		System.out.println("Telegram launch");
	}
	@Test(priority =-2)
	private void instagram() {
		System.out.println("Instagram launch");
		
	}
	@Test(priority = 2)
	private void schat() {
		System.out.println("Snapchat launch");
	}
	@Test(priority = -1)
	private void whatsapp_web() {
		System.out.println("Whatsapp launch");
	}
	@Test(priority = 0)
	private void skype() {
		System.out.println("Skype launch");
	}
	
}
