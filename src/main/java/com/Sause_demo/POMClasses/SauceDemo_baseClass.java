package com.Sause_demo.POMClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.Sause_demo.POMClasses.Loginpage_pomclass;
import com.Sause_demo.POMClasses.Productpage_saucedemo_pomclass;
import com.Sause_demo.POMClasses.UtilityClass;

public class SauceDemo_baseClass {
	
	  protected WebDriver driver;
	  Logger log = Logger.getLogger("SauceDemoProjectva");
	  Productpage_saucedemo_pomclass logout ;
	  
	  
	  @BeforeClass
	  
	  public void beforeclass() {
		  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.get("https://www.google.com");
			
			log.info("browser is open");
			PropertyConfigurator.configure("log4j.properties");
			driver.get("https://www.saucedemo.com/");
			log.info("url is open");
			
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			
		  
	  }
	
	@BeforeMethod
	
	public void setup() throws InterruptedException, IOException {
		
		
		//login
		
		Loginpage_pomclass lp = new Loginpage_pomclass (driver);
		
		lp.username();
		log.info("enter user name");
		
		lp.password();
		log.info("enter passwoard");;
		
		lp.loginbutton();
		//UtilityClass.screenshot(driver);
		System.out.println("click on login button");
		
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException, IOException {
		//logout
		Thread.sleep(2000);
		 logout = new Productpage_saucedemo_pomclass(driver);
		 logout.menubutton();
		 UtilityClass.screenshot(driver);
		 
		 System.out.println("click on menu button");
			Thread.sleep(2000);

		 logout.logout();
		 Thread.sleep(5000);

		 
		 UtilityClass.screenshot(driver);
		 log.info("click on logout button");;
		
		
	}
	
	@AfterClass
	public void afterclass() throws InterruptedException, IOException {
		
		Thread.sleep(2000);
		driver.close();
		//UtilityClass.screenshot(driver);
		log.info("end of program");
		
		
	}
	

}
