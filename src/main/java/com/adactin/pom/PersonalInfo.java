package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInfo {
	public static WebDriver driver;
	
	@FindBy(id = "first_name")
	private WebElement fname;
	@FindBy(id = "last_name")
	private WebElement lname;
	@FindBy(id = "address")
	private WebElement billaddress;
	@FindBy(id = "cc_num")
	private WebElement cardno;
	@FindBy(id = "cc_type")
	private WebElement cardname;
	@FindBy(id = "cc_exp_month")
	private WebElement expmonth;
	@FindBy(id = "cc_exp_year")
	private WebElement expyear;
	@FindBy(id = "cc_cvv")
	private WebElement cvvno;
	@FindBy(id = "book_now")
	private WebElement booknow;
	public PersonalInfo(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver2, this);
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getBilladdress() {
		return billaddress;
	}
	public WebElement getCardno() {
		return cardno;
	}
	public WebElement getCardname() {
		return cardname;
	}
	public WebElement getExpmonth() {
		return expmonth;
	}
	public WebElement getExpyear() {
		return expyear;
	}
	public WebElement getCvvno() {
		return cvvno;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	

}
