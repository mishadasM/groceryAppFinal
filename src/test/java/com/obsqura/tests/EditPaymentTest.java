package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.utilities.TestProperties;


public class EditPaymentTest extends BaseTest {
	@Test
	public void EditMyPayment() throws IOException {
		
		lp.Login();
		hp.NavigateToPayment();
		mpp.EditPaymentMethod();
		
		String updatemsgtxt=mpp.ValidationOfPayment().split("!")[1].trim();
		
		Assert.assertEquals(updatemsgtxt, "Payment Method Updated Successfully");
	}

}
