package Mav_Mav.Data_Driver;


import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Concept {
	@Test
	
	public void Food() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Data_Driver\\Chrome\\chromedriver 96.exe");
		
		WebDriver pizza =new ChromeDriver();
		pizza.get("https://www.dominos.co.in/");
		Thread.sleep(2000);
		System.out.println("Food");
	}
	@Test
	public void Snacks () throws Throwable {
		
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Data_Driver\\Chrome\\chromedriver 96.exe");
		
		WebDriver fried_chicken  =new ChromeDriver();
		fried_chicken.get("https://online.kfc.co.in/");
		Thread.sleep(2000);
		System.out.println("Snacks");
		
	}
	@Test
public void Icecream() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Data_Driver\\Chrome\\chromedriver 96.exe");
	

	WebDriver dessert =new ChromeDriver();
	dessert.get("https://www.baskinrobbinsindia.com/");
	Thread.sleep(2000);
	System.out.println("Icecreams");
	
	
	
	
}
	
	
	
	
}
