package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.utilities.DateUtility;
import com.obsqura.utilities.TestProperties;

public class CreateDeliveryBoy extends BaseTest{
@Test(groups= {"Regression"})
	public void CreateDeliveryBoyTest() throws InterruptedException, IOException {
	
	
	lp.Login();
	hp.NavigateTo_ManageDeliverBoy();;
	String date= DateUtility.GetCurrentDate();
	ldp.CreateDeliveryBoy(date);
	String text = ldp.ValidateDeliveryBoyIsCreated().split("!")[1].trim();
	
	
	Assert.assertEquals(text, "Delivery Boy Details Created Successfully");
    	
	
    
	
	}
}
