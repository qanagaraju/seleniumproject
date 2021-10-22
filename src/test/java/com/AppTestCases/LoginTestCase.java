package com.AppTestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.AppServices.LoginService;
import com.AppSuite.AppBase;
import com.AppUtilities.BrowserFactory;
import com.LoginAppService.LoginPageObjects;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


@Listeners(appListeners.BaseListener.class)
public class LoginTestCase extends AppBase
{
	
	
	
	@Parameters({"username","password"})
    @Test(priority=1,description="valid login test")
    public void verifyValidloginTest(String username,String password)
    {
    	loginappservice= PageFactory.initElements(driver, LoginService.class);
    	
    	try {
			loginappservice.getusername(username).getpassword(password).getsubmitbutton().getsignout();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	test.log(LogStatus.INFO, "verify valid login test");
    	
    }
    
	@Parameters({"uname","password"})
    @Test(priority=2,description="Invalid login test")
    public void verifyInvalidLogin(String uname,String password) {
    
    	loginappservice= PageFactory.initElements(driver, LoginService.class);
    	
    	try {
			loginappservice.getusername(uname).getpassword(password).clicksubmit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    

	 
	    
  
    
}
