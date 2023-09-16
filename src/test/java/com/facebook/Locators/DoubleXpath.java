package com.facebook.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleXpath {
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
	public void doubleXpathTest() {
		driver.findElement(By.xpath("//input[@id='email'] [@name='email']")).sendKeys("dhh");
		//by default it is and condition
		//Is one of them wrong test will fail
	}
	@Test
	public void orCondition() {
		driver.findElement(By.xpath("//input[@name='pass' or @id='pass1']")).sendKeys("fsf");
		// One of is correct then it will pass
		//[@id=pass1] is wrong but its working
	}
	@Test
	public void andCondition() {
		driver.findElement(By.xpath("//button[@name='login' and @class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
		//Both has be correct
}
}
