package com.facebookFrameWork;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LinkTest extends BaseTest {

	@Test
	public void signupLinkTest() {
		driver.findElement(By.linkText("Sign Up"));
		String expectedTitle="";
		String actualeTitle=driver.getTitle();
		Assert.assertEquals(expectedTitle, actualeTitle);
	}
}
