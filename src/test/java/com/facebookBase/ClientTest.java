package com.facebookBase;

import org.testng.annotations.Test;

import com.facebook.pom_PageFactory.LoginPageWithPageFactory;
import com.facebookUtilities.PropertiesReader;

public class ClientTest extends BaseTest {
	LoginPageWithPageFactory lpf;
	PropertiesReader propertiesReader;
	@Test 
	public void validLoginTest() {
		propertiesReader=new PropertiesReader();
		lpf= new LoginPageWithPageFactory(driver);
		lpf.usernameMethod(propertiesReader.getUserName());
		lpf.passWordMethod(propertiesReader.getPassword());
		lpf.loginButton();
	}
	
}
