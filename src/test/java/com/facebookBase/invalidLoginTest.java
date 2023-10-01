package com.facebookBase;

import org.testng.annotations.Test;

import com.facebook.pom_PageFactory.LoginPageWithPageFactory;

public class invalidLoginTest {
	public class ClientTest extends BaseTest {
		LoginPageWithPageFactory lpf;
		@Test 
		public void inValidLoginTest() {
			lpf= new LoginPageWithPageFactory(driver);
			lpf.usernameMethod("Sumon");
			lpf.passWordMethod("djhdh");
			lpf.loginButton();
		}}}

