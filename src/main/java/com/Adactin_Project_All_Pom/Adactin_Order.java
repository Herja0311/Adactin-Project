package com.Adactin_Project_All_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Order {
	
	public WebDriver driver;
	
	@FindBy(id = "logout")
	private WebElement Logout_Btn;
	
	@FindBy(xpath = "//[text()='First Name']")
	private WebElement FName;

	
	public Adactin_Order(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);	}

	

	public WebElement getLogout_Btn() {
		return Logout_Btn;
	}

	public WebElement getFName() {
		return FName;
	}

	

}
