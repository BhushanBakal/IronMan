package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindEleandFindElemts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BhushanB2\\eclipse-workspace\\IronMan\\src\\test\\java\\com\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://Google.com");
		
		WebElement searchBox= driver.findElement(By.xpath("//input[@name='qS']"));
		searchBox.sendKeys("Bhushan");
		
		driver.quit();

	}

}
