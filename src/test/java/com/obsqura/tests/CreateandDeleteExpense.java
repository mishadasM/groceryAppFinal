package com.obsqura.tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.obsqura.utilities.DateUtility;
import com.obsqura.utilities.TestProperties;



public class CreateandDeleteExpense  extends BaseTest{
	
	@Test(groups= {"Sanity"})
	public void MyCreateDeleteExpense() throws IOException {
		
		lp.Login();
		hp.NavigateToManageExpense();
	
		String date=DateUtility.GetCurrentDate();
		ecp.CreateUniqueTitle(date);
		String textAlert = ecp.ValidateUniqueNameIsCreated().split("!")[1].trim();
		
		Assert.assertEquals(textAlert, "Expense Category Created Successfully");
		
        String text = ecp.DeleteExpenseCategory(date).split("!")[1].trim();
	    
		Assert.assertEquals(text, "Expense Category Deleted Successfully");
		}
	}



