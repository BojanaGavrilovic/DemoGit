package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTests {

	
	@Test
	public void DemoTest () {
		
System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
	}
	
	
	
}
