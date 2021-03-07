package com.pcs.pagesHelper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	WebDriver driver;
	public void startBrowser(String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		} else if(BrowserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
	}
	
}
