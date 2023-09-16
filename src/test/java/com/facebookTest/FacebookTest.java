package com.facebookTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTest {
WebDriver driver;// Insatance Variable
	@Test
	public void testOne() {
	System.out.println("Hello TestNG");	
	}
	@Test
	public void OpenChromeBrowser() {
		WebDriverManager.chromedriver().setup();//
		
		driver=new ChromeDriver();// open a browser
		//Open Application
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void openEdgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver= new EdgeDriver();
		driver.get("https://www.facebook.com/");
		
	}
}
