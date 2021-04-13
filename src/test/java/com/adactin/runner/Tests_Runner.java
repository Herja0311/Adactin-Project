package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin_Project_Pom.Base_Class_Pro;
import com.adactin.helper.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test/java//com//adactin//features",
glue="com.adactin.stepdefinition")


public class Tests_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void Set_Up() throws Throwable {
		
		String Browser = File_Reader_Manager.GetInstance().GetInstanceCR().GetBrowser();
		
			driver = Base_Class_Pro.getBrowser(Browser);
		
		
	}
	
	@AfterClass
	public static void Tear_Down() {

		Base_Class_Pro.close();
	}
	
	

}
