package com.Adactin_Project_Pom;

import java.awt.AWTException;
import java.awt.Checkbox;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod;

public class Base_Class_Pro {

	public static WebDriver driver;

	// 1 Browser Launch
	public static WebDriver getBrowser(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");

			driver = new ChromeDriver();

		}

		else if (type.equalsIgnoreCase("opera")) {

			System.setProperty("webdriver.opera.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");

			driver = new OperaDriver();

		}
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		return driver;
	}


	// 2 get
	public static void getUrl(String Url) {
		driver.get(Url);
	}

// 3 click
	public static void clickOnElement(WebElement element) {
		element.click();
	}

	// 4 sendkeys
	public static void inputValueElement(WebElement element, String value) {
		element.sendKeys(value);
	}

// 5 isEnabled
	public static void isEnabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}

	// 6 isDisplayed
	public static void IsDisplayed(WebElement Element) {
		boolean displayed = Element.isDisplayed();
		System.out.println("Displayed or Not :" + displayed);
	}

	// 7 isSelected
	public static void IsSelected(WebElement element) {
		boolean select = element.isSelected();
		System.out.println(select);
	}

	// 8 getAttribute
	public static void GetAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
	}

	// 9 getText
	public static void getText(WebElement ui) {
		String textget = ui.getText();
		System.out.println(textget);
	}

	// 10 Navigate To
	public static void Navigate(String i) {

		driver.navigate().to(i);
	}

	// 11 Back
	public static void back() {
		driver.navigate().back();
	}

	// 12 Forward
	public static void forward() {
		driver.navigate().forward();
	}

	// 13 Refresh
	public static void refresh() {
		driver.navigate().refresh();
	}

	// 14 getTitle
	public static void GetTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}
   
	// 15 CurrentUrl
	public static void currenturl() {
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
	}
	

	// 16 Thread.sleep
	public static void tread(int l) throws Throwable {
		Thread.sleep(l);
	}

	// 17 waitConcepts
	public static void implicitwait(long Value) {
		driver.manage().timeouts().implicitlyWait(Value, TimeUnit.SECONDS);
	}

	public static void explicitwait(WebElement element, int value) {
		WebDriverWait wait = new WebDriverWait(driver,value);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	

	// 18 frame
	public static void frames(WebElement element, String ame) {
		if (ame.equalsIgnoreCase("value")) {
			driver.switchTo().frame(0);

		} else if (ame.equalsIgnoreCase("Value")) {
			driver.switchTo().defaultContent();
		}
	}

	// 19 Robot
	public static void Vrobot(WebElement Element, String key) throws AWTException {
		Robot i = new Robot();
		if (key.equalsIgnoreCase("down")) {
			i.keyPress(KeyEvent.VK_DOWN);
			i.keyPress(KeyEvent.VK_DOWN);
		} else if (key.equalsIgnoreCase("enter")) {
			i.keyPress(KeyEvent.VK_ENTER);
			i.keyPress(KeyEvent.VK_ENTER);
		}
	}

	// 20 Single Dropdown
	public static void singledropdown(WebElement element, String ter, String kim) {
		Select s = new Select(element);
		if (ter.equalsIgnoreCase("Value")) {
			s.selectByValue(kim);

		} else if (ter.equalsIgnoreCase("text")) {
			s.selectByVisibleText(kim);

		} else if (ter.equalsIgnoreCase("index")) {
			int l = Integer.parseInt(kim);
			s.selectByIndex(l);
		}
	}

	// 21 Multiple Dropdown
	public static void Multipledropdown(WebElement dow, String po) {
    	 Select s1 = new Select(dow);
    	 if (po.equalsIgnoreCase("Is multiple")) {
    		 boolean multiple = s1.isMultiple();
    		 System.out.println(multiple); 
    		 }
	// 22 get options		 
		else if (po.equalsIgnoreCase("get options")) {
			List<WebElement> options = s1.getOptions();
			for (WebElement All_options : options) {
				String textoption = All_options.getText();
				System.out.println(textoption);
			}
			int sizeoption = options.size();
			System.out.println(sizeoption);
			}
    // 23 get all selected options
			else if (po.equalsIgnoreCase("get All option")){
				List<WebElement> all_Selected_Options = s1.getAllSelectedOptions();
				for (WebElement allselected : all_Selected_Options) {
					System.out.println(all_Selected_Options);
			}
				}
   	 // 24 get first options
			else if (po.equalsIgnoreCase("first option")) {
				WebElement first_Selected_Option = s1.getFirstSelectedOption();
				String textfirst = first_Selected_Option.getText();
				System.out.println(textfirst);
				}
		}

	// 25 Scroll
	public static void JavaScr(WebElement lop, String op) {

		JavascriptExecutor hi = (JavascriptExecutor) driver;
		if (op.equalsIgnoreCase("view")) {
			hi.executeScript("arguments[0].scrollIntoView();", lop);

		} else if (op.equalsIgnoreCase("By")) {
			hi.executeScript("window.scrollBy(0,2000)");
		}
	}
	
	// 26 Check box
	public static void check(WebElement lp) {
		lp.click();
		}

	// 27 Actions
	public static void Mouseover(WebElement gr,String br) {
		Actions jok = new Actions(driver);
		if (br.equalsIgnoreCase("context click")) {
			jok.contextClick().build().perform();

		} else if (br.equalsIgnoreCase("Moveto")) {
			jok.moveToElement(gr).build().perform();

		} else if (br.equalsIgnoreCase("double click")) {
			jok.doubleClick().build().perform();
		}
	}
    // 28 alert
	public static void alert(String jik) {
		Alert newalert = driver.switchTo().alert();
		if (jik.equalsIgnoreCase("Accept")) {
			newalert.accept();
		} else if (jik.equalsIgnoreCase("Dismiss")) {
			newalert.dismiss();
		} else if (jik.equalsIgnoreCase("gettext")) {
			String textalert = newalert.getText();
			System.out.println(textalert);
		}
	}
		// 29 windowHandles
	public static void windowHandes() {

		String parent_id = driver.getWindowHandle();
		Set<String> All_window = driver.getWindowHandles();
		for (String ok : All_window) {
			String titlewindow = driver.switchTo().window(ok).getTitle();
			System.out.println(titlewindow);	
		}
}
	// 30 clear
	public static void clear(WebElement bi) {
		bi.clear();

	}
	// 31 close
	public static void close() {
		driver.close();
}
	// 32 quit
	public static void quit() {
       driver.quit();
	}

	// 33  screenshot
	public static void screenshots(String oii) throws Throwable {
		TakesScreenshot ki = (TakesScreenshot)driver;
		File screenshottaken = ki.getScreenshotAs(OutputType.FILE);
		File destination = new File("path");
		FileUtils.copyFile(screenshottaken, destination);
		

	}
	
}	
	
	
	
	
		

	
	
	
	
	
	
	




