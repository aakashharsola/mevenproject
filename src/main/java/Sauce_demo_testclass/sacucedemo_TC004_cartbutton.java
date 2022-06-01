package Sauce_demo_testclass;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Sause_demo.POMClasses.Productpage_saucedemo_pomclass;
import com.Sause_demo.POMClasses.UtilityClass;

import TestNG_Baseclass.SauceDemo_baseClass;

public class sacucedemo_TC004_cartbutton extends SauceDemo_baseClass{
	
	Productpage_saucedemo_pomclass cart;
	
	
	@Test
	public void aadToCart() throws IOException, InterruptedException {
		
		cart = new Productpage_saucedemo_pomclass(driver);
		
		cart.product_bikelight();
		Thread.sleep(2000);
		System.out.println("product is added to cart");
		
		cart.cartbutton();
		
		Thread.sleep(2000);
		System.out.println("click on cart button");
		
		UtilityClass.screenshot(driver);
		
		System.out.println(cart.cartcount());
		
	}

}
