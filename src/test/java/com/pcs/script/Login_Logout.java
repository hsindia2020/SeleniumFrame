package com.pcs.script;
import org.testng.ITestResult;
/**
 * This is the final Test Script Run...
 */
import org.testng.annotations.Test;

import com.pcs.config.StartBrowser;
import com.pcs.reuse.CommonFunctions;

public class Login_Logout extends StartBrowser{
	//	These methods are used in XML.
	public void onTestSuccess(ITestResult tr) {
		System.out.println("Listener Calling...Test Success !!!");
	}
	public void onTestFailure(ITestResult tr) {
		System.out.println("Listener Calling...Test Failure !!!");
	}
	public void onTestSkipped(ITestResult tr) {
		System.out.println("Listener Calling...Test Skipped !!!");
	}
	
  @Test
  public void testLogin_Logout() throws Exception {
	  CommonFunctions cfs = new CommonFunctions();
	  cfs.Login();
  }
}
