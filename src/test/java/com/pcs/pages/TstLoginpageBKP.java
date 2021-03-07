/**
 *
 */
package com.pcs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Harmeet
 *This is the TC to login the page http://executeautomation.com/demosite/Login.html
 */
public class TstLoginpageBKP {

	public static WebDriver driver;

	@Test
	public void verifyvalidLogin() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://executeautomation.com/demosite/Login.html");

		/*
		 * loginPage login = new loginPage(driver); login.typeusername("Admin");
		 * login.typepassword("admin123"); login.Loginbutton();
		 */

		driver.quit();
	}

}
