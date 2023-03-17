package com.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_LoginPage_Source  {
	public WebDriver driver;
	
public Adactin_LoginPage_Source(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public WebDriver getDriver() {
	return driver;
}

public void setDriver(WebDriver driver) {
	this.driver = driver;
}

public WebElement getUsernme() {
	return usernme;
}

public void setUsernme(WebElement usernme) {
	this.usernme = usernme;
}

public WebElement getPassword() {
	return password;
}

public void setPassword(WebElement password) {
	this.password = password;
}

public WebElement getLoginButton() {
	return loginButton;
}

public void setLoginButton(WebElement loginButton) {
	this.loginButton = loginButton;
}

@FindBy(id="username")
WebElement usernme;

@FindBy(id="password")
WebElement password;

@FindBy(id="login")
WebElement loginButton;




	}

