package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumBasicScripts {

	public static void main(String[] args) throws InterruptedException {
		// 1. Browser / path of the driver 
		System.setProperty("webdriver.chrome.driver", "/Users/binitarai/Downloads/chromedriver-mac-arm64/chromedriver");
		// 2. Instance/Object of ChromeDriver pointing toward parent class WebDriver -> polymorphism
//		ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		// maximizing the browser size
		driver.manage().window().maximize();
		// 3. load application - url
		driver.get("https://www.amazon.com");
		
		// Test script
		
		// pause execution
		Thread.sleep(5000);
		
		// for closing browser
		driver.close();
		
		

	}

}
