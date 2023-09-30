package com.facebook.pom_PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithPageFactory {
	//POM formula = each webelement should have it's own method
	//POM should have it's own constructor on each page. 
	// formula = formula for- @FindBy (hoe=How.attributes/locators name, using="values/xpath/css") 
	// then data type and variable name.

WebDriver driver;

public LoginPageWithPageFactory(WebDriver driver) {
	super();// means using parent 
	this.driver = driver;
	PageFactory.initElements(driver, this);
	// page factory- support to execute POM design pattern. 
	// initElements- initialize all the web elements @FindBy annotation.
	// FindBy annotation- FindBy selenium support for support to page factory initElements.
}
// formula for- @FindBy (hoe=How.attributes/locators name, using="values/xpath/css")
// then data type and variable name.

@FindBy(how=How.ID, using="email")WebElement userNameId; // creating variable

public WebElement usernameMethod(String enterYourUsername) {
	//driver.findElement(By.id("email"));
	userNameId.sendKeys(enterYourUsername);// were using the upper line in here.
	return userNameId;
}
@FindBy(how=How.NAME, using="pass")public WebElement passWordLocator;
public WebElement passWordMethod(String enterYourPassword) {
	passWordLocator.sendKeys(enterYourPassword);
	return null;
}
@FindBy(how=How.XPATH, using="//button[@name='login']") private WebElement loginButton;

public void loginButton() {
	loginButton.click();
}
}
