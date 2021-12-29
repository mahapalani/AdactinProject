package com.Runner_Class;

import org.apache.commons.math3.analysis.function.Log;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import com.Page_Object_Manager.Page_Object_Manager;
import Base_Class.Base_Class;
public class Runner_Class extends Base_Class {
	public static WebDriver driver=getBrowser("chromedriver");
    public static Page_Object_Manager pom = new Page_Object_Manager(driver);
    public static void main(String[] args) throws Throwable {
    url("http://adactinhotelapp.com/index.php");
    inputValueElement(pom.getInstanceLogin_Page().getUsername(),"dhaniyamaha");
	inputValueElement(pom.getInstanceLogin_Page().getPassword(),"Dhaniya@06");
	clickOnElement(pom.getInstanceLogin_Page().getLogin_btn());
	Thread.sleep(3000);
	DropDown(pom.getInstanceSearch_Page().getLocation(), "byvalue","London" );
	DropDown(pom.getInstanceSearch_Page().getHotels(),"byvalue","Hotel Sunshine");
	DropDown(pom.getInstanceSearch_Page().getRoomtype(),"byindex","3");
	DropDown(pom.getInstanceSearch_Page().getRoomnos(),"byindex","2");
	inputValueElement(pom.getInstanceSearch_Page().getDatepickin(), "27.12.2021");
	inputValueElement(pom.getInstanceSearch_Page().getDatepickout(), "28.12.2021");
	DropDown(pom.getInstanceSearch_Page().getAdultroom(),"byindex","2");
	DropDown(pom.getInstanceSearch_Page().getChildroom(),"byindex","2");
	clickOnElement(pom.getInstanceSearch_Page().getSubmit());
	Thread.sleep(3000);
	clickOnElement(pom.getInstanceRadio_Page().getRadiobuttonclick());
	Thread.sleep(1000);
	clickOnElement(pom.getInstanceRadio_Page().getContinueclick());
	Thread.sleep(3000);
	inputValueElement(pom.getInstanceBooking_Page().getFirstname(), "dhaniya");
	inputValueElement(pom.getInstanceBooking_Page().getLastname(), "maha");
//	timeout(10);
	inputValueElement(pom.getInstanceBooking_Page().getAddress(), "No.35, WaterTank street");
	timeout(10);
	inputValueElement(pom.getInstanceBooking_Page().getCcnum(), "3452345678912342");
	DropDown(pom.getInstanceBooking_Page().getCctype(),"byindex","3");
	DropDown(pom.getInstanceBooking_Page().getCcmonth(), "byindex", "10");
	DropDown(pom.getInstanceBooking_Page().getCcyr(), "byvalue", "2022");
	inputValueElement(pom.getInstanceBooking_Page().getCvv(),"321");
	clickOnElement(pom.getInstanceBooking_Page().getBooknow());
//	CONFIRMATION_PAGE
	sleep(30);
	System.out.println("Booking_Details");
	System.out.println("Hotel Name");
	getAttributeValue(pom.getInstanceConfirmation_Page().getHotelname(), "value");
    System.out.println();
	System.out.println("Location");
    getAttributeValue(pom.getInstanceConfirmation_Page().getLocation(),"value");
	System.out.println();
	System.out.println("Room_Type");
	getAttributeValue(pom.getInstanceConfirmation_Page().getRoomtype(),"value");
	System.out.println();
	System.out.println("Chkin Dt");
	getAttributeValue(pom.getInstanceConfirmation_Page().getArrivaldate(),"value");
	System.out.println();
	System.out.println("Chkout Dt");
	getAttributeValue(pom.getInstanceConfirmation_Page().getDeparture(), "value");
	System.out.println();
	System.out.println("Total NOR");
	getAttributeValue(pom.getInstanceConfirmation_Page().getTotalrooms(), "value");
	System.out.println();
	System.out.println("Number of Adults");
	getAttributeValue(pom.getInstanceConfirmation_Page().getAdultsroom(), "value");
	System.out.println();
	System.out.println("Number of Children");
	getAttributeValue(pom.getInstanceConfirmation_Page().getChildrenroom(),"value");
	System.out.println();
	System.out.println("Price Per Night");
	getAttributeValue(pom.getInstanceConfirmation_Page().getPrice(), "value");
	System.out.println();
	System.out.println("Total Price");
	getAttributeValue(pom.getInstanceConfirmation_Page().getTotalprice(), "value");
	System.out.println();
	System.out.println("GST");
	getAttributeValue(pom.getInstanceConfirmation_Page().getGst(),"value");
	System.out.println();
	System.out.println("Final Billed Value");
	getAttributeValue(pom.getInstanceConfirmation_Page().getFinalprice(),"value");
	System.out.println();
	System.out.println("Booking Name");
	getAttributeValue(pom.getInstanceConfirmation_Page().getFirstname(), "value");
	System.out.println();
	System.out.println("Address");
	getAttributeValue(pom.getInstanceConfirmation_Page().getAddress(),"value");
	System.out.println();
    System.out.println("Order Number");
    getAttributeValue(pom.getInstanceConfirmation_Page().getOrderno(), "value");
	System.out.println();
    clickOnElement(pom.getInstanceConfirmation_Page().getMyitinerary());
    sleep(7000);
//  ITINERARY PAGE
    takeScreenshot("C:\\Users\\Bala\\eclipse-workspace\\AdactinProject\\Screenshot\\adactin.png1");
    sleep(2000);
    clickOnElement(pom.getInstanceItinerary_Page().getLogout());
	close();
    }
}
	
	
	
	
	
	
	



	

