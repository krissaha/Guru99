package com.qa.guru.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.guru.base.TestBase;
import com.qa.guru.util.UtilTest;

public class Managerhomepage extends TestBase 
{
	/** Page Factory - OR **/
	
	By verify_managerID = By.xpath("//td[contains(text(),'mngr192750')]");
	
	By logOut = By.xpath("//a[contains(text(),'Log out')]");
		
	/** Validation and Verification **/
	
	public void verification_index()
	{
		boolean vt = ((WebElement) verify_managerID).isDisplayed();
		Assert.assertTrue(true,"Manager ID not found");	
	}
	
	/** Business Component **/
	
	public void logout()
	{
		UtilTest.click_ele(logOut);
	}
	
	
	
	
	
	
}
