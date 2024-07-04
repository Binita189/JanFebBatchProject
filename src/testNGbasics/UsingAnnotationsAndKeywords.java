package testNGbasics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// Assertion - to create validation point
	// Verification Vs Validation -> will notify test case as pass or fail on assertion -> 1. comparing actual vs expected 2. if actual is true 3. if actual is false

public class UsingAnnotationsAndKeywords {
	
	WebDriver driver;
	
	@BeforeMethod(alwaysRun=true)
	public void initialization() {
		System.setProperty("webdriver.chrome.driver", "//Users/binitarai/Downloads/chromedriver-mac-arm64/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // selenium 4 Duration.ofSeconds(15)
		driver.manage().deleteAllCookies();
	}
	
	@AfterMethod(alwaysRun=true)
	public void tearDown() {
		
		driver.close();
	}
	
	@Test(groups={"Smoke Test","Regression Test"})
	public void positiveSearchFunctionalityTest() {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple");
		driver.findElement(By.id("nav-search-submit-text")).click();
		String actualTitle = driver.getTitle();
		String expectedTitle = "Amazon.com : apple";
		//Assertion -> creating validation point
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(driver.getCurrentUrl().contains("apple"));
		Assert.assertFalse(!driver.getTitle().contains("apple"));
		

		
	}
	
	@Test(groups={"Smoke Test","Integration Test","Regression Test"})
	public void positiveMenuLinkFunctionalityTest() {
		driver.findElement(By.linkText("Amazon Basics")).click();
		String actualTitle = driver.getTitle();
		String expectedTitle = "Amazon.com: Amazon Basics";
		//Assertion -> creating validation point
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(driver.getCurrentUrl().contains("AmazonBasics"));
		Assert.assertFalse(!driver.getTitle().contains("Amazon Basics"));
		
		
	}

}
