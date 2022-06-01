package Sauce_demo_testclass;

import java.io.IOException;

import org.testng.annotations.Test;

import com.Sause_demo.POMClasses.Productpage_saucedemo_pomclass;
import com.Sause_demo.POMClasses.UtilityClass;

import TestNG_Baseclass.SauceDemo_baseClass;

public class saucedemo_TC003_filter  extends SauceDemo_baseClass{
	
	Productpage_saucedemo_pomclass list;
	
	
	@Test
	public void filter() throws InterruptedException, IOException {
		
		list = new Productpage_saucedemo_pomclass(driver);
		list.list();
		UtilityClass.screenshot(driver);
		
	}

}
