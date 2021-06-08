package homePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.HomePage;

public class TestLoginExistingUser {

private static WebDriver driver;
	
	@BeforeClass				
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Milanovici\\Desktop\\New folder\\Nikola\\Programiranje\\QA\\Selenium\\Chrome drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.navigate().to(HomePage.URL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			HomePage.closePopUpWindow(driver);
	}
	
	@AfterClass
	public void closeDriver() {
		driver.close();
	}

		@Test
		public void testOpenAboutUsPage() {
			
			HomePage.loginPage(driver);
			String email = "paolomaldini@email.com";
			HomePage.inputUsername(driver, email);
			String password = "DresBroj3";
			HomePage.inputPassword(driver, password);
			HomePage.clickLogin(driver);
			
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			String currentURL = driver.getCurrentUrl();
			String expectedURL = "https://paolomaldini.humanity.com/app/dashboard/";
			
			Assert.assertEquals(currentURL, expectedURL);
			
}
		
}
