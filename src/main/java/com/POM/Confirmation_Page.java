package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Confirmation_Page {
private WebDriver driver;
@FindBy(id="hotel_name")
private WebElement hotelname;
@FindBy(id="location")
private WebElement location;
@FindBy(id="room_type")
private WebElement roomtype;
@FindBy(id="arrival_date")
private WebElement arrivaldate;
@FindBy(id="departure_text")
private WebElement departure;
@FindBy(id="total_rooms")
private WebElement totalrooms;
@FindBy(id="adults_room")
private WebElement adultsroom;
@FindBy(id="children_room")
private WebElement childrenroom;
@FindBy(id="price_night")
private WebElement price;
@FindBy(id="total_price")
private WebElement totalprice;
@FindBy(id="gst")
private WebElement gst;
@FindBy(id="final_price")
private WebElement finalprice;
@FindBy(id="first_name")
private WebElement firstname;
@FindBy(id="last_name")
private WebElement lastname;
@FindBy(id="address")
private WebElement address;
@FindBy(id="order_no")
private WebElement orderno;
@FindBy(id="my_itinerary")
private WebElement myitinerary;

public WebElement getHotelname() {
return hotelname;
}
public WebElement getLocation() {
return location;
}
public WebElement getRoomtype() {
return roomtype;
}
public WebElement getArrivaldate() {
return arrivaldate;
}
public WebElement getDeparture() {
return departure;
}
public WebElement getTotalrooms() {
return totalrooms;
}
public WebElement getAdultsroom() {
return adultsroom;
}
public WebElement getChildrenroom() {
return childrenroom;
}
public WebElement getPrice() {
return price;
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
public WebElement getOrderno() {
return orderno;
}
public WebElement getMyitinerary() {
return myitinerary;
}
public Confirmation_Page(WebDriver driver2) {
	this.driver = driver2;
     PageFactory.initElements(driver, this);
}
}
