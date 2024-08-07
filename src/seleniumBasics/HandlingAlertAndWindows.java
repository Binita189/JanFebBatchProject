package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertAndWindows {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/binitarai/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/V1/html/DeleteCustomerInput.php");
		driver.findElement(By.name("cusid")).sendKeys("test");
		driver.findElement(By.name("submit")).click();
		
		// Handle Alert - once alert handled control falls back to the page
		String alert1 = driver.switchTo().alert().getText();
		System.out.println(alert1);
//		driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		
		String alert2 = driver.switchTo().alert().getText();
		System.out.println(alert2);
		driver.switchTo().alert().accept();
		
		// without handling alert
		driver.findElement(By.name("res")).click();
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
