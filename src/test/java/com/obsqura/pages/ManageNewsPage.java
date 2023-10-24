package com.obsqura.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.obsqura.utilities.PageUtility;

public class ManageNewsPage extends PageUtility {
	WebDriver driver;

	public ManageNewsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}
	@FindBy(xpath = "(//i[@class='fas fa-edit'])[1]")
	private WebElement Newbtn;

	@FindBy(xpath = "//textarea[@placeholder='Enter the news']")
	private WebElement Textarea;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement save;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement NewsAddAlertmsg;
	
	public void Enternews() {
		ClickElement(Newbtn);
		SetTextBox(Textarea,"Weather is fine today");
		ClickElement(save);
	}
	
	public String ValidateAddNews() {
		
		return GetElementText(NewsAddAlertmsg);
		
	}
}
