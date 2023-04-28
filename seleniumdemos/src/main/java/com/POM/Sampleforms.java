package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.example.BaseUI;

public class Sampleforms extends BaseUI {
	
	WebDriver driver;

	By subject = By.id("subject");
	By email = By.id("email");
	
	public Sampleforms(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void subject(String subjectdata) {
		sendtexttofield(subject, subjectdata);
	}
	
	public void email(String emaildata) {
		sendtexttofield(email, emaildata);
	}
}
