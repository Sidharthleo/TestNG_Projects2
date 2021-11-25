package Mav_Mav.Data_Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Concept {
	
	@Parameters({"username","password"})
    @Test
	private void login() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Data_Driver\\Chrome\\chromedriver 96.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("Enetered Into Facebook");
		
		
		WebElement mail = driver.findElement(By.id("email"));
		mail.sendKeys("9597216599");
		
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("sidhuleodevil");
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		Thread.sleep(3000);
		
		
	
		
		
		
		
		
		
	}
}
