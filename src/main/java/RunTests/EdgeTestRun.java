package RunTests;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeTestRun {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:/Users/ISMAIL/utilities/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com/#index");
		String title = driver.getTitle();
		System.out.println("Title of the web page is: " + title);
		String url = driver.getCurrentUrl();
		System.out.println("URL of the page is: " + url);

		driver.close();// Only close the current window
		//driver.quit();// This will close all associated window opened by selenium

	}

}
