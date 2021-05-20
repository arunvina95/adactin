package com.adactin.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseclassCucumber;
import com.adactin.helper.ConfigurationReader;
import com.adactin.helper.FileReaderManeger;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature", glue = "com.adactin.stepdefinition",monochrome = true, dryRun = false)


public class TestRunner {
public static WebDriver driver;
@BeforeClass
public static void set_Up() throws Throwable {
	
	driver = BaseclassCucumber.browserLaunch("chrome");
//	String browser = FileReaderManeger.getInstanceCR().getInstance().getbrowser();
//	driver = BaseclassCucumber.browserLaunch(browser);

}
@AfterClass
public static void tear_Dowm() {


}
}
