package com.Adactin_Project_All_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Myltin {
	
	public WebDriver driver; 
	
	@FindBy(name = "my_itinerary")
	private WebElement ltinerary;
	

	public Adactin_Myltin(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	
	}


	public WebElement getLtinerary() {
		return ltinerary;
	}


	
}
