package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandlingRadioButtonAndCheckBoxDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/binitarai/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://demo.guru99.com/test/newtours/index.php");
//		driver.get("https://www.ebay.com/");
//		driver.get("https://www.amazon.com/");
//		driver.findElement(By.linkText("Flights")).click();
		
		
//		driver.findElement(By.id("businessaccount-radio")).click();
		
		
		// Handle Radio Button
		
//		driver.findElement(By.linkText("Flights")).click();
		// copying xpath
//		WebElement onewayTrip = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/"
//				+ "td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]"));
		// copying css selector
//		WebElement roundTrip = driver.findElement(By.cssSelector("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/"
//				+ "tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1]"));
//		
//		onewayTrip.click();
//		roundTrip.click();
		
//		WebElement bussinessAccountRadioBtn = driver.findElement(By.id("businessaccount-radio"));
//		WebElement personalAccountRadioBtn = driver.findElement(By.id("personalaccount-radio"));
//		
//		Thread.sleep(3000);
//		bussinessAccountRadioBtn.click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("personalaccount-radio")).click();

		driver.get("https://www.amazon.com");
		
//		driver.findElement(By.id("icp-nav-flyout")).click();
//		WebElement spanishRadioBtn = driver.findElement(By.xpath("//*[@id=\"icp-language-settings\"]/div[3]/div/label/i"));
//		WebElement englishRadioBtn = driver.findElement(By.cssSelector("#icp-language-settings > div:nth-child(4) > div > label > i"));
//		Thread.sleep(3000);
//		spanishRadioBtn.click();
//		
//		Thread.sleep(3000);
//		englishRadioBtn.click();
//		if(spanishRadioBtn.isSelected()) {
//			System.out.println("Spanish Radio Button test functionality, selected: Passed");
//		}else {
//			System.err.println("Spanish Radio Button test functionality, selected: Failed");
//		}
//		
//		Thread.sleep(3000);
//		
//
//		if(englishRadioBtn .isSelected()) {
//			System.out.println("English Radio Button test functionality, selected: Passed");
//		}else {
//			System.err.println("English Radio Button test functionality, selected: Failed");
//		}
		//Handling checkBox
//		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
//		driver.findElement(By.cssSelector("#ap_email")).sendKeys("test@gmail.com");
//		Thread.sleep(3000);
//		driver.findElement(By.id("continue")).click();
//		Thread.sleep(3000);
		
//		driver.findElement(By.name("password")).sendKeys("123");
//		WebElement rememberMechekBx = driver.findElement(By.name("rememberMe"));
//		Thread.sleep(3000);
//		rememberMechekBx.click();
//	
//		if(rememberMechekBx.isSelected()) {
//			System.out.println("Remember me check box test functionality, selected: Passed");
//		}else {
//			System.err.println("Remember me check box test functionality, selected: Failed");
//		}
//		Thread.sleep(3000);
//		if(!rememberMechekBx.isSelected()) {
//			System.out.println("Remember me check box test functionality, delected: Passed");
//		}else {
//			System.err.println("Remember me check box test functionality, delected: Failed");
//		}
//		rememberMechekBx.click();
		
		
		// handling drop down -> 1. static drop down -> select tagName, select class -> a. visible text b. index       
							  // 2. Dynamic drop down -> mouse & keyboard operation
//		driver.findElement(By.xpath("//*[@id=\"a-page\"]/div[1]/div[1]/div/a/i")).click();
		WebElement allDropDown = driver.findElement(By.id("searchDropdownBox"));
	    Select select = new Select(allDropDown);
	    Thread.sleep(3000);
	    // a. visible txt
//	    select.selectByVisibleText("Amazon Devices");
//	    Thread.sleep(3000);
//	    select.selectByVisibleText("Appliances");
	    // b. index 
//	    Thread.sleep(3000);
//	    select.selectByIndex(7);
//	    Thread.sleep(3000);
//	    select.selectByIndex(8);
//	    // c. value of option
//		Thread.sleep(3000);
//		select.selectByValue("search-alias=financial");
//		Thread.sleep(3000);
//		select.selectByValue("search-alias=gift-cards");
		
		for(int i=0; i<=10; i++) {
			select.selectByIndex(i);
			Thread.sleep(2000);
			
		}
		
		Thread.sleep(3000);
		driver.close();
		

	}

}
