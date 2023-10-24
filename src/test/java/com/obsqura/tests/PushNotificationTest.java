package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.utilities.TestProperties;


public class PushNotificationTest extends BaseTest{

	@Test
	public void MyNotifications() throws IOException {
		
		
		
		lp.Login();
		hp.NavigateToNotification();
		pnp.Details();
		 String notificationAlertTxt=pnp.ValidateNotification().split("!")[1].trim();
		 
		
		
		Assert.assertEquals(notificationAlertTxt, "Message send successfully");
	}
}
