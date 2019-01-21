package com.guru.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginTest 
{
	public static WebDriver driver;
	
	
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Krishnendu\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	
	
	
	@Test
	public void action()
	{
		// Enter UserID
		driver.findElement(By.xpath("//tr[.//td[text()='UserID']]//td[2]//input")).sendKeys("mngr174719");
		driver.findElement(By.xpath("//tr[.//td[text()='Password']]//td[2]//input")).sendKeys("vygenur");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
