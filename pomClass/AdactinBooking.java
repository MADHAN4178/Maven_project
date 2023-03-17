package com.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinBooking {
	
	public static WebDriver driver;
	
  public AdactinBooking(WebDriver driver) {
    this.driver=driver;
    PageFactory.initElements(driver, this);
  }
	
  @FindBy(xpath = "//*[@id=\'first_name\']")
  WebElement Fullname;
  public static WebDriver getDriver() {
	return driver;
}

public static void setDriver(WebDriver driver) {
	AdactinBooking.driver = driver;
}

public WebElement getFullname() {
	return Fullname;
}

public void setFullname(WebElement fullname) {
	Fullname = fullname;
}

public WebElement getLastname() {
	return lastname;
}

public void setLastname(WebElement lastname) {
	this.lastname = lastname;
}

public WebElement getAddress() {
	return Address;
}

public void setAddress(WebElement address) {
	Address = address;
}

public WebElement getCcnum() {
	return ccnum;
}

public void setCcnum(WebElement ccnum) {
	this.ccnum = ccnum;
}

public WebElement getCcexpmonth() {
	return ccexpmonth;
}

public void setCcexpmonth(WebElement ccexpmonth) {
	this.ccexpmonth = ccexpmonth;
}

public WebElement getCcexpyear() {
	return ccexpyear;
}

public void setCcexpyear(WebElement ccexpyear) {
	this.ccexpyear = ccexpyear;
}

public WebElement getCvv() {
	return cvv;
}

public void setCvv(WebElement cvv) {
	this.cvv = cvv;
}

public WebElement getBuynow() {
	return buynow;
}

public void setBuynow(WebElement buynow) {
	this.buynow = buynow;
}

public WebElement getCancelentire() {
	return cancelentire;
}

public void setCancelentire(WebElement cancelentire) {
	this.cancelentire = cancelentire;
}

@FindBy(id = "//*[@id=\'last_name\']")
  WebElement lastname;
  
  @FindBy(xpath = "//*[@id=\'address\']")
  WebElement Address;
  
  @FindBy(xpath = "//*[@id=\'cc_num\']")
  WebElement ccnum;

   @FindBy(xpath = "//*[@id=\'cc_exp_month\']")
   WebElement ccexpmonth;
   @FindBy(xpath = " //*[@id=\'cc_exp_year\']")
   WebElement ccexpyear;
   @FindBy(xpath = "//*[@id=\'cc_cvv\']")
   WebElement cvv;
   @FindBy(xpath = "//*[@id=\'book_now\']")
   WebElement buynow;
   
   @FindBy(xpath = "//*[@id=\'cancel\']")
   WebElement cancelentire;
  
}
