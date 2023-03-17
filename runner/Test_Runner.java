package com.runner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseClass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = "src\\test\\java\\com\\feature\\Adactin.feature", glue = "com.stepDefinition")
@RunWith(Cucumber.class)
public class Test_Runner {
public static WebDriver driver;

@BeforeClass
   public static void startUp() {
     driver =  BaseClass.Browser_lu();
}
	
@AfterClass
   public static void tearDown()
   {
	driver.close();
	   
   }
  
	
}
