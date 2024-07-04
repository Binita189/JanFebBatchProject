package seleniumBasics;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingIframeDragAndDrop {

	private static final List<WebElement> iframe = null;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/binitarai/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/"); 
		
//		driver.findElement(By.id("draggable"));
		
		// before handling iframe
//		WebElement draggableObject = driver.findElement(By.id("draggable)")); // NosuchelementEception
		
		// findElement() vs findElements()
		List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		System.out.println("Number of iframes: "+iframes.size());
		
		WebElement singleIframe = iframes.get(0);
//		String iframeTxt = singleIframe.getText();
		
		// switch to iframe
		
		driver.switchTo().frame(singleIframe);
//		driver.switchTo().frame(iframeTxt);
//		driver.switchTo().frame(0);
		
		// after handling iframe
		WebElement draggableObject = driver.findElement(By.id("draggable"));
		WebElement dropLocation = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		// Drag and Drop operation
		// #1
		action.moveToElement(dropLocation).build().perform();		
		action.clickAndHold().build().perform();
		action.moveToElement(dropLocation).build().perform();
		action.release().build().perform();
		
		//#2
		action.click(dropLocation).build().perform();
		action.release(dropLocation).build().perform();
		
		//#3
		action.clickAndHold(draggableObject).release(dropLocation).build().perform();
		
		//#4
		action.dragAndDrop(draggableObject, dropLocation).build().perform();
		
		
		
		Thread.sleep(0);
		driver.close();

	}

}
