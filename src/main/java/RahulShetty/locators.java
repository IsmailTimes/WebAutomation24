package RahulShetty;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class locators {

	public static void main(String[] args) throws InterruptedException {	
		System.setProperty("webdriver.chrome.driver", "C:/Users/ISMAIL/utilities/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		String name = "Ismail";
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("12345678");
		driver.findElement(By.className("submit")).click();
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(name);
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("ismailtarash@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("ismaillgud@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("01778325953");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Ismail");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#chkboxOne")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		
		//driver.findElement(By.className("submit")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello "+name+",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();
		
//		driver.findElement(By.linkText("Forgot your password?")).click();
		/*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Ismail");
		driver.findElement(By.name("inputPassword")).sendKeys("12345678");
		driver.findElement(By.className("submit")).click();
		// implicit wait- seconds timeout
		// driver.w
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		// System.out.println(errorElement.getText());
		// driver.close();*/
	}
}