package pactice.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// setup the chromedriver using WebDriverManager
				//WebDriverManager.chromedriver().setup();

				// Create driver object for Chrome
				WebDriver driver = new ChromeDriver();

				// Navigate to a URL
				driver.get("http://toolsqa.com");

				// quit the browser
				driver.quit();

	}

}
