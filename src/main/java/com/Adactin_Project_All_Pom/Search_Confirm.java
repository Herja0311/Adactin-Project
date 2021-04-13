package com.Adactin_Project_All_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Confirm {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@type= 'radio']")
	private WebElement Radio_Btn;
	
	@FindBy(xpath = "//input[@class= 'reg_button']")
	private WebElement Continue_Btn;

	public Search_Confirm(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver2, this);
		
		
	}

	public WebElement getRadio_Btn() {
		return Radio_Btn;
	}

	public WebElement getContinue_Btn() {
		return Continue_Btn;
	}
	

}
