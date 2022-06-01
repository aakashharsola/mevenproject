package Sauce_demo_testclass;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Sause_demo.POMClasses.Productpage_saucedemo_pomclass;
import com.Sause_demo.POMClasses.UtilityClass;
import com.Sause_demo.POMClasses.cart_saucedemo_pomclass;

import TestNG_Baseclass.SauceDemo_baseClass;

public class saucedemo_TC005_chekout extends SauceDemo_baseClass {
	
	
	Productpage_saucedemo_pomclass product;
	cart_saucedemo_pomclass chek;
	
	@Test
	public void chekout() throws InterruptedException, IOException {
		
		product = new Productpage_saucedemo_pomclass(driver);
		chek = new cart_saucedemo_pomclass(driver);
		
		product.product_bikelight();
		System.out.println("product is selected");
		
		product.cartbutton();
		
		Thread.sleep(2000);
		
		chek.checkout();
		Thread.sleep(2000);
		
		UtilityClass.screenshot(driver);
		
		
		
	}

}
