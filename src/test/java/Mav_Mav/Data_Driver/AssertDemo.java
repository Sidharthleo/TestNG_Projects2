package Mav_Mav.Data_Driver;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	
String actual ="SidharthLeo";
String expected ="Sidharthleo";



//@Test
//private void test1() {
	//System.out.println("test1 started");
	//Assert.assertEquals(actual,expected);
    //System.out.println("test1 completed");	
//}

@Test
private void softassert() {
	SoftAssert sa =new SoftAssert();
	System.out.println("test2 started");
	sa.assertEquals(actual, expected);
	System.out.println("test2 completed");
	sa.assertAll();
	
}


}
