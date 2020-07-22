package LoginTestNew;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class loginWithInvalidPassword extends TestBase2 {

	@Test
	public void TestLoginWithInvalidPassword() throws InterruptedException {

		driver.get("https://login.dev.qa-experience.com");

		driver.findElement(By.name("loginUsername")).sendKeys("test@qa-experience.com");

		driver.findElement(By.name("loginPassword")).sendKeys("Pass200");

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String expectedErrorMessage = driver.findElement(By.xpath("//*[@class='form-field__error']")).getText();

		assertEquals(expectedErrorMessage, "Error message");

	}

}
