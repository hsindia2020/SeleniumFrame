/**
 *
 */
package com.pcs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * @author Harmeet
 *Use all the locator and elements methods used in Login page
 */
public class loginPageBKP {

	WebDriver ldriver;
	By username01 = By.xpath("//input[@name='uid']");
	By password01 = By.xpath("//input[@name='password']");
	By buttonpress = By.xpath("//input[@name='btnLogin']");

	public loginPageBKP(WebDriver driver) {
		this.ldriver=driver;
		}
		public void typeusername(String uid) {
			ldriver.findElement(username01).sendKeys(uid);
		}
		public void typepassword(String pwd) {
			ldriver.findElement(password01).sendKeys(pwd);
		}
		public void Loginbutton() {
			ldriver.findElement(buttonpress).click();
		}
}
