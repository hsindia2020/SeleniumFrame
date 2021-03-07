package com.pcs.objectrepo;

import org.openqa.selenium.By;

public class loginpage {

	public static By txtUserName = By.cssSelector("#j_username");
	public static By txtPassword = By.cssSelector("#j_password");
	public static By btnSignin = By
			.xpath("//body/div[@id='wrapper']/main[@id='content']/div[3]/div[1]/form[1]/div[4]/button[1]");
}
