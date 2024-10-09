package com.djapp.base;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BaseConfiguration {

	
	static WebDriver driver =null;
	static String url ="https://qa.diversityjobs.com/main/static/signIn";
	
	
	public BaseConfiguration () {
		
		if(driver==null) {
			System.out.println("-------Browser Session Started------");
		    ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
	        driver.get(url);
	        
	        System.out.println("-------Application Started : " + url);
		}
		
	}
	
	protected List<WebElement> findElements(By locator) {
		return driver.findElements(locator);
	}
	
	protected void click(By locator) {
		 driver.findElement(locator).click();
	}
	protected void enterText(By locator,String text) {
		 driver.findElement(locator).sendKeys(text);
	}
	
	protected WebElement findElement(By locator) {
		
		return driver.findElement(locator);
	}
	
	
    protected String getText(By locator) {
		
		return driver.findElement(locator).getText();
	}

	protected void waitElement(By locator) {
		
		 WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		 Wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void closeApp () {
		
        driver.quit();
        System.out.println("-------Application Closed : " + url);
	}
	
	
}
