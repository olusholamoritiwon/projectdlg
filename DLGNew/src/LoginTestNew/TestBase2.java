package LoginTestNew;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase2 {

	WebDriver driver;

	@BeforeTest
	public void beforeTest() throws InterruptedException {

		// First we set the system properties to the path of the driver for the required
		// browser.
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shola\\Documents\\Selenium framework\\chromedriver_win32\\chromedriver.exe\\");

		// Then Instantiate our driver
		driver = new ChromeDriver();

		// Configure our Browser
		driver.manage().window().maximize();

		// Then we navigate to our required url i.e. Google
		driver.navigate().to("https://login.dev.qa-experience.com");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.findElement(By.name("loginUsername")).sendKeys("test@qa-experience.com");
		driver.findElement(By.name("loginPassword")).sendKeys("Password1");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		// driver.findElement(By.xpath("//[@class='logged-in__success']")); Successfully
		// logged in!

	}

	@AfterTest
	public void afterTest() {

		driver.quit();

	}

}
