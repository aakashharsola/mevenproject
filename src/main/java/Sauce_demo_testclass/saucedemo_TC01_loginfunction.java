package Sauce_demo_testclass;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Sause_demo.POMClasses.Productpage_saucedemo_pomclass;
import com.Sause_demo.POMClasses.UtilityClass;

public class saucedemo_TC01_loginfunction extends com.Sause_demo.POMClasses.SauceDemo_baseClass{
	
	Productpage_saucedemo_pomclass pg;
	
	@Test
	
	public void Test_loginfunction() throws IOException {
		
		
		pg = new Productpage_saucedemo_pomclass(driver);
		
		String expectedTitle = "Swag Labs";
		
		String actualtilte = pg.homeTitle();
		
		//log.info();
		
		Assert.assertEquals(actualtilte, expectedTitle);
		UtilityClass .screenshot(driver);
		
		
	}
  

	
	
	
}
