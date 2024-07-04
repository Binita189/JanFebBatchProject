package seleniumBasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SysnchronizationConcept {
	// Synchronization -> synch between application loading and automation execution
	
	// Types of synchronization:
		// 1. Static wait ->pause in execution, Thread.sleet(5000);
		// 2. Dynamic wait -> pause execution for defined amount of time until element is found, if found continue execution
			// a. Implicit wait -> global wait, defined once application for all elements where action is going to be perform
			// b. Explicit wait -> defined for a specific element
				// Fluent wait -> polling/frequency of search
	
	// 0-5 -10-15-20----20sec---3|11|16=10sec wastage
	// 0-2-2-6-8-10-12-16-18-20----20sec------3|11|16=2sec wastage

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/binitarai/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Actions action = new Actions(driver);
		WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
		
		Thread.sleep(3000); // static wait
		action.moveToElement(accountList).build().perform();
		
		
		// Explicit wait
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement primeMenuOption =driver.findElement(By.id("nav-link-amazonprime"));
		explicitWait.until(ExpectedConditions.visibilityOf(primeMenuOption));
		explicitWait.until(ExpectedConditions.elementToBeClickable(primeMenuOption));
		action.moveToElement(primeMenuOption).build().perform();
		
		// Fluent wait
		FluentWait<WebDriver> fl = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		WebElement flagIcon = driver.findElement(By.id("icp-nav-flyout"));
		fl.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("icp-nav-flyout")));
		action.moveToElement(flagIcon).build().perform();
		
	Thread.sleep(3000);
		driver.close();
		

	}

}
