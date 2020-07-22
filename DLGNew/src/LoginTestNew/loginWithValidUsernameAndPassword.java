package LoginTestNew;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class loginWithValidUsernameAndPassword extends TestBase2 {

	@Test
	public void TestLoginWithValidPassword() throws InterruptedException {

		driver.get("https://login.dev.qa-experience.com");

		driver.findElement(By.name("loginUsername")).sendKeys("test@qa-experience.com");

		driver.findElement(By.name("loginPassword")).sendKeys("Password1");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(3000);

		String expectedSuccessMessage = driver.findElement(By.xpath("//*[@class='wrapper']")).getText();

		assertTrue(expectedSuccessMessage.contains("Successfully logged in!"));

	}

}
