package RunTests;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HomeDepotHomePageLinksTestMain {

	//private WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// ChromDriver is a class
		// WebDriver is an interface which can be executed in any browser.
		// ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.homedepot.com");
		String title = driver.getTitle();
		System.out.println("Title of the web page is: " + title);
		String url = driver.getCurrentUrl();
		System.out.println("URL of the page is: " + url);
		Thread.sleep(5000); // The open page will be closed in 5 seconds

		driver.findElement(By.className("sui-font-regular sui-min-fit sui-leading-tight sui-truncate sui-tracking-normal sui-normal-case sui-line-clamp-unset sui-mt-0 sui-text-base sui-max-w-[12.8rem] lg:sui-max-w-[8.9rem]")).click();
		
		if (driver.getPageSource().contains("Tilly Mill"))
			System.out.println("The Log In page works");
		else
			System.out.println("The Log In page does NOT work");
		//	Assert.assertEquals(true, driver.getPageSource().contains("Our mission is to"));
		Thread.sleep(2000);


		((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);   // temporary wait	   


		driver.quit();// This will close all associated window opened by Selenium

	}

}
