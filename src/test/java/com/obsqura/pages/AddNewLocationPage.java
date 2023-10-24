package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.obsqura.utilities.PageUtility;

public class AddNewLocationPage extends PageUtility {
	WebDriver driver;
	public AddNewLocationPage(WebDriver driver) {
	super(driver);
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

	 @FindBy(xpath = "//select[@id='country_id']")
		private WebElement country;

	 @FindBy(xpath = "//select[@name='state_id']")
		private WebElement state;
	 
	 @FindBy(xpath = "//input[@name='location']")
		private WebElement location;
	 
	 @FindBy(xpath = "//input[@name='delivery']")
		private WebElement deliveryCharge;
	 
	 @FindBy(xpath = "//button[@type='submit']")
		private WebElement save;
	 
	 @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
		private WebElement AddAlertmsg;
		
	 public void AddCountry() {

		 SelectFromStaticDropdown(country, "230");
	 }
	 public void AddState() {

		 
		 SelectFromStaticDropdown(state, "3817");
	 }
	 public void AddOthers(String date) {
		 SetTextBox(location, "Test2"+date);
		 SetTextBox(deliveryCharge, "100");
		 ClickElement(save);
		 
	 }
	 public String ValidateAddLocation() {
		 return GetElementText(AddAlertmsg);
		
		 
	 }
}
