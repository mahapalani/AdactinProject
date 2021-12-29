package com.Page_Object_Manager;
import org.openqa.selenium.WebDriver;

import com.POM.Booking_Page;
import com.POM.Confirmation_Page;
import com.POM.Itinerary_Page;
import com.POM.Login_Page;
import com.POM.Radio_Page;
import com.POM.Search_Page;
 public class Page_Object_Manager {
	public WebDriver driver;
	private Login_Page lp;
	private Search_Page sp;
	private Radio_Page rp;
	private Booking_Page bp;
	private Confirmation_Page cp;
	private Itinerary_Page ip;
  public Page_Object_Manager(WebDriver driver2) {
	this.driver = driver2;
	}
  public  Login_Page  getInstanceLogin_Page() {
	if (lp==null) {
		lp=new Login_Page(driver);
	}	
	return lp;
}
   public Search_Page getInstanceSearch_Page() {
	if (sp==null) {
		sp= new Search_Page(driver);
	}
	return sp;
	}
   public Radio_Page getInstanceRadio_Page() {
		if (rp== null) {
			rp= new Radio_Page(driver);
		}	
		return rp;
  }	
   public Booking_Page getInstanceBooking_Page() {
	if (bp==null) {
		bp=new Booking_Page(driver);
	}
	return bp;
	}
   public Confirmation_Page  getInstanceConfirmation_Page() {
	if (cp==null) {
		cp=new Confirmation_Page(driver);
		
	}
	return cp;
}
public  Itinerary_Page getInstanceItinerary_Page() {
	if (ip==null) {
		ip=new Itinerary_Page(driver);
				
	}
	return ip;

}
}
 


	
	


