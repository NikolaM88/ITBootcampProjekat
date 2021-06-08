package testsFooter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.HomePage;

public class TestLoginLinkFooter {
	
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
			
			String currentURL = driver.getCurrentUrl();
			String expectedURL = "https://www.humanity.com/app/";
			
			Assert.assertEquals(currentURL, expectedURL);
			
		}

}
