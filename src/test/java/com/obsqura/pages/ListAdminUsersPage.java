package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.obsqura.utilities.PageUtility;
import com.obsqura.utilities.RandomUtility;

public class ListAdminUsersPage extends PageUtility{
	WebDriver driver;

	public ListAdminUsersPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath = "(//i[@class='fas fa-edit'])[1]")
	private WebElement New;
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath = "//select[@name='user_type']")
	private WebElement dropdown;
	
	@FindBy(xpath = "//button[@name='Create']")
	private WebElement save;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement AddAlertMsg;
	
	public void NavigateToNewAdmin() {
		ClickElement(New);
	}
	public void AddDetails() {
	  int random=RandomUtility.RandomNumber();
		SetTextBox(username,"client" + random );
	SetTextBox(password,"client1" + random);
	ClickElement(dropdown);
	SelectFromStaticDropdown(dropdown,"admin");
	ClickElement(save);
		
	}
	public String Validation() {
		return GetElementText(AddAlertMsg);
		
		
	}
}
