package com.sample.base;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.sample.utils.DateUtils;
import com.sample.utils.FIleIO;

public class BaseUI {
	
	public static WebDriver driver;
	public static Properties prop;
	public static String browser_choice;
	public static ExtentReports report;
	public static String timestamp=DateUtils.getTimeStamp();
	public static ExtentTest logger;
	public BaseUI() {
		prop = FIleIO.initProperties();
	}

	/************** Invoke Browser ****************/
	public static WebDriver invokeBrowser() {
		browser_choice = prop.getProperty("browserName");
		try {
			if (browser_choice.equalsIgnoreCase("firefox")) {
				driver = Browsersetup.getFirefoxdriver();
			} else if (browser_choice.equalsIgnoreCase("msedge")) {
				driver = Browsersetup.getEdgedriver();
			} else if (browser_choice.equalsIgnoreCase("chrome")){
				driver = Browsersetup.getChromedriver();
			} else{
				throw new Exception("Invalid browser name provided in property file");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return driver;
	}
	/************** Open website URL ****************/
	public static void navigateToUrl(String websiteUrlKey) {
		try {			
			driver.get(prop.getProperty(websiteUrlKey));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	/**************** Get By locator using locator key ****************/
	public static By getLocator(String locatorKey) {
		if (locatorKey.endsWith("_id")) {
			return By.id(prop.getProperty(locatorKey));
		}
		if (locatorKey.endsWith("_name")) {
			return (By.name(prop.getProperty(locatorKey)));
		}
		if (locatorKey.endsWith("_className")) {
			return (By.className(prop.getProperty(locatorKey)));
		}
		if (locatorKey.endsWith("_xpath")) {
			return (By.xpath(prop.getProperty(locatorKey)));
		}
		if (locatorKey.endsWith("_css")) {
			return (By.cssSelector(prop.getProperty(locatorKey)));
		}
		if (locatorKey.endsWith("_linkText")) {
			return (By.linkText(prop.getProperty(locatorKey)));
		}
		if (locatorKey.endsWith("_partialLinkText")) {
			return (By.partialLinkText(prop.getProperty(locatorKey)));
		}
		if (locatorKey.endsWith("_tagName")) {
			return (By.tagName(prop.getProperty(locatorKey)));
		}

		return null;
	}

	/************** Check if an element is present ****************/
	public static boolean isElementPresent(By locator, Duration timeout) {
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(locator));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/************** Send text to an element ****************/
	public static void sendText(By locator, String text) {
		try {
			new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.presenceOfElementLocated(locator));
			driver.findElement(locator).sendKeys(text);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	public static void clickOn(By locator, Duration timeout) {
		try {
			new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(locator));
			driver.findElement(locator).click();;
		} catch (Exception e) {
			e.printStackTrace();
		
	}
	}
}

