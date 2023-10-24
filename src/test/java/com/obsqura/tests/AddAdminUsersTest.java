package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.utilities.DateUtility;
import com.obsqura.utilities.TestProperties;
@Test
public class AddAdminUsersTest extends BaseTest{

public void AddMyAdminUser() throws IOException {
	
	
	lp.Login();
	hp.NavigateToAdminUsers();
	aup.NavigateToNewAdmin();
	
	aup.AddDetails();
	String text = aup.Validation().split("!")[1].trim();
	Assert.assertEquals(text, "User Created Successfully");
	
	}
	}


