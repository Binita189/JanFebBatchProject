package seleniumBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingConfigfFileCrossBrowserTestingScreenshot {
	static Properties prop;
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// handling config.properties(configuration file/data)
		try {
			// 1. properties class
			prop = new Properties();
			// 2. FileInputStream class
			FileInputStream fis = new FileInputStream("/Users/binitarai/eclipse-workspace24/JanFebProject/src/seleniumBasics/config.properties");
			// 3. load all the value read to properties class
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// cross bowser testing concept
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
			System.setProperty(prop.getProperty("chromeKey"), prop.getProperty("chromePath"));
			driver = new ChromeDriver();
		}else if(prop.getProperty("browser").equalsIgnoreCase("firefox") || prop.getProperty("browser").equalsIgnoreCase("ff"))	 {
			System.setProperty(prop.getProperty("ffKey"), prop.getProperty("ffPath"));
			driver = new FirefoxDriver();
			
		} else if (prop.getProperty("browser").equalsIgnoreCase("msedge") || prop.getProperty("browser").equalsIgnoreCase("edge")) {
			System.setProperty(prop.getProperty("edgeKey"), prop.getProperty("edgePath"));
			driver = new EdgeDriver();
			System.err.println("Not a supported browser for testing");
		}
		
//		System.setProperty(prop.getProperty("chromeKey"), prop.getProperty("chromePath"));
//	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		Actions action = new Actions(driver);
		WebElement accountList = driver.findElement(By.id("nav-link-accountList"));
		
//		Thread.sleep(3000); // static wait
		action.moveToElement(accountList).build().perform();
		
		// screenshot1
		try {
			File screenshot1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot1, new File("/Users/binitarai/eclipse-workspace24/JanFebProject/src/seleniumBasics/screenshot1.png")); // common IO package -> https://commons.apache.org/proper/commons-io/
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement primeMenuOption =driver.findElement(By.id("nav-link-amazonprime"));
		explicitWait.until(ExpectedConditions.visibilityOf(primeMenuOption));
		explicitWait.until(ExpectedConditions.elementToBeClickable(primeMenuOption));
		action.moveToElement(primeMenuOption).build().perform();
		
		//screenshot2
		
		try {
			File screenshot2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot2, new File("/Users/binitarai/eclipse-workspace24/JanFebProject/src/seleniumBasics/screenshot2.png")); // common IO package -> https://commons.apache.org/proper/commons-io/
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		FluentWait<WebDriver> fl = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		WebElement flagIcon = driver.findElement(By.id("icp-nav-flyout"));
		fl.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("icp-nav-flyout")));
		action.moveToElement(flagIcon).build().perform();
		
		//screenshot3
		
		try {
			File screenshot3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot3, new File("/Users/binitarai/eclipse-workspace24/JanFebProject/src/seleniumBasics/screenshot3.png")); // common IO package -> https://commons.apache.org/proper/commons-io/
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// screenshot of element 
//		File screenshot4 = flagIcon.getScreenshotAs(OutputType.FILE);
		
		try {
			File screenshot4 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot4, new File("/Users/binitarai/eclipse-workspace24/JanFebProject/src/seleniumBasics/screenshot4.png")); // common IO package -> https://commons.apache.org/proper/commons-io/
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
		driver.close();

	}

}
