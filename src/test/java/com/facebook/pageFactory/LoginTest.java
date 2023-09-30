package com.facebook.pageFactory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	WebDriver driver;
	String userNameId="email"; // Creating variable for userNameId replace"email"
	String passWordId="pass";
	String loginButton="login";

	@BeforeMethod
	public void openApp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");

	}

//@Test
	public void validloginTest() { // Soner call - same thing doing again and again.
		findById(userNameId).sendKeys("gggh");
		findById(passWordId).sendKeys("hghg");
		findById(loginButton).click();

	}

//@Test
	public void inValidloginTest() { // Soner call - same thing doing again and again.
		findById(userNameId).sendKeys("gggh");
		findById(passWordId).sendKeys("hghg");
		findById(loginButton).click();

	} // We are using driver for find element so many times

	@Test
	public void boundryloginTest() {
		findById(userNameId).sendKeys("gggh");
		findById(passWordId).sendKeys("hghg");
		findById(loginButton).click();
	}

	public WebElement findById(String id) { // helper method - doesn;t have any @Test annotations
		return driver.findElement(By.id(id)); // if we put this helper method then we don;t need to put the driver so many times
	}
}
