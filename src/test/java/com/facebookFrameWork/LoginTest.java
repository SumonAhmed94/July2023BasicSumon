package com.facebookFrameWork;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Test(priority=0)
	public void validLoginTest() {
		driver.findElement(By.id("email")).sendKeys("Sumon");
		driver.findElement(By.name("pass")).sendKeys("Ahmed");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	
}
	@Test(priority=1)
	public void invalidLoginTest() {
		driver.findElement(By.id("email")).sendKeys("Sumon");
		driver.findElement(By.name("pass")).sendKeys("Ahmed");
		driver.findElement(By.xpath("//button[@name='login']")).click();
}
	
}