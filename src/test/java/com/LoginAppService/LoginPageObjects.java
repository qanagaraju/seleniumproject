package com.LoginAppService;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.AppSuite.AppBase;
import com.relevantcodes.extentreports.LogStatus;

public abstract class LoginPageObjects extends AppBase {
	
	
	@FindBy(name="user")WebElement username;
	@FindBy(name="pass")WebElement password;
	@FindBy(name="btnSubmit")WebElement submit;
	@FindBy(xpath="//*[@id=\"user_bar\"]/ul/li[1]/a")WebElement signout;
	@FindBy(id="right_col_top_err")WebElement loginerror;
	
	
	public void insertusername(String un) throws Exception {
		
		username.sendKeys(un);
		test.log(LogStatus.INFO, "Enter user name",test.addScreenCapture(capture.screenCapture(driver, username, "PassEditField")));
		capture.screenCapture(driver, username, "UserEditField");
		
	}
	
	
	public void insertpassword(String pw) throws Exception {
		password.sendKeys(pw);
		test.log(LogStatus.INFO, "Enter password",test.addScreenCapture(capture.screenCapture(driver, password, "PassEditField")));
		
			capture.screenCapture(driver, password, "PassEditField");
		
	}
	
	
	public void clicksubmit() throws Exception {
		
		if(submit.isEnabled()) {
			submit.click();
			test.log(LogStatus.PASS, "Submit button success");
		}
		else {
			test.log(LogStatus.FAIL, "Step fail");
			
			try {
				
				capture.screenCapture(driver, submit, "Submit Button");
				System.out.println(loginerror.getText());
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			
		}
		
		
	}
	
	public void clicksignout() {
		
		if(signout.isEnabled()) {
			signout.click();
			
			System.out.println("Login Success");
			
		}
		
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
