package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Adactin_Project_All_Pom.Adactin_Booked;
import com.Adactin_Project_All_Pom.Adactin_Login;
import com.Adactin_Project_All_Pom.Adactin_Myltin;
import com.Adactin_Project_All_Pom.Adactin_Order;
import com.Adactin_Project_All_Pom.Adactin_Searchhotel;
import com.Adactin_Project_All_Pom.Search_Confirm;

public class Page_Object_Manager {
	
	public WebDriver driver;
	
    private Adactin_Login LoginPage;
	private Adactin_Searchhotel SearchPage;
	private Search_Confirm  ContinuePage;
	private Adactin_Booked BookedPage;
	private Adactin_Myltin MyltinPage;
	private Adactin_Order OrderPage;
	
	public Page_Object_Manager(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	
	}
	
	public Adactin_Login GetInstancelogin() {
		
		LoginPage = new Adactin_Login(driver);
		return LoginPage;
		
	}
	public Adactin_Searchhotel GetInstancesearch() {

		SearchPage = new Adactin_Searchhotel(driver);
		return SearchPage;
	
	}
	
	public Search_Confirm GetInstancecontinue() {

		ContinuePage = new Search_Confirm(driver);
		return ContinuePage;
		
}

	public Adactin_Booked GetInstanceBooked() {

		BookedPage = new Adactin_Booked(driver);
		return BookedPage;
		
	}
	
	public Adactin_Myltin GetInstanceMyltin() {

		MyltinPage = new Adactin_Myltin(driver);
		return MyltinPage;
			
	}
	
	public Adactin_Order GetInstanceorder() {

		OrderPage = new Adactin_Order(driver);
		return OrderPage;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
