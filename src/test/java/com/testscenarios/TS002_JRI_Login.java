package com.testscenarios;

import org.testng.annotations.Test;

import com.utilities.ReusableFunctions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.AfterClass;

public class TS002_JRI_Login extends ReusableFunctions {

	@Test
	public void tc_10() throws Exception {
		chromeBrowserLaunch();
		getURL("JRI_HomePageURL");

	}

	@Test
	public void tc_11() throws Exception {
		clickByAnyLocator(loc.homepage_signinlink);
	

	}

	@Test
	public void tc_12() {
    verifyWebElement(loc.SigninPage_EmailEditbox);
    verifyWebElement(loc.SigninPage_PwdEditbox);
    verifyWebElement(loc.SigninPage_CaptchaEditbox);
    verifyWebElement(loc.SigninPage_FacebookLink);
    verifyWebElement(loc.SigninPage_ForgotPwdLink);
    verifyWebElement(loc.SigninPage_GmailLink);
    verifyWebElement(loc.SigninPage_SecureSigninButton);
    
   System.out.println("************************");
  // verifyElementsInListEquals(loc.SigninPage_CaptchaEditbox);
   
	}
	
	@Test
	public void tc_13() throws Exception {
		clickByAnyLocator(loc.SigninPage_SecureSigninButton);
		implicitWait(10);
		verifyTexttobePresent(loc.SigninPage_EmailErrorMsg, "EmailErrorMsg");
		sendKeysByAnyLocator(loc.SigninPage_EmailEditbox, "InvalidFormatEmail");
		clickByAnyLocator(loc.SigninPage_SecureSigninButton);
		Thread.sleep(3000);
		verifyTexttobePresent(loc.SigninPage_InvalidEmailErrorMsg, "InvalidEmailErrorMsg");
		implicitWait(5);
		sendKeysByAnyLocator(loc.SigninPage_EmailEditbox, "ValidFormatEmail");
		clickByAnyLocator(loc.SigninPage_SecureSigninButton);
		verifyTexttobePresent(loc.SigninPage_PwdErrorMsg, "PwdErrorMsg");
		sendKeysByAnyLocator(loc.SigninPage_PwdEditbox, "InvalidFormatPwd");
		clickByAnyLocator(loc.SigninPage_SecureSigninButton);
		verifyTexttobePresent(loc.SigninPage_CaptchaErrorMsg, "CaptchaErrorMsg");
		
		
		
		
	}
}
