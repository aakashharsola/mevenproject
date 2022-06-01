package com.Sause_demo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cart_saucedemo_pomclass {
	
	private WebDriver driver;
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement chekout;
	
	public void checkout() {
		chekout.click();
	}

	@FindBy(xpath="//button[@id='remove-sauce-labs-bike-light']")
	private WebElement remove;
	
	public void remove() {
		remove.click();
	}
	
	
	public cart_saucedemo_pomclass (WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
