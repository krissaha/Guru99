package com.qa.guru.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.qa.guru.base.TestBase;
import com.qa.guru.util.UtilTest;

public class IndexPage extends TestBase {
	
	/** Page Factory - OR **/

	By userID = By.xpath("//tr[.//td[text()='UserID']]//td[2]//input");
	
	By pass = By.xpath("//tr[.//td[text()='Password']]//td[2]//input");
	
	By reset = By.xpath("//input[@type='reset']");

	By submit = By.xpath("//input[@type='submit']");

	By index_1 = By.xpath("//a[contains(text(),'Demo Site')]");	
	
	
	/** Validation and Verification **/
	
	public void verification_index()
	{
//		String vt = ; //((WebElement) index_1).isDisplayed();
//		Assert.assertEquals(vt, "Demo Site", "Text not matching"); //(true,"Demo site Text not found !!!");
//		
//		String s = driver.getTitle();
//		Assert.assertEquals(s, "Guru99 Bank Home Page","title is not matching");
	}
	
	/** Business Component **/
	
	public Managerhomepage logIn() throws Throwable
	{
		//Thread.sleep(5000);
		UtilTest.type(userID, prop.getProperty("UserId"));
		UtilTest.type(pass, prop.getProperty("Password"));
		UtilTest.click_ele(submit);
		return new Managerhomepage();
	}
	
	public void logInfailed()
	{
		UtilTest.type(userID, "krisnendu");
		UtilTest.type(pass, "122345");
		UtilTest.click_ele(submit);
	}
	
	public void reset()
	{
		UtilTest.type(userID, "kr22@@@");
		UtilTest.type(pass, "122345");
		UtilTest.click_ele(reset);
	}
}
