package com.AppServices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.LoginAppService.LoginPageObjects;

public class LoginService extends LoginPageObjects {
	
	
	static WebDriver driver;
	
	public LoginService getusername(String uname) throws Exception {
		
		
		insertusername(uname);
		
		return this;
	}
	
	
	public LoginService getpassword(String pword) throws Exception {
		
		insertpassword(pword);
		return this;
	}
	
	public LoginService getsubmitbutton() throws Exception {
	
		clicksubmit();
		return this;
	}
	

	public LoginService getsignout() {
		
		clicksignout();
		return this;
	}
	
}
