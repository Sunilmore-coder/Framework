package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.learnautomation.utility.BrowserFactory;
import com.learnautomation.utility.ConfigDataProvider;
import com.learnautomation.utility.ExcelDataProvider;
import com.learnautomation.utility.Helper;

public class BaseClass {

	//Base class
	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;

	@BeforeSuite
	public void setUpSuite()

	{
		excel = new ExcelDataProvider();
		config = new ConfigDataProvider();
	}

	@BeforeClass
	public void setup() {

		driver = BrowserFactory.StartApplication(driver, config.getBrowser(), config.getStagingURL());
	}

	@AfterClass
	public void teardown() {

		BrowserFactory.QuitBrowser(driver);
	}

	@AfterMethod
	public void teardownmethod(ITestResult result)

	{
		if (result.getStatus() == ITestResult.FAILURE) {
			Helper.CaptureScreenShot(driver);
		}
	}

}
