package com.vtiger.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	WebDriver driver;
	public loginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(id="username")
private WebElement userName;
@FindBy(id="password")
private WebElement passWord;
@FindBy(xpath="//button[text()='Sign in']")
private WebElement signUpButton;
/**
 * @return the userName
 */
public WebElement getUserName() {
	return userName;
}
/**
 * @return the passWord
 */
public WebElement getPassWord() {
	return passWord;
}
/**
 * @return the signUpButton
 */
public WebElement getSignUpButton() {
	return signUpButton;
}
	
	
}
