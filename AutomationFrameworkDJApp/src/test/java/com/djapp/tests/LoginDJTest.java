package com.djapp.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

import com.djapp.pagesobjects.LoginPage;
import com.djapp.pagesobjects.WelcomePage;

public class LoginDJTest {

	
	LoginPage lg=new LoginPage();
	WelcomePage wp=new WelcomePage();
	

	/*@Test
	public void validateSuccessLoginDJApp() {
		
		
		lg.closeCookiesButton();
		lg.enterUsername("qa_testJS01@circaworks.com");
		lg.enterPwd("Iceman#12");
		lg.clickSubmit();
		
		//validating we are on the WelcomePage
		Assert.assertEquals(wp.isPresentTabGeneral(), true);	
	}*/
	
	
	@Test
	public void validateEmptyCredencialsDJApp() {
		
		lg.closeCookiesButton();
		lg.enterUsername("");
		lg.enterPwd("");
		lg.clickSubmit();
		
		//validating we are on the WelcomePage
		Assert.assertEquals(lg.getErrorMsg(), "Incorrect email or password. Please verify them and try again");	
	}
	
	@Test
	public void validateEmptyEmailNoPwdDJApp() {		
		
		lg.enterUsername("qa_testJS01@circaworks.com");
		lg.enterPwd("");
		lg.clickSubmit();
		
		//validating we are on the WelcomePage
		Assert.assertEquals(lg.getErrorMsg(), "Incorrect email or password. Please verify them and try again");	
	}
	
	@Test
	public void validateNoEmailAndPwdDJApp() {		
		
		lg.enterUsername("");
		lg.enterPwd("Iceman#12");
		lg.clickSubmit();
		
		//validating we are on the WelcomePage
		Assert.assertEquals(lg.getErrorMsg(), "Incorrect email or password. Please verify them and try again");	
	}
	
	@AfterSuite
	public void closeApp() {
		
		lg.closeApp();
	}
}
