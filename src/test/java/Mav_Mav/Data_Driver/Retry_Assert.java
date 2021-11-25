package Mav_Mav.Data_Driver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Retry_Assert {
	@Test(retryAnalyzer = MyRetry.class)
	
	private void userValidation() {
	Assert.assertEquals('S', 'S');
		
	}

}
