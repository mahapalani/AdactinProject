package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itinerary_Page {
@FindBy(id="logout")
private WebElement logout;
private WebDriver driver;

public WebElement getLogout() {
	return logout;
}
public Itinerary_Page(WebDriver driver2) {
	this.driver = driver2;
     PageFactory.initElements(driver, this);
}
}
