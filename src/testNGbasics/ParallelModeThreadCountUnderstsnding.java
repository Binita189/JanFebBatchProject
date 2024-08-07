package testNGbasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParallelModeThreadCountUnderstsnding {
	
	Properties prop;
	WebDriver driver;
	
	
//	@Parameters(value="browser") //single parameter
//	@Parameters(value={"browser","url"}) // multiple parameter
	@BeforeMethod(alwaysRun=true)
	public void initialization() {
		try {
			// 1. properties class
			prop = new Properties();
			// 2. FileInputStream class
			FileInputStream fis = new FileInputStream("/Users/binitarai/eclipse-workspace24/JanFebProject/src/testNGbasics/config.properties");
			// 3. load all the value read to properties class
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String browser = prop.getProperty("browser");
		
	
		
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty(prop.getProperty("chromeKey"), prop.getProperty("chromePath"));
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox") || browser.equalsIgnoreCase("ff"))	 {
			System.setProperty(prop.getProperty("ffKey"), prop.getProperty("ffPath"));
			driver = new FirefoxDriver();
			
		} else if (browser.equalsIgnoreCase("msedge") || browser.equalsIgnoreCase("edge")) {
			System.setProperty(prop.getProperty("edgeKey"), prop.getProperty("edgePath"));
			driver = new EdgeDriver();
			System.err.println("Not a supported browser for testing");
		}
		
//		System.setProperty(prop.getProperty("chromeKey"), prop.getProperty("chromePath"));
//	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
	}
	
	@AfterMethod(alwaysRun=true)
	public void tearDown() {
		driver.close();
		
	}
	

	@Test
	public void positiveSearchFunctionalityTest1() {
		String product = prop.getProperty("product1");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
		driver.findElement(By.id("nav-search-submit-text")).click();
		String actualTitle = driver.getTitle();
		String expectedTitle = "Amazon.com : "+product;
		//Assertion -> creating validation point
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(driver.getCurrentUrl().contains(product));
		Assert.assertFalse(!driver.getTitle().contains(product));
		

		
	}

	@Test
	public void positiveSearchFunctionalityTest2() {
		String product = prop.getProperty("product2");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
		driver.findElement(By.id("nav-search-submit-text")).click();
		String actualTitle = driver.getTitle();
		String expectedTitle = "Amazon.com : "+product;
		//Assertion -> creating validation point
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(driver.getCurrentUrl().contains(product));
		Assert.assertFalse(!driver.getTitle().contains(product));
		

		
	}

	@Test
	public void positiveSearchFunctionalityTest3() {
		String product = prop.getProperty("product3");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
		driver.findElement(By.id("nav-search-submit-text")).click();
		String actualTitle = driver.getTitle();
		String expectedTitle = "Amazon.com : "+product;
		//Assertion -> creating validation point
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(driver.getCurrentUrl().contains(product));
		Assert.assertFalse(!driver.getTitle().contains(product));
		

		
	}

	@Test
	public void positiveSearchFunctionalityTest4() {
		String product = prop.getProperty("product4");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(product);
		driver.findElement(By.id("nav-search-submit-text")).click();
		String actualTitle = driver.getTitle();
		String expectedTitle = "Amazon.com : "+product;
		//Assertion -> creating validation point
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(driver.getCurrentUrl().contains(product));
		Assert.assertFalse(!driver.getTitle().contains(product));
		

		
	}


}
