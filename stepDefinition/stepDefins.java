package com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;

import com.baseClass.BaseClass;
import com.pomClass.AdactinBooking;
import com.pomClass.Adactin_LoginPage_Source;
import com.pomClass.Hotel_CheckList;
import com.pomClass.Search_Hotel;

import io.cucumber.java.en.*;

public class stepDefins extends BaseClass  {

	Adactin_LoginPage_Source ad = new Adactin_LoginPage_Source(driver);
	
	AdactinBooking ad1= new AdactinBooking(driver);
	
	Search_Hotel sr1 = new Search_Hotel(driver);
	
	Hotel_CheckList hl1 = new Hotel_CheckList(driver);
	
	@Given("User Lunch the application")
	public void user_lunch_the_application() {
     getUrl("https://adactinhotelapp.com/");
	}

	@When("username field entered")
	public void username_field_entered() {
SendKeys(ad.getUsernme(), "MADHAN4178");
   getText(ad.getUsernme());
   
   getTageName(ad.getUsernme());
	}

	@When("user enter password field")
	public void user_enter_password_field() {
SendKeys(ad.getPassword(),"241Q67");
	}

	@Then("user clicks the application")
	public void user_clicks_the_application() {
		ClicktheElement(ad.getLoginButton());
	}
	
	@Given("select the location")
	public void select_the_location() {
		selecttheindex(sr1.getSearchtheloction() , 2  );
	
	}

	@When("select the hotel")
	public void select_the_hotel() {
		selecttheindex(sr1.getSelecthotel() , 2  );
	}

	@When("select the room type")
	public void select_the_room_type() {
		
   Selectbyvaule(sr1.getSelectRoomType(), "Deluxe");
	}

	@When("select the room nos")
	public void select_the_room_nos() {
		
		SelectbyvisibleText(sr1.getSelectRoomno(),"7 - Seven");
	}

	@When("Check in the date")
	public void check_in_the_date() {

		SendKeys(sr1.getCheckInDate(), "20/03/2023");
		
	}

	@When("check out the date")
	public void check_out_the_date() {
		
		SendKeys(sr1.getCheckOutDate(), "22/03/2023");
	}

	@When("Adults per Room")
	public void adults_per_room() {
    Selectbyvaule(sr1.getAdultsPerRoom(), "2");
	}

	@When("Children per Room")
	public void children_per_room() {
		
		Selectbyvaule(sr1.getChildensPerRooms(), "2");
	}

	@Then("user click the login  button")
	public void user_click_the_login_button() {
	clicktheelement(sr1.getSumbitkey());

	}


	

}
