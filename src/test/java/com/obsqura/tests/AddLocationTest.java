package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.utilities.DateUtility;
import com.obsqura.utilities.TestProperties;

public class AddLocationTest extends BaseTest{
@Test
	public void AddMyLocation() throws IOException {
	
	
		lp.Login();
		hp.NavigateToManageLocation();
		llp.NavigateToNewLocation();
		alp.AddCountry();
		alp.AddState();
		
		String date= DateUtility.GetCurrentDate();
		alp.AddOthers(date);
		String text = alp.ValidateAddLocation().split("!")[1].trim();
		Assert.assertEquals(text, "Location Created Successfully");
	}
	
}
