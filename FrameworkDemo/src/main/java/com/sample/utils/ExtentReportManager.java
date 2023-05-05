package com.sample.utils;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.sample.base.BaseUI;

public class ExtentReportManager  {

		public static ExtentReports extent;
		public static ExtentSparkReporter htmlReporter;

		/************** Getting report instance for Extent Report ****************/
	
		public static ExtentReports getReportInstance() {
			String repName = "TestReport"+BaseUI.timestamp+".html";
			htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir")
					+ "/CustomReports/" + repName);
			htmlReporter.config().setDocumentTitle("Automation Report");
			htmlReporter.config().setReportName("Mycontactform report");
			htmlReporter.config().setTheme(Theme.DARK);
			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			return extent;
		}
	}

