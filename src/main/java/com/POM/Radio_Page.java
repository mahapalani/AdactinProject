package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Radio_Page {
@FindBy(id="radiobutton_0")
private WebElement radiobuttonclick;
@FindBy(id="continue")
private WebElement continueclick;
private WebDriver driver;

public WebElement getRadiobuttonclick() {
	return radiobuttonclick;
}
public WebElement getContinueclick() {
	return continueclick;
}
public Radio_Page(WebDriver driver2) {
	this.driver = driver2;
     PageFactory.initElements(driver, this);
}
}