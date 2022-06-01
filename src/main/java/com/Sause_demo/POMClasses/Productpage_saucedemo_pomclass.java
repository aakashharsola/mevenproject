package com.Sause_demo.POMClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Productpage_saucedemo_pomclass {
	
	
	private WebDriver driver;
	Select dropdown;
	
	//product 1 
	@FindBy(xpath="//button[contains(@id,'add-to-cart-sauce-labs-backpack')]")
	private WebElement product_bag;
	
	public void product_bag() {
		product_bag.click();
	}
  
	// product 2
	@FindBy(xpath="//button[contains(@id,'add-to-cart-sauce-labs-bike-light')]")
	private WebElement product_bikelight;
	
	public void product_bikelight() {
		product_bikelight.click();
		
			}
	 
	// product 3
	@FindBy(xpath="//button[contains(@id,'add-to-cart-sauce-labs-bolt-t-shirt')]")
	private WebElement product_tshirt;
	
	public void product_tshirt() {
		product_tshirt.click();
		
	}
	//product 4
	@FindBy(xpath="//button[contains(@id,'add-to-cart-sauce-labs-fleece-jacket')]")
	private WebElement product_jacket;
	
	public void produc_jacket() {
		product_jacket.click();
		
	}
	//product 5
	@FindBy(xpath="//button[contains(@id,'add-to-cart-sauce-labs-onesie')]")
	private WebElement product_onesie;
	
	public void produc_onesie() {
		product_onesie.click();
		
	}
	
	//porduct 6
	@FindBy(xpath="//button[contains(@id,'add-to-cart-test.allthethings()-t-shirt-(red)')]")
	private WebElement product_redtshirt;
	
	public void produc_redtshirt() {
		product_redtshirt.click();
		
		
	}
	
	@FindBy(xpath="//button[contains(@id,'react-burger-menu-btn')]")
	private WebElement menubutton;
	
	public void menubutton() {
		menubutton.click();
		
	}
	@FindBy(xpath="//a[contains(@id,'inventory_sidebar_link')]")
	private WebElement allitem;
	
	public void allitem() {
		allitem.click();
	}
		
		@FindBy(xpath="//a[@id='logout_sidebar_link']")
		private WebElement logout;
		
		public void logout() {
			logout.click();
			
		
		}
		@FindBy(xpath="//select[@class= 'product_sort_container']")
		
		
		
		private WebElement Select;
		
		public void list() throws InterruptedException {
			dropdown = new Select(Select);
			
			for(int i=0;i<3;i++) {
				dropdown.selectByIndex(i);
				Thread.sleep(2000);
				
			}
			
		}
		
		@FindBy(xpath="shopping_cart_link")
		private WebElement cart;
		
		public void cart() {
			
			cart.click();
			
		}
		@FindBy(xpath="//a[@class='shopping_cart_link']")
		private WebElement Cartcount;
		
		public String cartcount() {
			String count = Cartcount.getText();
			return count;
		}
		
		private String title;
		public String homeTitle() {
			
			title = driver.getTitle();
			
			return title;
		}
		
		@FindBy(xpath="//a[@class='shopping_cart_link']")
		private WebElement cartbutton;
		
		public void cartbutton() {
			cartbutton.click();
		}
		
		
		
		
		  
		public Productpage_saucedemo_pomclass(WebDriver driver) {
			
			this.driver = driver;
			
			PageFactory.initElements(driver, this);
		}
		
}