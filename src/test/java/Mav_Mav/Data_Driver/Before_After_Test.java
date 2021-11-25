package Mav_Mav.Data_Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Before_After_Test {
	
WebDriver driver;

@BeforeSuite
public void set() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Data_Driver\\Chrome\\chromedriver 96.exe");
	driver =new ChromeDriver();
	
}
		@Test
  public void amazon() {
	  driver.get("https://www.amazon.in/");
	
}
		@Test
		  public void fb() {
			  driver.get("https://www.facebook.in/");
			
		}
}