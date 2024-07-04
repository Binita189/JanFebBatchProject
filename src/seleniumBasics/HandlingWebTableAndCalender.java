package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTableAndCalender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/binitarai/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
//		Thread.sleep(3000);
		// handling table
//		WebElement firstOfferDestination = driver.findElement(By.xpath("//table[@width='270']/tbody/tr[1]/td[1]/font"));
//		System.out.println(firstOfferDestination.getText());
//		WebElement firstOfferAmount = driver.findElement(By.xpath("//table[@width='270']/tbody/tr[1]/td[2]/div/font"));
//		System.out.println(firstOfferAmount.getText());
//		WebElement secondOfferDestination = driver.findElement(By.xpath("//table[@width='270']/tbody/tr[2]/td[1]/font"));
//		System.out.println(secondOfferDestination.getText());
//		WebElement secondtOfferAmount = driver.findElement(By.xpath("//table[@width='270']/tbody/tr[2]/td[2]/div/font"));
//		System.out.println( secondtOfferAmount.getText());
		
//		for(int i = 1; i<=5; i++) {
//			WebElement offerDestination = driver.findElement(By.xpath("//table[@width='270']/tbody/tr["+i+"]/td[1]/font"));
//			WebElement offerAmount = driver.findElement(By.xpath("//table[@width='270']/tbody/tr["+i+"]/td[2]/div/font"));
//			System.out.println("OFFER " +i+":");
//			System.out.println(offerDestination.getText()+ ":"+offerAmount.getText());
//		}

		WebElement offerTable = driver.findElement(By.xpath("//table[@width='270']/tbody"));
//		WebElement offerDestination = offerTable.findElement(By.xpath("//tr[1]/td[1]/font"));
//		System.out.println(offerDestination.getText());
//		System.out.println();
		

//		for(int i = 1; i<=5; i++) {
//			WebElement offerDestination = offerTable.findElement(By.xpath("//tr["+i+"]/td[1]/font"));
//			WebElement offerAmount = offerTable.findElement(By.xpath("//tr["+i+"]/td[2]/div/font"));
//			System.out.println("OFFER " +i+":");
//			System.out.println(offerDestination.getText()+ ":"+offerAmount.getText());
					
//		}
//		for(int i=1; i<=7; i++) {
//			WebElement menuLinksTable = driver.findElement(By.cssSelector("table[width='110']>tbody>tr>td>table>tbody"));
//			WebElement link = menuLinksTable.findElement(By.cssSelector("tr:nth-child("+i+")>td:nth-child(2)>font>a"));
//			String linkTxt = link.getText();
//			link.click();
//			System.out.println("Page Title of "+linkTxt+" : "+driver.getTitle());
//			driver.navigate().back();
		
			
		}

		
			
//			driver.close();
	}

//}
