package com.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.sampe.pages.Homepage;
import com.sample.base.BaseUI;
import com.sample.utils.ExtentReportManager;
import com.sample.utils.ListenerUtils;

@Listeners(com.sample.utils.ListenerUtils.class)
public class Homepagetest extends BaseUI{
	public WebDriver driver;
	@BeforeTest
	public void setup() {
		driver=invokeBrowser();
		navigateToUrl("websiteURL");
	}

	@Test(priority = 1)
	public void usernametest(){
		Homepage h=new Homepage(driver,logger);
		h.enterUsername();
	}
	@Test(dependsOnMethods = "usernametest")
	public void passwordtest(){
		Homepage h=new Homepage(driver,logger);
		h.enterPassword();
	}
	@Test(dependsOnMethods = "passwordtest")
	public void sampleformstest(){
		throw new SkipException("this test has been skipped");
	}
	@AfterTest
	public void kill() {
		driver.close();
	}
	
}
