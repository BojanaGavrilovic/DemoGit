package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTests {

	
	@Test
	public void DemoTest () throws IOException {
		
System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		
	}
	
	
	
}
