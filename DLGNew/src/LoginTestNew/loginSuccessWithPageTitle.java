package LoginTestNew;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class loginSuccessWithPageTitle extends TestBase2 {

	@Test
	public void ValidatingTitleTest() throws InterruptedException {

		driver.get("https://login.dev.qa-experience.com");

		String actualTitle = driver.getTitle();

		String expectedTitle = "QA Interview Test | DLG Digital";

		assertEquals(actualTitle, expectedTitle, "Contains QA Interview Test | DLG Digital");

	}

}
