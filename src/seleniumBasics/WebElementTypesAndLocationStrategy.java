package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementTypesAndLocationStrategy {
	
	// sSelenium Automation:
		// 1. Locate the element(WebElement/WebObject/GUI(Graphical User Interface)object of element)
		// 2. perform action
		// 3. validate action performed
	
		// WebElement of WebObjects or GUI(Graphical User Interface)objects of elements:
			// Types:
				// 1. Text Box/Field: user can input some characters
				// 2. Button/Tab: user can input to click on it
				// 3. Radio Button: user input to click to select, "Round button"
				// 4. Check box: user input to click to select,  "check marks"
				// 5. Links: click takes user to different page or application
				// 6. Text: to provide information
				// 7. Drop Down: clicking on it more options are visible -> static or Dynamic
				// 8. Main/Menu link: high value feature/product/flow
				// 9. Pictures/videos:
	
	
		// Strategy to locate webElement:
			// Types:
				// 1. Name: value pointed mostly are unique, most commonly used
				// 2. ID: value pointed mostly are unique, most commonly used
				// 3. LinkText: text of the link itself
				// 4. partial LInkText: input portion of the link
				// 5. className: mostly unique value, mostly not helpful to identify an element alone
				// 6. tagName: generic name not able to identify an element but helps to identify groups of elements
				// 7. xpath: can be used when nothing works, works, copy or customizable
				// 8. Css selector: can be used when nothing works, works, copy or customizable
		
	// Understanding DOM:
	// <input type="text" name="userName" size="10">
		// 1. tagName - input
		// 2. attribute - type/name/size/pb-role
		// 3. value - text/userName/10/username
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/binitarai/Downloads/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://demo.guru99.com/test/newtours/index.php");
		driver.get("https://www.amazon.com/");
//		Thread.sleep(5000);
		
		// Identify element: -> Name and ID
//		WebElement userNameTextField = driver.findElement(By.name("userName"));
//		userNameTextField.sendKeys("test");
//		Thread.sleep(5000);
//		WebElement passwordTextField =driver.findElement(By.name("password"));
//		passwordTextField.sendKeys("123");
//		Thread.sleep(5000);
//		driver.findElement(By.name("submit")).click();
		
		// creating verification point
//		String expectedLoginSuccessPageurl = "https://demo.guru99.com/test/newtours/login_sucess.php";
//		String actualLoginSuccessPageurl = driver.getCurrentUrl();
//		if(actualLoginSuccessPageurl.equals(expectedLoginSuccessPageurl)) {
//			System.out.println("Positive login functionality test: Passed");
//		}else {
//			System.err.println("Positive login functionality test: Failed");
//		}
		
		// handling linkText
//		driver.findElement(By.linkText("SIGN-OFF")).click();
//		Thread.sleep(5000);
//		driver.findElement(By.linkText("REGISTER")).click();
//		Thread.sleep(5000);
//		String expectedRegisterPageTitle = "Register: Merury Tours";
//		String actualRegisterPageTitle = driver.getTitle();
//		if(actualRegisterPageTitle.equals(expectedRegisterPageTitle)) {
//			System.out.println("Register link fnctionality test: Passed");
//			
//		}else {
//			System.err.println("Register link functionality test: Failed");
//		}
		
		// using ID strategy
		String productToSearch = "apple";
		WebElement searchTxtField = driver.findElement(By.id("twotabsearchtextbox"));
		searchTxtField.sendKeys(productToSearch);
		Thread.sleep(3000);
		driver.findElement(By.id("nav-search-submit-button"));
		Thread.sleep(3000);
		String actualProductSearchPageUrl = driver.getCurrentUrl();
		if(actualProductSearchPageUrl.contains(actualProductSearchPageUrl)) {
			System.out.println("Search functionality test: Passed");
		}else {
			System.err.println("Search functionality test: Failed");
			
		}
			
		
		
		Thread.sleep(3000);
		driver.close();

	}

}
