package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;

public class HomePage extends PageUtility {

	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//*[contains(text(),'Manage Product')]")
	private WebElement manageProduct;
	
	@FindBy(xpath = "(//*[contains(text(),'Manage Expense')])[1]")
	private WebElement manageExpenseDropdown;
	
	@FindBy(xpath = "(//*[normalize-space() = 'Expense Category'])[1]")
	private WebElement manageExpense;
	
	@FindBy(xpath = "//*[contains(text(),'Manage Delivery Boy')]")
	private WebElement manageDeliveryBoy;
	
	@FindBy(xpath = "//p[normalize-space()='Manage Content']")
	private WebElement manageContent;
	
	@FindBy(xpath = "//p[normalize-space()='Manage Contact']")
	private WebElement manageContact;
	
	@FindBy(xpath = "//i[@class='nav-icon fas fa-credit-card']")
	private WebElement managePayment;
	
	
	@FindBy(xpath = "//i[@class='nav-icon fas fa-fas fa-bell']")
	private WebElement pushNotifications;
	
	@FindBy(xpath = "//i[@class='nav-icon fas fa-users']")
	private WebElement adminUsers;
	
	@FindBy(xpath = "//i[@class='nav-icon fas fa-map-marker']")
	private WebElement manageLocation;
	
	
	

	@FindBy(xpath = "(//i[@class='far fa-circle nav-icon'])[12]")
	private WebElement manageNews;
	
	
	

	public void NavigateToManageProduct() {
		ClickElement(manageProduct);
	}
	
	public void NavigateTo_ManageDeliverBoy() {
		ClickElement(manageDeliveryBoy);
	}
	
	public void navigateToManageContact() {
		ClickElement(manageContent);
		ClickElement(manageContact);
	}
	public void NavigateToManageExpense() {
		ClickElement(manageExpenseDropdown);
		ClickElement(manageExpense);
	}
	public void NavigateToPayment() {
		ClickElement(managePayment);
	
	}
	public void NavigateToNotification() {
		ClickElement(pushNotifications);
	
	}
	public void NavigateToAdminUsers() {
		ClickElement(adminUsers);
	
	}
	public void NavigateToManageLocation() {
		ClickElement(manageLocation);
	
	}
	
	
	public void NavigateToNews() {
		ClickElement(manageContent);
		ClickElement(manageNews);
	}
}
