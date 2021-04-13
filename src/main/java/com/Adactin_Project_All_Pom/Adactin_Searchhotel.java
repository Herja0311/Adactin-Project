package com.Adactin_Project_All_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Searchhotel {
	
	public WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement location;
	
	@FindBy(xpath = "(//select[@class = 'search_combobox'])[2]")
	private WebElement hotel;
	
	@FindBy(id = "room_type")
	private WebElement Room_Type;
	
	@FindBy(id = "room_nos")
	private WebElement No_Rooms;
	
	@FindBy(name = "datepick_in")
	private WebElement Check_in_date;
	
	@FindBy(xpath = "(//input[@type= 'text'])[3]")
	private WebElement Check_out_date;
	
	@FindBy(name = "adult_room")
	private WebElement Adult_Room;
	
	@FindBy(id = "child_room")
	private WebElement Child_room;
	 
	@FindBy(xpath = "//input[@type= 'submit']")
	private WebElement Search_Btn;

	public Adactin_Searchhotel(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoom_Type() {
		return Room_Type;
	}

	public WebElement getNo_Rooms() {
		return No_Rooms;
	}

	public WebElement getCheck_in_date() {
		return Check_in_date;
	}

	public WebElement getCheck_out_date() {
		return Check_out_date;
	}

	public WebElement getAdult_Room() {
		return Adult_Room;
	}

	public WebElement getChild_room() {
		return Child_room;
	}

	public WebElement getSearch_Btn() {
		return Search_Btn;
	}
	

}
