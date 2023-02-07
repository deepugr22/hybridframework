package com.testscenarios;

import org.testng.annotations.Test;

import com.utilities.ReusableFunctions;

public class TS001_JRI_CreateAccount extends ReusableFunctions {
	@Test
	public void tc_01() throws Exception {
		chromeBrowserLaunch();
		getURL("JRI_HomePageURL");

	}

	@Test
	public void tc_02() throws Exception {
		clickByAnyLocator(loc.homepage_CreateNewAccount);
	}

	@Test
	public void tc_03_to_tc_08() throws Exception {
		clickByAnyLocator(loc.CreateAccountpage_CreateAccountButton);
		verifyTexttobePresent(loc.CreateAccountpage_NameErrorMsg, "NameBlankErrorMsg");
		sendKeysByAnyLocator(loc.CreateAccountpage_NameEditbox, "InvalidName");
		clickByAnyLocator(loc.CreateAccountpage_CreateAccountButton);
		verifyTexttobePresent(loc.CreateAccountpage_NameErrorMsg, "NameInvalidErrorMsg");
//clear the editbox ,enter valid data into Name Edit box
		sendKeysByAnyLocator(loc.CreateAccountpage_NameEditbox, "Name");
		
		clickByAnyLocator(loc.CreateAccountpage_CreateAccountButton);
		verifyTexttobePresent(loc.CreateAccountpage_MobileErrorMsg, "MobileBlankErrorMsg");
		sendKeysByAnyLocator(loc.CreateAccountpage_MobilenoEditbox, "InvalidMobile");
		clickByAnyLocator(loc.CreateAccountpage_CreateAccountButton);
		verifyTexttobePresent(loc.CreateAccountpage_MobileErrorMsg, "MobileInvalidErrorMsg");
		sendKeysByAnyLocator(loc.CreateAccountpage_MobilenoEditbox, "Mobile");

		clickByAnyLocator(loc.CreateAccountpage_CreateAccountButton);
		verifyTexttobePresent(loc.CreateAccountpage_EmailErrorMsg, "EmailBlankErrorMsg");
		sendKeysByAnyLocator(loc.CreateAccountpage_EmailEditbox, "InvalidFormatEmail");
		clickByAnyLocator(loc.CreateAccountpage_CreateAccountButton);
		verifyTexttobePresent(loc.CreateAccountpage_EmailErrorMsg, "EmailInvalidErrorMsg");
		sendKeysByAnyLocator(loc.CreateAccountpage_EmailEditbox, "Email");

		clickByAnyLocator(loc.CreateAccountpage_CreateAccountButton);
		verifyTexttobePresent(loc.CreateAccountpage_PasswdErrorMsg, "PasswdBlankErrorMsg");
		sendKeysByAnyLocator(loc.CreateAccountpage_PasswordEditbox, "InvalidFormatPwd");
		clickByAnyLocator(loc.CreateAccountpage_CreateAccountButton);
		verifyTexttobePresent(loc.CreateAccountpage_PasswdErrorMsg, "PasswdInvalidErrorMsg");
		sendKeysByAnyLocator(loc.CreateAccountpage_PasswordEditbox, "Passwd");
		
		clickByAnyLocator(loc.CreateAccountpage_CreateAccountButton);
		verifyTexttobePresent(loc.CreateAccountpage_TermsandConditionsErrorMsg, "TermsandConditionsBlankMsg");
		// refresh the page
		driver.navigate().refresh();

	}

	@Test
	public void tc_09() throws Exception {
		sendKeysByAnyLocator(loc.CreateAccountpage_NameEditbox, "Name");
		sendKeysByAnyLocator(loc.CreateAccountpage_MobilenoEditbox, "Mobile");
		sendKeysByAnyLocator(loc.CreateAccountpage_EmailEditbox, "Email");
		sendKeysByAnyLocator(loc.CreateAccountpage_PasswordEditbox, "Passwd");
		clickByAnyLocator(loc.CreateAccountpage_Termscheckbox);
		clickByAnyLocator(loc.CreateAccountpage_CreateAccountButton);

	}

}
