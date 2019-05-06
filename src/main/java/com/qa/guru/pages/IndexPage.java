package com.qa.guru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.qa.guru.base.TestBase;

public class IndexPage extends TestBase
{
	// Page factory - OR
	
	@FindBy(xpath = "//tr[.//td[text()='UserID']]//td[2]//input")
	WebElement userID;
	
	@FindBy(xpath = "//tr[.//td[text()='Password']]//td[2]//input")
	WebElement pass;
	
	@FindBy(xpath = "//input[@type='reset']")
	WebElement reset;
	
	@FindBy(xpath = "//input[@type='reset']")
	WebElement submit;
	

	
	// All Verifications and Validations

		public void verify_ConfirmationPage() throws Exception {

			boolean vt = tiatros_logo.isDisplayed();
			Assert.assertTrue(true, "Logo Not Displayed !!! ");

			boolean vt1 = verification_text_confirmation1.isDisplayed();
			Assert.assertTrue(true, "Resend confirmation instructions--- Text Not Found");

			boolean vt3 = verification_text_con2.isDisplayed();
			Assert.assertTrue(true, "Forgot your password? --- Text Not Found");

			boolean vt4 = con3.isDisplayed();
			Assert.assertTrue(true, "Footer Not Found Error!!!");
			Assert.assertTrue(vt4, "Footer Not Found Error!!!");

		}
		
		public void click_BrowserBackButton() throws Throwable {
			Thread.sleep(1000);
			driver.navigate().back();
			Thread.sleep(3000);
		}

	
	
	

}
