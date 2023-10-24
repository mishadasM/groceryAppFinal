package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.utilities.TestProperties;

public class AddNewsTest extends BaseTest {
	
	@Test
	public void AddMyNews() throws IOException {
		
		lp.Login();
		hp.NavigateToNews();
		mnp.Enternews();
		String msgtxt=mnp.ValidateAddNews().split("!")[1].trim();
		
		Assert.assertEquals(msgtxt, "News Created Successfully");
	}

}
