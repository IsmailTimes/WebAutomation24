package RunTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumRunTest {

	public static void main(String[] args) {
		// ChromDriver is a class
		// WebDriver is a interface which can be executed in any browser.
		// ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/Users/ISMAIL/utilities/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/#index");
		String title = driver.getTitle();
		System.out.println("Title of the web page is: " + title);
		String url = driver.getCurrentUrl();
		System.out.println("URL of the page is: " + url);

		driver.close();// Only close the current window
		driver.quit();// This will close all associated window opened by selenium
	}

}
