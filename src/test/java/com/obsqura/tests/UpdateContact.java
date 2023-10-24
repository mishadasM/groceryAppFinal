package com.obsqura.tests;

import java.io.IOException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.obsqura.utilities.ReadExcelUtility;
import com.obsqura.utilities.TestProperties;

import models.Person;

public class UpdateContact extends BaseTest {

	@Test(groups= {"Smoke"})
	public void UpdateContactTest() throws IOException, InterruptedException {

		lp.Login();
		hp.navigateToManageContact();
		List<Person> personList = ReadExcelUtility.ReadDataFromExcel();

		for (Person data : personList) {
			cp.EnterDataIntoForm(data);

          String alertText = cp.GetContaactUpdateAlertText().split("!")[1].trim();
			
			Assert.assertEquals(alertText, "Contact Updated Successfully");
	
			
		}
	}

}
