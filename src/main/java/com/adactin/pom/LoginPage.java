package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public static WebDriver driver;
@FindBy(id = "username")
private WebElement user;
@FindBy(id = "password")
private WebElement pass;
@FindBy(xpath = "//input[@type = 'Submit']")
private WebElement login;
public LoginPage(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
}
public static WebDriver getDriver() {
	return driver;
}
public WebElement getUser() {
	return user;
}
public WebElement getPass() {
	return pass;
}
public WebElement getLogin() {
	return login;
}


}
