package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;

public class PushNotificationsPage extends PageUtility {
	WebDriver driver;
	 public PushNotificationsPage(WebDriver driver) {
		 
		 super(driver);
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	
	 @FindBy(xpath = "//input[@placeholder='Enter Title']")
		private WebElement title;
	 
	 @FindBy(xpath = "//input[@placeholder='Enter Description']")
		private WebElement description;
	 
	 @FindBy(xpath = "//button[@name='create']")
		private WebElement send;
	 
	 
	 @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
		private WebElement sendMsgalert;
	 
	 public void Details() {
		 SetTextBox(title,"Grocery");
		 SetTextBox(description,"Selected grocery items added to cart");
		 ClickElement(send);
		 
	 }
	 public String ValidateNotification() {
		 return GetElementText(sendMsgalert);
		
	 }
}
