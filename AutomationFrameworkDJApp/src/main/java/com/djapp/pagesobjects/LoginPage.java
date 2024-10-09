package com.djapp.pagesobjects;

import org.openqa.selenium.By;

import com.djapp.base.BaseConfiguration;

public class LoginPage extends BaseConfiguration {

	By emailField = By.id("email");
	By passwordField = By.id("password");
	By submitButton = By.name("submit.login");
	By closeCookiesButton = By.xpath("//a[@id='cookies_alert_btn']");
	By errorMsg = By.id("loginForm15.errors");
	
	public void closeCookiesButton () {
		click(closeCookiesButton);
	} 
	public void enterUsername (String userName) {
		enterText(emailField,userName);
	}
	
	public void enterPwd (String pwd) {
		enterText(passwordField,pwd );
	}
	
	public void clickSubmit () {
		click(submitButton);
	}
	
	public String getErrorMsg () {
		waitElement(errorMsg);
		return getText(errorMsg);
	}
	
}
