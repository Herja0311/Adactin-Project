package com.Adactin_Project_All_Pom;

import com.Adactin_Project_Pom.Base_Class_Pro;

public class Adactin_POM_Main extends Base_Class_Pro {
	
	public static void main(String[] args) throws Throwable  {
		
		driver = getBrowser("Chrome");
		
		getUrl("https://adactinhotelapp.com/");
	
		//login
		  
		Adactin_Login login_Click = new Adactin_Login(driver);
		
		implicitwait(30);
		
		inputValueElement(login_Click.getUser_Name(), "Adact0932");
		
		inputValueElement(login_Click.getPassword(), "act093213");
		
		clickOnElement(login_Click.getLogin_Btn());
	
		//seacrh hotel
		
		Adactin_Searchhotel hotel_Search = new Adactin_Searchhotel(driver);
		
		singledropdown(hotel_Search.getLocation(), "text", "Paris");
		
		singledropdown(hotel_Search.getHotel(), "value", "Hotel Hervey");
		
		singledropdown(hotel_Search.getRoom_Type(), "text", "Standard");
		
		singledropdown(hotel_Search.getNo_Rooms(), "Value", "2");
		
		inputValueElement(hotel_Search.getCheck_in_date(), "03/04/2021");
		
		inputValueElement(hotel_Search.getCheck_out_date(), "06/04/2021");
		
		singledropdown(hotel_Search.getAdult_Room(), "Value", "2");
		
		singledropdown(hotel_Search.getChild_room(), "Value", "0");
		
		clickOnElement(hotel_Search.getSearch_Btn());
		
		//Search confirm
		
		Search_Confirm Confirmsearch = new Search_Confirm(driver);
		
		tread(2000);
		
		clickOnElement(Confirmsearch.getRadio_Btn());
		
		clickOnElement(Confirmsearch.getContinue_Btn());
		
		//booked
		
		Adactin_Booked Booking_details = new Adactin_Booked(driver);
		
		inputValueElement(Booking_details.getFirst_Name(), "Herija");
		
		inputValueElement(Booking_details.getLast_Name(), "Joseph");
		
		inputValueElement(Booking_details.getBilling_Address(), "No-44,Haran Street,Houston,Texas");
		
		inputValueElement(Booking_details.getCredit_card(), "9877847358457431");
		
		singledropdown(Booking_details.getCredit_type(), "Value", "MAST");
		
		singledropdown(Booking_details.getExpiry_month(), "Value", "7");
		
		tread(3000);
		
		singledropdown(Booking_details.getExpiry_year(), "Value", "2022");
		
		inputValueElement(Booking_details.getCvv(), "674");
		
		clickOnElement(Booking_details.getBooking());
		
		//myitin
		
		Adactin_Myltin itinerary_Btn = new Adactin_Myltin(driver);
				
		implicitwait(40);

		
		clickOnElement(itinerary_Btn.getLtinerary());

		//order&logout
	
		Adactin_Order Logout = new Adactin_Order(driver);
		
		implicitwait(40);
		
		//clickOnElement(Logout.getFName());
		
		//explicitwait(Logout.getLogout_Btn(), 30);
		
		screenshots("C:\\Users\\Admin\\eclipse-workspace\\Adactin_Project_Pom\\Screenshots\\log.png");
		
		//clickOnElement(Logout.getOrder_Id_Btn());
		
		clickOnElement(Logout.getLogout_Btn());
		
		driver.close();
		
		
				
	}
	

}
