package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	@FindBy(xpath="//*[@id=\"username\"]") WebElement uname;

//	@FindBy(name="email") WebElement uname;
	@FindBy(xpath="//*[@id=\"password\"]") WebElement pass;

//	@FindBy(name="password") WebElement pass;

	
	@FindBy(xpath="/html/body/div[1]/div/div/div/div/div[1]/div/div/div/div[2]/div[2]/div/form/div[7]/button") WebElement loginButton;
	
	
	public void loginToCRM( String usernameApplication, String passwordApplication)
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
	
		}
		
		uname.sendKeys(usernameApplication);
		pass.sendKeys(passwordApplication);
		loginButton.click();
	}
}
