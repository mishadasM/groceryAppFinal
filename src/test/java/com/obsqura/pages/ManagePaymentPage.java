package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;

public class ManagePaymentPage extends PageUtility{

	WebDriver driver;

	public ManagePaymentPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "(//a[@role='button'])[2]")
	private WebElement editpayment;
	
	
	@FindBy(xpath = "//input[@name='name']")
	private WebElement name;
	
	@FindBy(xpath = "//input[@name='limit']")
	private WebElement limit;
	
	@FindBy(xpath = "//button[@name='Update']")
	private WebElement update;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement updateAlertmsg;
	
	
	public void EditPaymentMethod() {
		
		ClickElement(editpayment);
		name.clear();
		SetTextBox(name,"SBI");
		limit.clear();
		SetTextBox(limit, "8000");
	    ClickElement(update);
	}
	public String ValidationOfPayment() {
		return GetElementText(updateAlertmsg);
		
	}
	
}
