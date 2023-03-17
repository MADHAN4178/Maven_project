package com.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

	public static WebDriver driver;

	public Search_Hotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	WebElement Locationsearch;

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Search_Hotel.driver = driver;
	}

	public WebElement getLocationsearch() {
		return Locationsearch;
	}

	public void setLocationsearch(WebElement locationsearch) {
		Locationsearch = locationsearch;
	}

	public WebElement getLocationSelect() {
		return locationSelect;
	}

	public void setLocationSelect(WebElement locationSelect) {
		this.locationSelect = locationSelect;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public void setRoomType(WebElement roomType) {
		RoomType = roomType;
	}

	public WebElement getRoomtype() {
		return Roomtype;
	}

	public void setRoomtype(WebElement roomtype) {
		Roomtype = roomtype;
	}

	public WebElement getCheckInDate() {
		return CheckInDate;
	}

	public void setCheckInDate(WebElement checkInDate) {
		CheckInDate = checkInDate;
	}

	public WebElement getCheckOutDate() {
		return CheckOutDate;
	}

	public void setCheckOutDate(WebElement checkOutDate) {
		CheckOutDate = checkOutDate;
	}

	public WebDriver getAdultsPerRoom() {
		return AdultsPerRoom;
	}

	public void setAdultsPerRoom(WebDriver adultsPerRoom) {
		AdultsPerRoom = adultsPerRoom;
	}

	public WebElement getChildensPerRooms() {
		return ChildensPerRooms;
	}

	public void setChildensPerRooms(WebElement childensPerRooms) {
		ChildensPerRooms = childensPerRooms;
	}

	public WebElement getSumbitkey() {
		return sumbitkey;
	}

	public void setSumbitkey(WebElement sumbitkey) {
		this.sumbitkey = sumbitkey;
	}

	public WebElement getReset() {
		return reset;
	}

	public void setReset(WebElement reset) {
		this.reset = reset;
	}

	@FindBy(xpath = "//select[@id=\'hotels\']")
	WebElement locationSelect;

	@FindBy(xpath = "//*[@id=\'room_type\']")
	WebElement RoomType;

	@FindBy(xpath = "//*[@id=\'room_nos\']")
	WebElement Roomtype;

	@FindBy(xpath = "//*[@id=\'datepick_in\']")
	WebElement CheckInDate;

	@FindBy(xpath = "//*[@id=\'datepick_out\']")
	WebElement CheckOutDate;

	@FindBy(xpath = "//*[@id=\'adult_room\']")
	WebDriver AdultsPerRoom;

	@FindBy(xpath = "//*[@id=\'child_room\']")

	WebElement ChildensPerRooms;

	@FindBy(id = "submit")
	WebElement sumbitkey;

	@FindBy(id = "Reset")
	WebElement reset;

}
