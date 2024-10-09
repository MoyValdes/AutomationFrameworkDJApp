package com.djapp.pagesobjects;

import org.openqa.selenium.By;

import com.djapp.base.BaseConfiguration;

public class WelcomePage extends BaseConfiguration {

	By tabsContainer = By.id("tab-nav-2");
	
	public boolean isPresentTabGeneral() {
		waitElement(tabsContainer);
		return findElement(tabsContainer)!=null;
	}
	
}
