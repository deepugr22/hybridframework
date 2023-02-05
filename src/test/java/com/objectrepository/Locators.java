package com.objectrepository;

import org.openqa.selenium.By;

public class Locators {
	public final By homepage_signinlink = By.id("jriTop_signin9");
	public final By SigninPage_EmailEditbox = By.id("txtUserName");
	public final By SigninPage_PwdEditbox = By.name("txtPasswd");
	public final By SigninPage_CaptchaEditbox = By.name("txtCaptcha");
	public final By SigninPage_SecureSigninButton = By.name("imgbtnSignin");
	public final By SigninPage_ForgotPwdLink = By.linkText("Forgot your password?");
	public final By SigninPage_FacebookLink = By.xpath("//*[@id=\"signinpanel\"]/tbody/tr/td[3]/table/tbody/tr[2]/td/a/img");
	public final By SigninPage_GmailLink = By.xpath("//*[@id=\"signinpanel\"]/tbody/tr/td[3]/table/tbody/tr[3]/td/a/img");
	public final By SigninPage_EmailErrorMsg = By.xpath("//*[text()='Enter your email']");	
	public final By SigninPage_InvalidEmailErrorMsg = By.xpath("//*[text()='Enter valid email for login']");
	public final By SigninPage_PwdErrorMsg = By.xpath("//*[text()='Enter your password']");
	public final By SigninPage_CaptchaErrorMsg = By.xpath("//*[text()='Enter captcha properly']");
	
	
	public final By CreateAccountpage_NameEditbox = By.id("signup_name");
	public final By CreateAccountpage_MobilenoEditbox =By.name("signup_mobileno");
	//public final By CreateAccountpage_EmailEditbox = By.className("textfield-348x36 radius inputsbg");
	public final By CreateAccountpage_PasswordEditbox = By.name("signup_password");
	public final By CreateAccountpage_Termscheckbox = By.id("checkbox");
	public final By CreateAccountpage_CreateAccountButton = By.name("imgbtnSubmit");
}
