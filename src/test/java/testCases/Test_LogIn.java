package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Dashboard;
import pageObjects.Login;
import testBase.BaseClass;

public class Test_LogIn extends BaseClass{
	
	@Test
	public void logIn() {
		logger.info("Starting Test_LogIn");
		try {
			
			
			Login li=new Login(driver);
			logger.info("setting username");
			li.setUsername(rb.getString("username"));
			logger.info("setting password");
			li.setPassword(rb.getString("password"));
			logger.info("click on login");
			li.clickLogin();
		
			Dashboard db=new Dashboard(driver);
			
			String text=db.checkDash();
			Assert.assertEquals(text, "Dashboard");
			logger.info("successfully login");
		}catch(Exception e) {
			Assert.fail();
			logger.error("test failed");
		}
	}

}
