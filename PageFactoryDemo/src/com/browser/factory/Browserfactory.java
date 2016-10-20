package com.browser.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserfactory {
	
	
	static WebDriver driver;
	
	public static WebDriver startbrowser(String browserName, String url)
	{
		
		if(browserName.equals("firefox"))
			
		{
			driver=new FirefoxDriver();
		}
		
		
		else if(browserName.equals("Chrome"))
	
		{System.setProperty("webdriver.chrome.driver", "E://Selenium Class/chromedriver.exe");
			driver=new ChromeDriver();
			
			
		}
		driver.manage().window().maximize();
		driver.get(url);
	
		return driver;
	}

}
