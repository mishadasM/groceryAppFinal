package com.obsqura.pages;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.obsqura.utilities.GeneralExcelUtilityLogin;
import com.obsqura.utilities.PageUtility;
import com.obsqura.utilities.TestProperties;

public class LoginPage extends PageUtility {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
        super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * This @FindsBy technique is called PageFactory Concept
	 */

	@FindBy(xpath = "//input[@placeholder='Username']")
	private WebElement Username;


	@FindBy(css ="input[placeholder='Password']")
	private WebElement Password;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitBtn;
	
	@FindBy(xpath = "(//*[contains(text(),'Dashboard')])[3]")
	private WebElement DashboardTxt;
	
	
	public void Login( ) throws IOException  {
		String username=GeneralExcelUtilityLogin.getStringData(1, 0);
		String password=GeneralExcelUtilityLogin.getStringData(1, 1);

		Username.sendKeys(username);
         Password.sendKeys(password);
		ClickElement(submitBtn);
	
	}
	
	public String ValidateLogin() {
		
		return GetElementText(DashboardTxt);
		
		
	}
	


}
