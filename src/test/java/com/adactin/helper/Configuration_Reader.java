package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws Throwable {

	File f = new File(
	"C:\\Users\\Admin\\eclipse-workspace\\Adactin_Project_Pom\\src\\test\\java\\com\\adactin\\properties\\configuration.properties");
		
	FileInputStream fis = new FileInputStream(f);
	
	p = new Properties();
	
	//load
	p.load(fis);
		
	}
	public String GetBrowser() {

		String browser = p.getProperty("browser");
		return browser;
		
		}
	public String GetUrl() {
 
		String url = p.getProperty("url");
		return url;
		
		
		
		
	}

}
