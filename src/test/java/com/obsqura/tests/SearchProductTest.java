package com.obsqura.tests;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.utilities.TestProperties;

public class SearchProductTest extends BaseTest {

	
	@Test(groups= {"Regression"})
	public void MySearchProductTest() throws IOException {
		
		
		
		lp.Login();
		hp.NavigateToManageProduct();
		pp.ClickSearchBtn();
		
		
		String productName = TestProperties.GetProperties().getProperty("productName");
		String text=pp.ValidateSearchProduct(productName);
		

		Assert.assertEquals(text, productName);
		
	}
}
