package com.Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandlingStatic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BhushanB2\\eclipse-workspace\\IronMan\\src\\test\\java\\com\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/hotels/hotel-listing/?checkin=05132022&city=CTGOI&checkout=05142022&roomStayQualifier=2e0e&locusId=CTGOI&country=IN&locusType=city&searchText=Goa&visitorId=bd7a4481-24b1-4957-9a55-b588d77bc567&regionNearByExp=3");

	List<WebElement> dropBox=  driver.findElementsById("city");
	
		
		//WebElement dropBox=driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']"));
		
		for(WebElement wb:dropBox) {
			wb.getText();
			System.out.println(wb.getText());
		}
		
	}

}
