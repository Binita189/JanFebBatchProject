package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupTest {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","/Users/binitarai/Downloads/chromedriver-mac-arm64/chromedriver");
			// chromedriver path from your system
			// -> windows ->
			// -> mac -> copy paste pathttps://www.zillow.com/h of the chromedriver - no need to provide file extension
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");

	}

}
