package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseclassCucumber;
import com.adactin.helper.FileReaderManeger;
import com.adactin.helper.SingletonDesignPage;
import com.adactin.pom.LoginPage;
import com.adactin.pom.PersonalInfo;
import com.adactin.pom.SelectHotel;
import com.adactin.pom.SelectionPage;
import com.adactin.testrunner.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseclassCucumber{
	public static WebDriver driver= TestRunner.driver;
//     SingletonDesignPage sdp = new SingletonDesignPage(driver);
	LoginPage lp = new LoginPage(driver);
	SelectionPage sp = new SelectionPage(driver);
	SelectHotel sh = new SelectHotel(driver);
	PersonalInfo pi = new PersonalInfo(driver);
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
//	   getUrl("https://adactinhotelapp.com/index.php");
		String url = FileReaderManeger.getInstanceCR().getInstance().geturl();
		getUrl(url);
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		inputText(lp.getUser(), "arunvinayak");
	  
	}

	@When("^user Enter The Password In The Password field$")
	public void user_Enter_The_Password_In_The_Password_field() throws Throwable {
		inputText(lp.getPass(), "PP4JLI");
	
	}

	@Then("^user Click The Login Button It Navigates To Search Hotel Page$")
	public void user_Click_The_Login_Button_It_Navigates_To_Search_Hotel_Page() throws Throwable {
		clickOnElement(lp.getLogin());
	    
	}
	@When("^user Choose The Location$")
	public void user_Choose_The_Location() throws Throwable {
	   dropDownSelection(sp.getLocations(), "index", "3");
	}

	@When("^user Choose The Hotel$")
	public void user_Choose_The_Hotel() throws Throwable {
	  dropDownSelection(sp.getHotel(), "index", "1");
	}

	@When("^user Choose The Roomtype$")
	public void user_Choose_The_Roomtype() throws Throwable {
		dropDownSelection(sp.getRoom(), "index", "2");
	   
	}

	@When("^user Choose The No of Room$")
	public void user_Choose_The_No_of_Room() throws Throwable {
		dropDownSelection(sp.getNumberofrooms(), "index", "4");
	    
	}

	@When("^user Enter The Check In Date$")
	public void user_Enter_The_Check_In_Date() throws Throwable {
	  inputText(sp.getCheckin(), "20/05/2021");
	}

	@When("^user Enter The Chech Out Date$")
	public void user_Enter_The_Chech_Out_Date() throws Throwable {
		inputText(sp.getCheckout(), "22/05/1995");
	    
	}

	@When("^user Choose The Adults Per Room$")
	public void user_Choose_The_Adults_Per_Room() throws Throwable {
		dropDownSelection(sp.getAdults(), "index", "2");
	    
	}

	@When("^user Choose The Childs Per Room$")
	public void user_Choose_The_Childs_Per_Room() throws Throwable {
		dropDownSelection(sp.getChilds(), "index", "3");
	
	}

	@Then("^user Click The Search Button$")
	public void user_Click_The_Search_Button() throws Throwable {
		clickOnElement(sp.getSubmit());
	   
	}
	@When("^user Clicks The Selected Hotel$")
	public void user_Clicks_The_Selected_Hotel() throws Throwable {
		clickOnElement(sh.getSelect());
	   
	}

	@Then("^user Clicks The Continue Button$")
	public void user_Clicks_The_Continue_Button() throws Throwable {
		clickOnElement(sh.getSearch());
	   
	}
	@When("^user Enters The Firstname$")
	public void user_Enters_The_Firstname() throws Throwable {
		inputText(pi.getFname(), "prabhu");
	    
	}

	@When("^user Enters The Lastname$")
	public void user_Enters_The_Lastname() throws Throwable {
	   inputText(pi.getLname(), "ak");
	}

	@When("^user Enters The Billingaddress$")
	public void user_Enters_The_Billingaddress() throws Throwable {
		inputText(pi.getBilladdress(), "puniyak,chennai");
	    
	}

	@When("^user Enters The Creditcard Number$")
	public void user_Enters_The_Creditcard_Number() throws Throwable {
		inputText(pi.getCardno(), "1234567890123456");
	   
	}

	@When("^user Choose The Creditcard Type$")
	public void user_Choose_The_Creditcard_Type() throws Throwable {
		dropDownSelection(pi.getCardname(), "index", "3");
	   
	}

	@When("^user Choose The Expiry Date$")
	public void user_Choose_The_Expiry_Date() throws Throwable {
		dropDownSelection(pi.getExpmonth(), "index", "5");
	   
	}

	@When("^user Choose The Expiry Year$")
	public void user_Choose_The_Expiry_Year() throws Throwable {
		dropDownSelection(pi.getExpyear(), "index", "6");
	   
	}

	@When("^user Enter The Cvv$")
	public void user_Enter_The_Cvv() throws Throwable {
		inputText(pi.getCvvno(), "244");
	
	}

	@Then("^user Clicks The BookNow Button$")
	public void user_Clicks_The_BookNow_Button() throws Throwable {
		clickOnElement(pi.getBooknow());
	    
	}
	
}
