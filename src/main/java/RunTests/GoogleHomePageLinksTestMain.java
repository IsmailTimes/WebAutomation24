package RunTests;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GoogleHomePageLinksTestMain {

	//private WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// ChromDriver is a class
		// WebDriver is an interface which can be executed in any browser.
		// ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://google.com");
		String title = driver.getTitle();
		System.out.println("Title of the web page is: " + title);
		String url = driver.getCurrentUrl();
		System.out.println("URL of the page is: " + url);
		Thread.sleep(5000); // The open page will be closed in 5 seconds


		driver.findElement(By.xpath("//html/body/div[1]/div[1]/a[1]")).click();
		if (driver.getPageSource().contains("Our mission is to"))
			System.out.println("The About page works");
		else
			System.out.println("The About page does NOT work");
		//	Assert.assertEquals(true, driver.getPageSource().contains("Our mission is to"));
		Thread.sleep(2000);
		
		driver.get("https://google.com");
		Thread.sleep(2000);
		
		driver.findElement(By.ByXPath.linkText("Store")).click();
		if (driver.getPageSource().contains("Oh hi, AI.")) 
			System.out.println("The Store page works");
		else
			System.out.println("The Store in page does NOT work");
		//	Assert.assertEquals(true, driver.getPageSource().contains("Our mission is to"));
		Thread.sleep(2000);
	((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);   // temporary wait	   

		/*
		driver.findElement(By.linkText("About")).click();
		if (driver.getPageSource().contains("Our mission is to"))
			System.out.println("The About page works");
		else
			System.out.println("The About page does NOT work");
		//	Assert.assertEquals(true, driver.getPageSource().contains("Our mission is to"));
		Thread.sleep(2000);
		*/

		
	

	//	/html/body/div[1]/div[1]/a[2]
		
	
		/*
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[2]")).click();
		if (driver.getPageSource().contains("Oh hi, AI."))
			System.out.println("The store page works");
		else
			System.out.println("The store page does NOT work");
		//	Assert.assertEquals(true, driver.getPageSource().contains("Our mission is to"));
		Thread.sleep(2000);
*/
	

		driver.quit();// This will close all associated window opened by Selenium

	}

}
