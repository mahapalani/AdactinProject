package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Page {
private WebDriver driver;
@FindBy(id="hotel_name_dis")
private WebElement hotelname;
@FindBy(id="location_dis")
private WebElement location;
@FindBy(id="room_type_dis")
private WebElement roomtype;
@FindBy(id="room_num_dis")
private WebElement roomnum;
@FindBy(id="total_days_dis")
private WebElement totaldays;
@FindBy(id="price_night_dis")
private WebElement pricenight;
@FindBy(id="total_price_dis")
private WebElement totalprice;
@FindBy(id="gst_dis")
private WebElement gst;
@FindBy(id="final_price_dis")
private WebElement finalprice;
@FindBy(id="first_name")
private WebElement firstname;
@FindBy(id="last_name")
private WebElement lastname;
@FindBy(id="address")
private WebElement address;
@FindBy(id="cc_num")
private WebElement ccnum;
@FindBy(id="cc_type")
private WebElement cctype;
@FindBy(id="cc_exp_month")
private WebElement ccmonth;
@FindBy(id="cc_exp_year")
private WebElement ccyr;
@FindBy(id="cc_cvv")
private WebElement cvv;
@FindBy(id="book_now")
private WebElement booknow;


public WebElement getHotelname() {
	return hotelname;
}
public WebElement getLocation() {
	return location;
}
public WebElement getRoomtype() {
	return roomtype;
}
public WebElement getRoomnum() {
	return roomnum;
}
public WebElement getTotaldays() {
	return totaldays;
}
public WebElement getPricenight() {
	return pricenight;
}
public WebElement getTotalprice() {
	return totalprice;
}
public WebElement getGst() {
	return gst;
}
public WebElement getFinalprice() {
	return finalprice;
}
public WebElement getFirstname() {
	return firstname;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCcnum() {
	return ccnum;
}
public WebElement getCctype() {
	return cctype;
}
public WebElement getCcmonth() {
	return ccmonth;
}
public WebElement getCcyr() {
	return ccyr;
}
public WebElement getCvv() {
	return cvv;
}
public WebElement getBooknow() {
	return booknow;
}
public Booking_Page(WebDriver driver2) {
	this.driver = driver2;
     PageFactory.initElements(driver, this);
}
}

