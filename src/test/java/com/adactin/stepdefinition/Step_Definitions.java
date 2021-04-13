package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.Adactin_Project_Pom.Base_Class_Pro;
import com.adactin.helper.File_Reader_Manager;
import com.adactin.helper.Page_Object_Manager;
import com.adactin.runner.Tests_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definitions extends Base_Class_Pro{

	public static WebDriver driver = Tests_Runner.driver;   
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);	
	
	
	@Given("^user Lanuch The Application$")
	public void user_Lanuch_The_Application() throws Throwable {
 
		String Url = File_Reader_Manager.GetInstance().GetInstanceCR().GetUrl();
		getUrl(Url);
	}

	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {

		inputValueElement(pom.GetInstancelogin().getUser_Name(), username);
		}

	@When("^user Enter The \"([^\"]*)\" In Password field$")
	public void user_Enter_The_In_Password_field(String password) throws Throwable {

		inputValueElement(pom.GetInstancelogin().getPassword(), password);
	
	}

	@Then("^user Click On The Login Button And It Navigates To The Search Hotel$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel() throws Throwable {

		clickOnElement(pom.GetInstancelogin().getLogin_Btn());
	
	}





@When("^user Select The Location In Search Hotel$")
public void user_Select_The_Location_In_Search_Hotel() throws Throwable {

singledropdown(pom.GetInstancesearch().getLocation(), "text", "Paris");



}

@When("^user Select The Hotels In Search Hotel$")
public void user_Select_The_Hotels_In_Search_Hotel() throws Throwable {
singledropdown(pom.GetInstancesearch().getHotel(), "value", "Hotel Hervey");


}

@When("^user Select The Room Type In Search Hotel$")
public void user_Select_The_Room_Type_In_Search_Hotel() throws Throwable {
	singledropdown(pom.GetInstancesearch().getRoom_Type(), "text", "Standard");
	

}

@When("^user Select The Number Of Rooms In Search Hotel$")
public void user_Select_The_Number_Of_Rooms_In_Search_Hotel() throws Throwable {
 singledropdown(pom.GetInstancesearch().getNo_Rooms(),  "Value", "2");


}

@When("^user Enter The Check In Date In Search Hotel$")
public void user_Enter_The_Check_In_Date_In_Search_Hotel() throws Throwable {
inputValueElement(pom.GetInstancesearch().getCheck_in_date(), "03/04/2021");

}

@When("^user Enter The Check Out Date In Search Hotel$")
public void user_Enter_The_Check_Out_Date_In_Search_Hotel() throws Throwable {
inputValueElement(pom.GetInstancesearch().getCheck_out_date(), "06/04/2021");

}

@When("^user Select The Adults Rooms In Field$")
public void user_Select_The_Adults_Rooms_In_Field() throws Throwable {

singledropdown(pom.GetInstancesearch().getAdult_Room(), "Value", "2");

}

@When("^user Select The Children Rooms In Field$")
public void user_Select_The_Children_Rooms_In_Field() throws Throwable {

singledropdown(pom.GetInstancesearch().getChild_room(), "Value", "0");

}

@Then("^user Click The Search And It Navigates To Booked Itinarary$")
public void user_Click_The_Search_And_It_Navigates_To_Booked_Itinarary() throws Throwable {
clickOnElement(pom.GetInstancesearch().getSearch_Btn());

}

@When("^user Click The Select$")
public void user_Click_The_Select() throws Throwable {
clickOnElement(pom.GetInstancecontinue().getRadio_Btn());

}

@Then("^user Click The Continue In Field$")
public void user_Click_The_Continue_In_Field() throws Throwable {
clickOnElement(pom.GetInstancecontinue().getContinue_Btn());
	
}
@When("^user Enter The First Name In Book A Hotel$")
public void user_Enter_The_First_Name_In_Book_A_Hotel() throws Throwable {
inputValueElement(pom.GetInstanceBooked().getFirst_Name(), "Herija");

}

@When("^user Enter The Last Name In Book A Hotel$")
public void user_Enter_The_Last_Name_In_Book_A_Hotel() throws Throwable {
inputValueElement(pom.GetInstanceBooked().getLast_Name(), "Joseph");

}

@When("^user Enter The Billing Address In Book A Hotel$")
public void user_Enter_The_Billing_Address_In_Book_A_Hotel() throws Throwable {
inputValueElement(pom.GetInstanceBooked().getBilling_Address(), "No-44,Haran Street,Houston,Texas");

}

@When("^user Enter The Credit Card Number In Book A Hotel$")
public void user_Enter_The_Credit_Card_Number_In_Book_A_Hotel() throws Throwable {
inputValueElement(pom.GetInstanceBooked().getCredit_card(), "9877847358457431");

}

@When("^user Select The Credit Card Type In Book A Hotel$")
public void user_Select_The_Credit_Card_Type_In_Book_A_Hotel() throws Throwable {
singledropdown(pom.GetInstanceBooked().getCredit_type(),"Value", "MAST");

}
@When("^user Select The Expiry Month$")
public void user_Select_The_Expiry_Month() throws Throwable {
	singledropdown(pom.GetInstanceBooked().getExpiry_month(), "Value", "7");

}

@When("^user Select The Expiry Year In Book A Hotel$")
public void user_Select_The_Expiry_Year_In_Book_A_Hotel() throws Throwable {
	singledropdown(pom.GetInstanceBooked().getExpiry_year(), "Value", "2022");

}

@When("^user Enter The CVV Number In Book A Hotel$")
public void user_Enter_The_CVV_Number_In_Book_A_Hotel() throws Throwable {
inputValueElement(pom.GetInstanceBooked().getCvv(), "674");

}

@Then("^user Click The Book Now And It Navigates to Booking Confirmation$")
public void user_Click_The_Book_Now_And_It_Navigates_to_Booking_Confirmation() throws Throwable {
clickOnElement(pom.GetInstanceBooked().getBooking());
}

@Then("^user Click The My Itinerary And Navigates to Logout Field$")
public void user_Click_The_My_Itinerary_And_Navigates_to_Logout_Field() throws Throwable {

	implicitwait(40);
	
	clickOnElement(pom.GetInstanceMyltin().getLtinerary());

}

@Then("^user Click The Logout$")
public void user_Click_The_Logout() throws Throwable {
	implicitwait(30);
clickOnElement(pom.GetInstanceorder().getLogout_Btn());


}





}
