package com.LoginAppService;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactFormElements {
	
	
	@FindBy(name="q[1]")WebElement yourname;
	@FindBy(name="email")WebElement email;
	@FindBy(name="submit")WebElement submit;
	
	
	public void insert_your_name(String yname) {
		
				
		yourname.sendKeys(yname);
	}
	
	public void insert_email(String mymail) {
		email.sendKeys(mymail);
	}
	
	public void click_contact_submit() {
		
		submit.click();
	}

}
