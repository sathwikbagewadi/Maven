package com.Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoHomePage 
{
	public DemoHomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//a[@href='/register']")
	WebElement register;
	
	@FindBy (xpath= "//a[@href='/login']")
	WebElement login;
	
	@FindBy (xpath="(//span[@class='cart-label'])[1]")
	WebElement shoppingcart;
	
	public void click_on_register()
	{
		register.click();
	}
	
	public void click_on_shoppingcart()
	{
		shoppingcart.click();
	}

}
