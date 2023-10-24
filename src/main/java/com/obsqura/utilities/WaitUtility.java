package com.obsqura.utilities;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	static WebDriver driver;
	
	public WaitUtility(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
public   void WaitUntilClickable(WebElement element) {	
	  WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(8));
		wait.until(ExpectedConditions.elementToBeClickable(element));				
		
	}
	public static void PresenceOfElement(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(8));
	wait.until(ExpectedConditions.presenceOfElementLocated((By) element));
	}
	
	public static void waitForPresenceOfAllElementsLocated(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(8));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By) element));
		}
	
	public static void WaitUntilText(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(8));
		wait.until(ExpectedConditions.textToBePresentInElement(element, null));
	}
	public static void WaitUntilVisibility(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(8));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public static void WaitUntilAttributeContains(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(8));
		wait.until(ExpectedConditions.attributeContains(element, null, null));
	}
	
	public static void FluentWaitForElementClickable(WebElement element) {
	
	FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).
			  withTimeout(Duration.ofSeconds(8)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
		wait1.until(ExpectedConditions.elementToBeClickable(element));	  
	}
	public void FluentWaitUntilText(WebElement element) {
		FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).
				  withTimeout(Duration.ofSeconds(8)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
			wait1.until(ExpectedConditions.textToBePresentInElement(element, null));	  
		}
	public void FluentWaitPresenceOfElement(WebElement element) {
		FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).
				  withTimeout(Duration.ofSeconds(8)).pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
			wait1.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By) element));  
		}
}
