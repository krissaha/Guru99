package com.guru.Test;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.guru.base.TestBase;
import com.qa.guru.pages.IndexPage;
import com.qa.guru.pages.Managerhomepage;

public class IndexTest extends TestBase {
	
	IndexPage ip;
	Managerhomepage mp;

	@BeforeMethod
	public void setup() {
		ip = new IndexPage();
		mp = new Managerhomepage();
	}

	@Test
	public void loginsuccess() throws Throwable {
		//ip.verification_index();
		mp = ip.logIn();
		mp.logout();
	}
	
//	@Test
//	public void loginFailed() throws Throwable {
//		ip.verification_index();
//		ip.logInfailed();
//	}	
	
	@Test
	public void reset() throws Throwable {
		ip.verification_index();
		ip.reset();
	}
	
}



























//@Test
//public void action()
//{
//	// Enter UserID
////	type("UserID","mngr174719");
////	type("Password","vygenur");
////	
////	void type(String location, String Value)
////	{		
////		String xpath = "//tr[.//td[text()='" +location+ "']]//td[2]//input";
////		driver.findElement(By.xpath(xpath)).sendKeys(Value);
////	}
////	driver.findElement(By.xpath("//tr[.//td[text()='UserID']]//td[2]//input")).sendKeys("mngr174719");
////	driver.findElement(By.xpath("//tr[.//td[text()='Password']]//td[2]//input")).sendKeys("vygenur");
//	driver.findElement(By.xpath("//input[@type='submit']")).click();
//}
