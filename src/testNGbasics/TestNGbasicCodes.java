package testNGbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGbasicCodes {
	
	// @Test -> test annotation to test method
	
	@Test 
	public void handlingWindows() {
		System.setProperty("webdriver.chrome.driver", "//Users/binitarai/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/windows"); 
//		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Click Here")).click(); // new window will open
		driver.findElement(By.linkText("Click Here")).click();
		
		Set<String> handles = driver.getWindowHandles(); // getWindowHandles() -> return set of window handle of all window
		Iterator<String> it = handles.iterator();
		
		while(it.hasNext()) {
			String handle = it.next();
			driver.switchTo().window(handle);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			driver.close();
		}
		
		
	}
	@Test 
	public void handlingAlert() {
		System.setProperty("webdriver.chrome.driver", "/Users/binitarai/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V1/html/DeleteCustomerInput.php");
		driver.findElement(By.name("cusid")).sendKeys("test");
		driver.findElement(By.name("submit")).click();
		
		driver.switchTo().alert().accept();
		
		String alert2 = driver.switchTo().alert().getText();
		System.out.println(alert2);
		driver.switchTo().alert().accept();		
		driver.close();
		
	}
	

}
