package com.AppServices;

import com.LoginAppService.ContactFormElements;

public class ContactFormService extends ContactFormElements {
	
	
	
	public ContactFormService insertyourname(String yn) {
		insert_your_name(yn);
		return this;
	}
	
	
	public ContactFormService insertemail(String mail) {
		insert_email(mail);
		return this;
	}
	
	
	public ContactFormService clickcontactSubmit() {
		click_contact_submit();
		return this;
	}
	

}
