package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BhushanB2\\eclipse-workspace\\IronMan\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://Amazon.com");
		driver.navigate().to("https://google.com"); 
		
		driver.navigate().back();
		driver.navigate().forward();
		
		
		driver.close();
	}
	
	
	

}
