package com.sample.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browsersetup {
	public static WebDriver driver;
	public static WebDriver getChromedriver() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Workspaces\\Techforum5\\SeleniumDemos\\Driver\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		options.addArguments("--headless");

		 driver=new ChromeDriver(options);
		//to maximize my screen
		driver.manage().window().maximize();;
		return driver;
	}
	public static WebDriver getFirefoxdriver() {return null;}
	public static WebDriver getEdgedriver() {return null;}
	
}
