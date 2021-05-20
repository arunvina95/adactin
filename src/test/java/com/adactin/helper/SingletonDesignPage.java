package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pom.LoginPage;
import com.adactin.pom.PersonalInfo;
import com.adactin.pom.SelectHotel;
import com.adactin.pom.SelectionPage;

public class SingletonDesignPage {
	public static WebDriver driver;
	private LoginPage lp;
	private PersonalInfo pi;
	private SelectHotel sh;
	private SelectionPage sp;
	public SingletonDesignPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	public LoginPage getLp() {
		return lp;
	}
	public PersonalInfo getPi() {
		return pi;
	}
	public SelectHotel getSh() {
		return sh;
	}
	public SelectionPage getSp() {
		return sp;
	}

}
