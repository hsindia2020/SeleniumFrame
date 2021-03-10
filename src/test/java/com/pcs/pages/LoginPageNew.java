/**
 *
 */
package com.pcs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author Harmeet
 *
 */

public class LoginPageNew {

	WebDriver driver;
	public LoginPageNew(WebDriver ldriver) {
		this.driver = ldriver;
	}

	@FindBy(xpath="//input[@name='uid']") WebElement username;
	@FindBy(how = How.XPATH, using = "//input[@name='pwd']")
	WebElement password;
	@FindBy(how=How.XPATH,using ="//input[@name='btnLogin']") WebElement submit_btn;
	@FindBy(how=How.LINK_TEXT,using="Login") WebElement Login_txt;

	public void login_page(String uid, String pwd) {
		username.sendKeys(uid);
		password.sendKeys(pwd);
		submit_btn.click();
	}
}
