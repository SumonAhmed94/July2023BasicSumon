package com.facebook.pageObjectModel_LoginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	/**
	 * // instance variable
	 */
	WebDriver driver;

	/**
	 * @param driver user define constructor for POM
	 */
	public LoginPage(WebDriver driver) { // User Define Constructor
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this); // this line design for POM
	}

	public WebElement userName(String enterYourUserName) {
		// driver.findElement(By.cssSelector("[id='email'")).sendKeys("Sumon");
		// This Basic Code

		WebElement uName = driver.findElement(By.cssSelector("[id='email'"));
		uName.clear();
		uName.sendKeys(enterYourUserName);
		System.out.println("What is the Tag ANme" + uName.getTagName());
		return uName;
		// This is POM Style code
	}

	public WebElement passWord(String enterYourPassword) {
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.clear();
		pass.sendKeys(enterYourPassword); // use your variable
		return pass;

	}

	public void clickLoginButton() {
		// driver.findElement(By.name("login")).click(); // i can use this too

		WebElement loginButton = driver.findElement(By.name("login")); // Make a Variable
		loginButton.click();

	}
	public WebElement forgetPassword() {
		WebElement forgetPass=driver.findElement(By.linkText("Forgot password?"));
		forgetPass.click();
		return forgetPass;
		
	}
	public WebElement createNewAccount() {
		WebElement newAccount=driver.findElement(By.linkText("Create new account"));
		newAccount.click();
		return newAccount;
		
	}

}
