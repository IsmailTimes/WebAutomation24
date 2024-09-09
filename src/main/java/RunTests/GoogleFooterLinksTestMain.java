package RunTests;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GoogleFooterLinksTestMain {


	public static void main(String[] args) throws InterruptedException {
		// ChromDriver is a class
		// WebDriver is an interface which can be executed in any browser.
		// ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver;

		driver = new ChromeDriver();

		driver.get("https://google.com");
		String title = driver.getTitle();
		System.out.println("Title of the web page is: " + title);
		String url = driver.getCurrentUrl();
		System.out.println("URL of the page is: " + url);
		Thread.sleep(5000); // The open page will be closed in 5 seconds


		driver.findElement(By.linkText("Privacy")).click();
		if (driver.getPageSource().contains("Privacy Policy"))
			System.out.println("The Privacy page works");
		else
			System.out.println("The Privacy page does NOT work");
		//	Assert.assertEquals(true, driver.getPageSource().contains("Our mission is to"));
		Thread.sleep(5000);

		/*driver.findElement(By.className("rpjfJd")).click();
		if (driver.getPageSource().contains("We want you to understand"))
			System.out.println("The Information Google collects page works");
		else
			System.out.println("The Information Google collects page does NOT work");
		//	Assert.assertEquals(true, driver.getPageSource().contains("Our mission is to"));
		Thread.sleep(5000);*/

		driver.findElement(By.linkText("Introduction")).click();
		if (driver.getPageSource().contains("We build a range of services that help millions of people "))
			System.out.println("The Introduction page works");
		else
			System.out.println("The Introduction page does NOT work");
		//	Assert.assertEquals(true, driver.getPageSource().contains("Our mission is to"));
		Thread.sleep(5000);

		driver.quit();// This will close all associated window opened by Selenium
		driver = new ChromeDriver();

		driver.get("https://google.com");

		driver.findElement(By.linkText("Terms")).click();
		if (driver.getPageSource().contains("Terms of Service"))
			System.out.println("The Terms of Service page works");
		else
			System.out.println("The Terms of Service page does NOT work");
		//	Assert.assertEquals(true, driver.getPageSource().contains("Our mission is to"));
		Thread.sleep(5000);

		driver.quit();
		
		/*driver = new ChromeDriver();
		driver.get("https://policies.google.com/terms?hl=en&fg=1");
		if(driver.getPageSource().contains("GOOGLE TERMS OF SERVICE")) 
		{
			System.out.println("The Terms of Service page works");
		}
		else {
			System.out.println("The Terms of Service page does NOT work");
		}

		driver.quit();// This will close all associated window opened by Selenium */
		
		driver = new ChromeDriver();
		driver.get("https://google.com");

		driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/span/span/g-popup/div[1]/div")).click();
		if(driver.getPageSource().contains("Settings")) 
		{
			System.out.println("The Search Settings page works");
		}
		else {
			System.out.println("The Search Settings page does NOT work");
			
		}
		
		
		
		driver.quit();// This will close all associated window opened by Selenium
		
		
		
		
		
		driver = new ChromeDriver();
		driver.get("https://google.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]/div[3]/span/span/g-popup/div[1]/div")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Advanced Search")).click();
		if(driver.getPageSource().contains("Find Pages with")) 
		{
			System.out.println("The Find Pages with page works");
		}
		else {
			System.out.println("The Find Pages with page does NOT work");
			
		}
		
		driver.quit();
		
		
		

	
	}

}
