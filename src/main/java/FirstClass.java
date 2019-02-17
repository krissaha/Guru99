import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Krishnendu\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/V4/index.php");
		driver.navigate().to("http://google.co.in");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.findElement(By.tagName("title")).getText());
		
		 TargetLocator test = driver.switchTo();
		  Alert test1 = test.alert();
		  String s = test1.getText();
		  //driver.switchTo().alert().
		//driver.quit();
		
		//System.out.println(System.getProperty("webdriver.chrome.driver"));
		
	}
}
