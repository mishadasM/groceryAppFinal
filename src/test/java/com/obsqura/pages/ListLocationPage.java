package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;

public class ListLocationPage extends PageUtility{

	WebDriver driver;
	 public ListLocationPage(WebDriver driver) {
		 
		 super(driver);
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	
	 @FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
		private WebElement clickNew;
		
	 public void NavigateToNewLocation() {
		 
		 ClickElement(clickNew);
	 }
	 }

