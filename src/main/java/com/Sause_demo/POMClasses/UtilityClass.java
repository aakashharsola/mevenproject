package com.Sause_demo.POMClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
	
	 //static WebDriver driver;
	 static String log[]= new String[2];
	 static FileInputStream file;
	 static XSSFWorkbook book;
	 static XSSFSheet sheet;
	 
	 static Loginpage_pomclass li;
	
	public static void screenshot(WebDriver driver) throws IOException {
		//driver = new ChromeDriver();
		
		Date d= new Date();
		DateFormat d1= new SimpleDateFormat ("MM-DD-YY HH-MM-SS");
		String date= d1.format(d);
		String title = driver.getTitle();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/SauceDemoProjectV1"+title+"_"+date+".jpg");
		FileHandler.copy(source, dest);
		
	
	}
   
	
	public static String[]  excelsheet() throws IOException {
		
		 file = new FileInputStream("E:\\amezonScreenShot\\Login.xlsx");
		
		 book = new XSSFWorkbook(file);
		
		 sheet = book.getSheet("Login Data");
		log[0]= sheet.getRow(0).getCell(2).getStringCellValue();
		log[1]=sheet.getRow(1).getCell(2).getStringCellValue();
		
		return log;
		
		 		
	}
	
//	public void loginMethod() throws IOException {
//		
//		li= new Loginpage_pomclass(driver);
//		 
//		 li.username();
//		 
//		 li.password();
//		
//		 li.loginbutton();
//	}
}
