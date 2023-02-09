package com.objectrepository;

import org.openqa.selenium.By;

public class Locators {
	public final By homepage_signinlink = By.id("jriTop_signin9");
	public final By homepage_CreateNewAccount = By.id("signup-link9");
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
	public final By DirectoryPage_SignoutButton =  By.id("jriTop_signOut");
	public final By SignInPageForgotPwdDialoguebox_EmailEditbox = By.name("forgotpass$txtEmailId");
	public final By SignInPageForgotPwdDialoguebox_GetPasswordButton = By.id("forgotpass_imgbtnSubmit");
	public final By SignInPageForgotPwdDialoguebox_EmailblankErrorMsg = By.id("forgotpass_lblError");
	public final By SignInPageForgotPwdDialoguebox_ForgotPwdSuccessMsg = By.xpath("//*[@id=\"forgotpass_lblError\"]/span/text()");
	public final By SignInPageForgotPwdDialoguebox_ForgotPwdclosebox = By.xpath("//*[@id=\"heading\"]/span/a/img");
	public final By CreateAccountpage_NameEditbox = By.id("signup_name");
	public final By CreateAccountpage_MobilenoEditbox =By.name("signup_mobileno");
	public final By CreateAccountpage_EmailEditbox = By.id("signup_email");
	public final By CreateAccountpage_PasswordEditbox = By.name("signup_password");
	public final By CreateAccountpage_Termscheckbox = By.id("checkbox");
	public final By CreateAccountpage_CreateAccountButton = By.name("imgbtnSubmit");
	public final By CreateAccountpage_NameErrorMsg = By.id("nameTD") ;
	public final By CreateAccountpage_MobileErrorMsg = By.id("mobilenoTD") ;
	public final By CreateAccountpage_EmailErrorMsg= By.id("emailTD") ;
	public final By CreateAccountpage_PasswdErrorMsg= By.id("passwordTD") ;
	public final By CreateAccountpage_TermsandConditionsErrorMsg= By.id("tdcondition") ;
	
	
	
	
	
	
	
	
}
