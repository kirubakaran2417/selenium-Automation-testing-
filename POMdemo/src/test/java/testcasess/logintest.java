package testcasess;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import browserConfiguration.Browsersetup;
import pom.Homepage;
import utilities.Excelhandling;

public class logintest {
	@DataProvider(name = "testdata")
	public Object[][] testdata() throws IOException{
		String[][] testdata = Excelhandling.datahandling("Sheet1");
		return testdata;
	}
	
	@Test(dataProvider = "testdata")
	public void check_usernameandpassword_isenabled(String user,String pass) {
		System.out.println(user);
		System.out.println(pass);
	}	
	
}
