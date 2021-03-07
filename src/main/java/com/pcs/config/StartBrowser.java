package com.pcs.config;



import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.pcs.util.ConfiguratorSupport;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartBrowser {

	public static WebDriver driver01;
	ConfiguratorSupport cs = new ConfiguratorSupport("config.properties");
	public static ExtentReports extent;
	public static ExtentTest parentTest;
	public static ExtentTest childTest;
	ExtentHtmlReporter htmlreporter;
	String method;

	@BeforeTest
	public void generatereport() {
		htmlreporter = new ExtentHtmlReporter("Reports/AutomationExtent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
	}

	@BeforeMethod
	public void methodName(Method method) {
		parentTest = extent.createTest(method.getName());
	}

	@BeforeClass
	public void beforeClass() {
		String browser01 = cs.getProperty("browser");
		switch (browser01) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver01 = new ChromeDriver();
			driver01.manage().window().maximize();
			driver01.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver01 = new FirefoxDriver();
			driver01.manage().window().maximize();
			driver01.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		default:
			System.out.println("Please enter the current browser name");
			break;
		}

	}

	@AfterClass
	public void afterClass() throws InterruptedException {

		Thread.sleep(4000);
		driver01.quit();
		extent.flush();
	}

}
