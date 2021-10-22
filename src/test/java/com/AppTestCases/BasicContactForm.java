package com.AppTestCases;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.AppServices.ContactFormService;
import com.AppSuite.AppBase;
import com.relevantcodes.extentreports.LogStatus;

@Listeners(appListeners.BaseListener.class)
public class BasicContactForm extends AppBase {
  
	
	
  @Parameters({"yourname","email"})
  @Test
  public void verifyContactForm(String yourname,String email) {
	  
	  contact=PageFactory.initElements(driver, ContactFormService.class);
	  contact.insertyourname(yourname).insertemail(email).clickcontactSubmit();
	 
	  test.log(LogStatus.INFO, "verify contact form details");
	  
  }
  
  
  
 
  
}
