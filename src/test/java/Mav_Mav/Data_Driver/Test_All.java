package Mav_Mav.Data_Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test_All {
	WebDriver driver;
	
	@Test(priority =1,  groups = "Songs")
	public void Youtube() throws Throwable {
		
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Data_Driver\\Chrome\\chromedriver 96.exe");
        driver =new ChromeDriver();
        
        driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();
        System.out.println("Music");
        Thread.sleep(8000);
        
        WebElement Search = driver.findElement(By.xpath("(//input[@aria-label='Search'])"));
        Search.sendKeys("kaattrukulle");
        System.out.println("Yuvan Shankar Raja");
        Thread.sleep(5000);
		
	}


	@Test(priority = 0, groups = "Foods")
     public void Food() throws Throwable {
		
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Data_Driver\\Chrome\\chromedriver 96.exe");
    	 driver =new ChromeDriver();
    	 driver.get("https://www.zomato.com/");
    	 Thread.sleep(2000); 
    	 System.out.println("Foods");
    	
    	 
    }  
	@Test(priority = -1, groups = "Social",invocationCount = 2)
      public void Insta() throws Throwable {
    	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Data_Driver\\Chrome\\chromedriver 96.exe");
     	 driver =new ChromeDriver();
     	 driver.get("https://www.instagram.com/");
     	 Thread.sleep(2000);
     	 System.out.println("Social Media");
     	 
 
    } 
        
	@Test(priority = -2, groups = "Social_Fb")
    public void Facebook() throws Throwable {
  	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Data_Driver\\Chrome\\chromedriver 96.exe");
   	 driver =new ChromeDriver();
   	 driver.get("https://www.facebook.com/");
   	 System.out.println("Social Media Fb");
   	 Thread.sleep(1000);
   	 System.out.println("Social Media Fb");
	}
	@Test(priority =2,timeOut = 20000)
	public void Whatsapp() throws Throwable {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\Data_Driver\\Chrome\\chromedriver 96.exe");
	   	 driver =new ChromeDriver();
	   	 driver.get("https://www.whatsapp.com/");
	   	 
	}
	
	
}        
  
        
	


	


