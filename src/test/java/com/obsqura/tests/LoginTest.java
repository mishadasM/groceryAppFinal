package com.obsqura.tests;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.pages.LoginPage;
import com.obsqura.utilities.GeneralExcelUtilityLogin;
import com.obsqura.utilities.TestProperties;


public class LoginTest extends BaseTest {
	

	@Test(groups= {"Smoke"})
	public void MyLoginTest() throws IOException {
			
			
		LoginPage lp = new LoginPage(driver);
		
			
		lp.Login();
		
		String text=lp.ValidateLogin();
		
		
		Assert.assertEquals(text, "Dashboard");
	    
	}
}
