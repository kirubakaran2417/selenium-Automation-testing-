package testcasess;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import browserConfiguration.Browsersetup;
import pom.Homepage;

public class homepagetest {
	
	WebDriver driver;

	@BeforeTest
	public void setup() {
		System.out.println("Browser open");
	}
	
	@Test(enabled = false)
	public void check_usernameandpassword_isenabled() {
		System.out.println("testcase1");
	}	
	@Test(dependsOnMethods = "entervalid_details",groups="valid")
	public void check_usernameandpassword_isdisplayed() {
		System.out.println("testcase2");
	}
	@Test(priority = 1,groups = "valid")
	public void entervalid_details() {
		System.out.println("testcase3");
	}
	@Test(priority = 1,groups = "invalid")
	public void enterinvalid_details() {
		System.out.println("testcase4");
	}
	@Test(priority = 1,groups = {"valid", "invalid"})
	public void null_details() {
		System.out.println("testcase4");
	}
}
