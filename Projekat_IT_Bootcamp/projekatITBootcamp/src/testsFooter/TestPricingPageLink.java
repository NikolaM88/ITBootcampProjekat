package testsFooter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.CompanyHumanity;

public class TestPricingPageLink {
	
	private static WebDriver driver;


	@BeforeClass				
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Milanovici\\Desktop\\New folder\\Nikola\\Programiranje\\QA\\Selenium\\Chrome drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.navigate().to(CompanyHumanity.URL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			CompanyHumanity.closePopUpWindow(driver);
	}
	
	@AfterClass
	public void closeDriver() {
		driver.close();
	}

		@Test
		public void testClickOnPricingPage() {
			
			CompanyHumanity.clickOnPricingPage(driver);
			String currentURL = driver.getCurrentUrl();
			String expectedURL = "https://www.humanity.com/pricing";
			
			Assert.assertEquals(currentURL, expectedURL);
		}

}
