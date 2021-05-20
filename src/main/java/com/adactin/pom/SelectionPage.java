package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectionPage {

public static WebDriver driver;
public SelectionPage(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver2, this);
}

@FindBy(id = "location")
private WebElement locations;
@FindBy(xpath = "(//select[@class= 'search_combobox'])[2]")
private WebElement hotel;
@FindBy (xpath = "(//select[@class= 'search_combobox'])[3]")
private WebElement room;
@FindBy(xpath = "(//select[@class= 'search_combobox'])[4]")
private WebElement numberofrooms;
@FindBy(id = "datepick_in")
private WebElement checkin;
@FindBy(id = "datepick_out")
private WebElement checkout;
@FindBy(xpath = "(//select[@class= 'search_combobox'])[5]")
private WebElement adults;
@FindBy(xpath = "(//select[@class= 'search_combobox'])[6]")
private WebElement childs;
@FindBy(id = "Submit")
private WebElement submit;
public WebElement getLocations() {
	return locations;
}
public WebElement getHotel() {
	return hotel;
}
public WebElement getRoom() {
	return room;
}
public WebElement getNumberofrooms() {
	return numberofrooms;
}
public WebElement getCheckin() {
	return checkin;
}
public WebElement getCheckout() {
	return checkout;
}
public WebElement getAdults() {
	return adults;
}
public WebElement getChilds() {
	return childs;
}
public WebElement getSubmit() {
	return submit;
}

}
