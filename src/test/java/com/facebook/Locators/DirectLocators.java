package com.facebook.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DirectLocators {
	WebDriver driver;
@BeforeTest
public void openFacebook() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/");
	
}

@Test
public void idLocatorsTest() {
	driver.findElement(By.id("email")).sendKeys("Hill");
}
@Test
public void nameLocatorsTest() {
	driver.findElement(By.name("pass")).sendKeys("hello");
}
@Test
public void linkTextLocatorsTest() {
	driver.findElement(By.linkText("Forgot password?")).click();
	/*<a href="https://www.facebook.com/
	recover/initiate/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjk0MzU1OTg0LCJ
	jYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&amp;
	ars=facebook_login">Forgot password?</a>
    */
	//tag=a
	//link text=>Forgot Password?<  ==between two angle (><)
}
@Test
public void partialLinkTextLocatorsTest() {
	driver.navigate().back();
	driver.findElement(By.partialLinkText("Forgot")).click();
     // If Link text is too big
	//If link Text Has space in between
	//If link text has Number in Between
	// Then it is better use partial link text
	
}
}
