package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.Home.DemoHomePage;

import io.github.bonigarcia.wdm.ChromiumDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstProgramTest 
{
	@Test
	public void TC01() throws InterruptedException
	{
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.edgedriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		DemoHomePage dhp1 = new DemoHomePage(driver);
		dhp1.click_on_register();
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test
	public void TC02() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		DemoHomePage dhp1 = new DemoHomePage(driver);
		dhp1.click_on_shoppingcart();
		Thread.sleep(2000);
		driver.close();
	}

}
