package com.Adactin_Project_All_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Login {
	
	
	public WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement User_Name;
	
	@FindBy(name = "password")
	private WebElement Password;
	
	@FindBy(xpath = "//input[@type ='Submit']")
	private WebElement Login_Btn;
	
	public Adactin_Login(WebDriver driver2) {
		
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
		
	}

	public WebElement getUser_Name() {
		return User_Name;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin_Btn() {
		return Login_Btn;
	}

	
	
	
	
	
	

}
