package com.qa.guru.base;

import com.qa.guru.util.UtilTest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;

	@BeforeTest
	@SuppressWarnings("deprecation")
	public void init() {
		
		/** Read Config file  **/
		
		try {
			prop = new Properties();
			FileInputStream fi;
			fi = new FileInputStream(
					"C:\\\\Users\\\\DELL\\\\eclipse-workspace\\\\Guru99\\\\src\\\\main\\\\java\\\\com\\\\qa\\\\guru\\\\config\\\\Config.properties");
			prop.load(fi);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		/** Browser Initialization  **/
		
		String browser = prop.getProperty("Browser");
		if (browser.equals("CHROME")) {
			System.setProperty("webdriver.chrome.driver", "D:\\\\\\\\Krishnendu\\\\\\\\Selenium\\\\\\\\chromedriver.exe");
			
			 ChromeOptions options = new ChromeOptions();
			 options.addArguments("--incognito");
			 DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			 capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			 driver = new ChromeDriver(capabilities);
		} else if (browser.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "/Users/krishnendu/Selenium/geckodriver");
			driver = new FirefoxDriver();
		} 
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("Url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(UtilTest.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(UtilTest.IMPLICIT_WAIT, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
