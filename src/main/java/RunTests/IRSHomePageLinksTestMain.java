package RunTests;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class IRSHomePageLinksTestMain {

	//private WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// ChromDriver is a class
		// WebDriver is an interface which can be executed in any browser.
		// ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://irs.gov");
		String title = driver.getTitle();
		System.out.println("Title of the web page is: " + title);
		String url = driver.getCurrentUrl();
		System.out.println("URL of the page is: " + url);
		Thread.sleep(5000); // The open page will be closed in 5 seconds

		driver.findElement(By.id("accessible-megamenu-nav-item-0")).click();
		if (driver.getPageSource().contains("Filing information for"))
			System.out.println("The File menu link works");
		else
			System.out.println("The File menu link does NOT work");
		//	Assert.assertEquals(true, driver.getPageSource().contains("Filing information for"));
		Thread.sleep(2000);


		//		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//		Thread.sleep(2000);   // temporary wait	   


		driver.quit();// This will close all associated window opened by Selenium

	}

}
