package com.facebook.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathFunction {
	WebDriver driver;
	@BeforeMethod
	public void openFacebook() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void ContainLinkText() {
		driver.findElement(By.xpath("//a[contains(text(),'Forgot password?')]")).click();
	/*
	 * 
	 *a[contains((),'Forgot Password')]
	 *link = a
	 */
	}
	@Test
	public void ContainListText() {
		driver.findElement(By.xpath("//li[contains(text(),'English (US)')]")).click();
	}
	@Test
	public void getText() {
		WebElement text=driver.findElement(By.xpath("//h2[contains(text(),'Connect')]"));
		//System.out.println(text.getText());
		
		String actualText="Connect with friends and the world around you on Facebook.";
		Assert.assertEquals(actualText, text.getText(),"Did not Match");
		
	}
	
	@AfterMethod
	public void closeFacebook() {
	driver.quit();
	}
	
	}

