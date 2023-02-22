package com.learnautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.BrowserFactory;

public class LoginTestCRM extends BaseClass {

/*	WebDriver driver;
	
	@BeforeClass
	
	public void setup()
	{
		driver=BrowserFactory.startApplication(driver, "Chrome", "https://www.profitus.com/users/login");
	}
	@AfterClass
	public void tearDown()
	{
		BrowserFactory.quitBrowser(driver);
	}
*/	

	@Test
	public void loginApp()
	{
		
//		ExcelDataProvider excel=new ExcelDataProvider();
		
		System.out.println("step 1");
		LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		System.out.println("step 2");
		System.out.println(driver.getTitle());	
		System.out.println("step 3");
		loginPage.loginToCRM(excel.getStringData("Logi", 0, 0), excel.getStringData("Logi", 0, 1));
		System.out.println("step 4");

	}
	
}
