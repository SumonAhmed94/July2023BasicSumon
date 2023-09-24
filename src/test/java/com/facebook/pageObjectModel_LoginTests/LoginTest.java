package com.facebook.pageObjectModel_LoginTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.facebook.pageObjectModel_LoginPages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	
	WebDriver driver;
	LoginPage loginPage; //building has relationship with loginpage
	@BeforeMethod
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
	}
	@Test(priority=1)
	public void validLoginTest() {
		loginPage=new LoginPage(driver); //Has a relationship
		loginPage.userName("sumon");
		loginPage.passWord("hddha");
		loginPage.clickLoginButton();
		
	}
	@Test(priority=2)
	public void invalidLoginTest() {
		loginPage=new LoginPage(driver); //Has a relationship
		loginPage.userName("sumon");
		loginPage.passWord("hddha");
		loginPage.clickLoginButton();
}
	@AfterMethod
	public void closeApp() {
	if(driver !=null) {
		driver.quit();
	}
		
		
	}
	
	
	
}
