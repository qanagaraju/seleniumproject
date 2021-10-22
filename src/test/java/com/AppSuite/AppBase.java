package com.AppSuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.AppServices.ContactFormService;
import com.AppServices.LoginService;
import com.AppUtilities.BrowserFactory;
import com.AppUtilities.CaptureScreenClass;
import com.LoginAppService.ContactFormElements;
import com.LoginAppService.LoginPageObjects;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class AppBase {
	
	public static WebDriver driver;
	public  static BrowserFactory browser;
	public static LoginPageObjects loginpage;
	public static LoginService loginappservice;
	public static ExtentReports report;
	public static ExtentTest test;
	public static CaptureScreenClass capture;
	
	public static ContactFormElements contactform;
	public static ContactFormService contact;
	
	@BeforeSuite
	public void setupSuite() {
		browser = new BrowserFactory();
		capture = new CaptureScreenClass();
		report = new ExtentReports("./AppReports/logintest.html",true);
		test=report.startTest("Login Test", "Verify login valid test and invalid test report");
		
	}
	

	@Parameters({"appname","appurl"})
	@BeforeTest
	public void launchBrowser(String appname,String appurl) {
		
		driver = browser.startbrowser(appname, appurl);
		test.log(LogStatus.INFO, "Starting Browser");
	}
	
	
	
	 @AfterTest
	    public void closeTest() {
	    	report.flush();
	    	BrowserFactory.closeBrowser();
	    	test.log(LogStatus.INFO, "Closing Browser");
	    }
	
	
	

}
