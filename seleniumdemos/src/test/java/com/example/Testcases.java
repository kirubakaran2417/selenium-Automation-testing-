package com.example;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.POM.Sampleforms;

import sampless.BrowserConfiguration;

public class Testcases extends BaseUI{
	WebDriver driver;
	@BeforeClass
	public void setup() {
		BrowserConfiguration.browserSetup("https://www.mycontactform.com/samples.php");
	}
	@AfterClass
	public void teardown() {
		System.out.println("closing browser");
		driver.close();
	}

	@Test
	public void testcase1() {
		//sendtexttofield();
	Sampleforms s=new Sampleforms(driver);
	s.subject("kiruba");
	}
	
	@Test
	public void testcase2() {
		System.out.println("testing the login with invalid inputs");
	}
	


}
