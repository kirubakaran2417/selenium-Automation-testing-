package com.sampe.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.sample.base.BaseUI;

public class Homepage extends BaseUI {
	public ExtentTest logger;
	public WebDriver driver;
	
	By username=getLocator("username_id");
	By password=getLocator("password_xpath");
	By sampleforms=getLocator("sampleforms_linktext");
	public Homepage() {
	}
	public Homepage(WebDriver driver) {

		this.driver = driver;
	}
	public Homepage(WebDriver driver,ExtentTest logger) {

		this.driver = driver;
		this.logger = logger;
	}
	
	
	public void enterUsername() {
		sendText(username, "kiruba");
		logger.log(Status.INFO, "username is entered in usernametextbox");
	}
	public void enterPassword() {
		sendText(password, "kiruba123");
		logger.log(Status.INFO, "password is entered in passwordtextbox");
	}
	public void clickSampleforms() {
		clickOn(sampleforms, Duration.ofSeconds(30));
		logger.log(Status.INFO, "sampleforms clicked");
	}
}
