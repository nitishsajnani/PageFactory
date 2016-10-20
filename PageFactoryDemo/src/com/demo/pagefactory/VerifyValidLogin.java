package com.demo.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.browser.factory.Browserfactory;

public class VerifyValidLogin {

	
	
	@Test
	public void checkvaliduser()
	{
		
		WebDriver driver= Browserfactory.startbrowser("Chrome","https://www.goibibo.com");
		
	LoginPage logindetails=PageFactory.initElements(driver, LoginPage.class);
	logindetails.login_wordpress("nitish.sajnani18@gmail.com","Nitish@9899");
	//login successful
	}
	
}
