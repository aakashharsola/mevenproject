package com.Sause_demo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Loginpage_pomclass {
	
	private WebDriver driver;
	
	//inspect username
	@FindBy(xpath="//input[contains(@id,'user-name')]")
	private WebElement username;
	
	//perform action on username
	
	public void username() {
		
		username.sendKeys("standard_user");
	}
	
	@FindBy(xpath="//input[contains(@id,'password')]")
	private WebElement password;
	
	public void password() {
		password.sendKeys("secret_sauce");
		
	}
	
	@FindBy(xpath="//input[contains(@id,'login-button')]")
	private WebElement loginbutton;
	
	
	public void loginbutton() {
		
		loginbutton.click();
		
	}
	
	public Loginpage_pomclass (WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	
}
