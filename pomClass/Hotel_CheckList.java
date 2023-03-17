package com.pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_CheckList {

	public static WebDriver driver;
	 public Hotel_CheckList(WebDriver driver) {
      this.driver=driver;
      PageFactory.initElements(driver, this);

	 }
	
		public static WebDriver getDriver() {
			return driver;
		}

		public static void setDriver(WebDriver driver) {
			Hotel_CheckList.driver = driver;
		}

		public WebElement getChecklist_radio() {
			return checklist_radio;
		}

		public void setChecklist_radio(WebElement checklist_radio) {
			this.checklist_radio = checklist_radio;
		}

		public WebElement getContinueToproceed() {
			return continueToproceed;
		}

		public void setContinueToproceed(WebElement continueToproceed) {
			this.continueToproceed = continueToproceed;
		}

		public WebElement getCancel() {
			return Cancel;
		}

		public void setCancel(WebElement cancel) {
			Cancel = cancel;
		}

		@FindBy(id = "//*[@id=\'radiobutton_0\']")
		WebElement checklist_radio;

		@FindBy(id = "continue")
		WebElement continueToproceed;

		@FindBy(id = "cancel")
		WebElement Cancel;

}
