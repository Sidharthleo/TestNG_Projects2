package Mav_Mav.Data_Driver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Anno {
	@BeforeSuite
	private void Setup() {

		System.out.println("Browser setup");
	}
@BeforeTest
	private void Web() {

		System.out.println("Chrome launch");
	}
@BeforeClass
	private void Site() {

		System.out.println("Amazon launch");
	}
@BeforeMethod
	private void Login() {

		System.out.println("login");
	}
@Test

	private void Accessories() {

		System.out.println("Iphone");
	}
	@Test
private void model() {

	System.out.println("13");
}
@AfterMethod
	private void Home() {

		System.out.println("Amazon home");
		
	}
@AfterClass
private void log() {

	System.out.println("logout");
}

@AfterTest
private void close() {

	System.out.println("close browser");
}

}