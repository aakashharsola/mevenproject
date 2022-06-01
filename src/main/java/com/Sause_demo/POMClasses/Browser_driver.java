package com.Sause_demo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_driver {
	
	
	
	public WebDriver Browser_open() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\software setup\\selenim\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.get("https://www.saucedemo.com/");
		return driver;
		
		
	}
   

}