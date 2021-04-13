package com.Adactin_Project_All_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Booked {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@class='reg_input']")
	private WebElement First_Name;
	
	@FindBy(name = "last_name")
	private WebElement Last_Name;
	
	@FindBy(id = "address")
	private WebElement Billing_Address;
	
	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement Credit_card;
	
	@FindBy(id = "cc_type")
	private WebElement Credit_type;
	
	@FindBy(xpath = "//select[@name='cc_exp_month']")
	private WebElement Expiry_month;
	
	@FindBy(xpath = "//select[@name='cc_exp_year']")
	private WebElement Expiry_year;
	
	@FindBy(id = "cc_cvv")
	private WebElement Cvv;
	
	@FindBy(xpath = "//input[@value='Book Now']")
	private WebElement Booking;
	

	public Adactin_Booked(WebDriver driver2) {

	this.driver = driver2;
	PageFactory.initElements(driver2, this);
	
	}

	public WebElement getBooking() {
		return Booking;
	}

	public WebElement getFirst_Name() {
		return First_Name;
	}

	public WebElement getLast_Name() {
		return Last_Name;
	}

	public WebElement getBilling_Address() {
		return Billing_Address;
	}

	public WebElement getCredit_card() {
		return Credit_card;
	}

	public WebElement getCredit_type() {
		return Credit_type;
	}

	public WebElement getExpiry_month() {
		return Expiry_month;
	}

	public WebElement getExpiry_year() {
		return Expiry_year;
	}

	public WebElement getCvv() {
		return Cvv;
	}
	

}
