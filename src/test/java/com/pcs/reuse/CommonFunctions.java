package com.pcs.reuse;

import org.openqa.selenium.WebDriver;

import com.pcs.config.StartBrowser;
import com.pcs.objectrepo.loginpage;
import com.pcs.wdcmds.ActionDriver;

public class CommonFunctions {

	public WebDriver driver;
	public ActionDriver aDriver;

	public CommonFunctions() {

//		driver = StartBrowser.driver01;
		aDriver = new ActionDriver();
	}

	public void Login() throws Exception {

		StartBrowser.childTest = StartBrowser.parentTest.createNode("LogIn to New Tour application");
		aDriver.navigatetoApplication();
		aDriver.type(loginpage.txtUserName, "mngr282098@mail.com", "User text field");
		aDriver.type(loginpage.txtPassword, "ybepAbU1324", "Password field");
		aDriver.click(loginpage.btnSignin, "Sign In Button clicked");
	}
}
