package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchCode {
	
	WebDriver driver;

	public static void main(String[] args) {
		BrowserLaunchCode a = new BrowserLaunchCode();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BhushanB2\\eclipse-workspace\\IronMan\\src\\test\\java\\com\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://spotify.com/in-en/");
		//a.browserLaunch();
		a.checkElementEnable();
	
		a.driverClose();
	}
		
		public void browserLaunch() {
			
			
			
			//page title
			System.out.println(driver.getTitle());
			
			//pageURl
			System.out.println(driver.getCurrentUrl());
			
			
			//page source
			System.out.println(driver.getPageSource());
			
			driver.close();
		}

		
		public void checkElementEnable() {
			
			driver.findElement(By.xpath("//div[@class=\"sc-leFDRL feKByR\"]//div//a//div//span[text()='Get 3 months free']")).click();
			System.out.println(driver.findElement(By.xpath("//input[@id='login-username']")).isDisplayed());
			
		}
			
		
		
		public void driverClose() {
			driver.close();
		}
		
		
		
	}



//driver.findElement(By.xpath("//div[@class='CommunitySection_root__hBD2Y']//a")).click();
		//driver.findElement(By.xpath("//div[@class='CategorySection_categoryList__2QGTN']//a[contains(text(),'Available plans')]")).click();

		//driver.findElement(By.xpath("//div[@class='mh-container svelte-1irxfym']//li[6]/a")).click();
		//driver.findElement(By.xpath("//div[@class='mh-brand-wrapper svelte-1irxfym']//a")).click();
		//driver.findElement(By.xpath("//header[@class=\"sc-hTZhsR cQSaWH\"]//div[3]//a")).click();
		//driver.findElement(By.xpath("//footer[@id='mh-footer']//div//dd[5]/a")).click();

