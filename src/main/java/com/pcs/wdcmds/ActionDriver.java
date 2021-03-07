package com.pcs.wdcmds;

/**
 * @author Harmeet
 * Extent Report Details define in Class
 */

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.pcs.config.StartBrowser;
import com.pcs.util.ConfiguratorSupport;

public class ActionDriver {

	public WebDriver driver;
	ConfiguratorSupport cs = new ConfiguratorSupport("config.properties");

	public ActionDriver() {

		driver = StartBrowser.driver01;
	}

	/**
	 * Useful for navigation to application
	 */
	public void navigatetoApplication(){
		String url = cs.getProperty("url");
		try {
			driver.get(url);
			StartBrowser.childTest.pass("Successfully Done URL :"+url);

		} catch (Exception e) {
			StartBrowser.childTest.fail("Unable to URL :"+url);
		}
	}
	/**
	 * Useful for clicking for radio, check and button
	 * @param locator -- Get it from Object repository
	 * @param eleName -- Name of element clicked
	 * @throws Exception
	 */
	public void click(By locator, String eleName) throws Exception {
		try {
			driver.findElement(locator).submit();
			StartBrowser.childTest.pass("Click Performance done: "+eleName);

		} catch (Exception e) {
			StartBrowser.childTest.fail("Click Not done: "+eleName,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot()).build());
			StartBrowser.childTest.info(e);
			throw e;
		}
	}
	/**
	 * To perform type action on textbox
	 * @param locator
	 * @param testdata
	 * @param eleName
	 * @throws Exception
	 */
	public void type(By locator,String testdata, String eleName) throws Exception {
		try {
			driver.findElement(locator).sendKeys(testdata);
			StartBrowser.childTest.pass("Type Performance done: "+eleName+ " With Data :"+testdata);
		} catch (Exception e) {
			StartBrowser.childTest.fail("Type Performance done: "+eleName+ " With Data :"+testdata,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot()).build());
			StartBrowser.childTest.info(e);
			throw e;
		}

	}
	public String screenshot(){
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);

	}
}
