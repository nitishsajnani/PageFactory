package com.demo.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
WebDriver driver;

public LoginPage(WebDriver driver)
{
	this.driver=driver;
}



	@FindBy(id="id_username") WebElement username;
	@FindBy(how=How.ID ,using="id_password") WebElement password;
	
	@FindBy(how=How.XPATH, using=".//*[@id='signinBtn']")
	WebElement submitbutton;
	
@FindBy(how=How.LINK_TEXT, using="Sign In")

WebElement click;
	
@FindBy(how=How.ID, using="authiframe")
WebElement dswitch;

public void login_wordpress(String UID, String pswd)
{
	click.click();
	driver.switchTo().frame(dswitch);
	username.sendKeys(UID);
	password.sendKeys(pswd);
	submitbutton.click();
}
}