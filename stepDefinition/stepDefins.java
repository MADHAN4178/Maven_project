package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.ClickAction;

import com.baseClass.BaseClass;
import com.pomClass.Adactin_LoginPage_Source;

import io.cucumber.java.en.*;

public class stepDefins extends BaseClass  {

	Adactin_LoginPage_Source ad = new Adactin_LoginPage_Source(driver);
	
	
	@Given("User Lunch the application")
	public void user_lunch_the_application() {
     getUrl("https://adactinhotelapp.com/");
	}

	@When("username field entered")
	public void username_field_entered() {
SendKeys(ad.getUsernme(), "MADHAN4178");
	}

	@When("user enter password field")
	public void user_enter_password_field() {
SendKeys(ad.getPassword(),"Bank@123");
	}

	@Then("user clicks the application")
	public void user_clicks_the_application() {
		ClicktheElement(ad.getLoginButton());
	}

	

	

}
