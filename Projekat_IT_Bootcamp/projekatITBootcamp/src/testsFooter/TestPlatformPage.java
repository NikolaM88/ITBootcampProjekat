package testsFooter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.CompanyHumanity;
import objects.PlatformMenuFooter;

public class TestPlatformPage {

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

		@Test (priority = 1)
		public void testPlatformPageOverview() {
			
			PlatformMenuFooter.platformPageOverview(driver);
			
			String currentURL = driver.getCurrentUrl();
			String expectedURL = CompanyHumanity.PLATFORM_URL;
			
			Assert.assertEquals(currentURL, expectedURL);
		}
		
		@Test (priority = 2)
		public void testPlatformPageDemanDrivenScheduling() {
			
			PlatformMenuFooter.platformPageDemandDrivenSchedule(driver);
			
			String currentURL = driver.getCurrentUrl();
			String expectedURL = "https://www.humanity.com/platform#demand-driven-scheduling";
			
			Assert.assertEquals(currentURL, expectedURL);
		}
		
		@Test (priority = 3)
		public void testPlatformPageCompliance() {
			
			PlatformMenuFooter.platformPageCompliance(driver);
			
			String currentURL = driver.getCurrentUrl();
			String expectedURL = "https://www.humanity.com/platform#compliance";
			
			Assert.assertEquals(currentURL, expectedURL);
		}
		
		@Test (priority = 4)
		public void testPlatformPageAutoScheduling() {
			
			PlatformMenuFooter.platformPageAutoScheduling(driver);
			
			String currentURL = driver.getCurrentUrl();
			String expectedURL = "https://www.humanity.com/platform#auto-scheduling";
			
			Assert.assertEquals(currentURL, expectedURL);
		}
		
		@Test (priority = 5)
		public void testPlatformPageMobileShiftManagement() {
			
			PlatformMenuFooter.platformPageMobileShiftManagement(driver);
			
			String currentURL = driver.getCurrentUrl();
			String expectedURL = "https://www.humanity.com/platform#mobile-shift-management";
			
			Assert.assertEquals(currentURL, expectedURL);
		}
		
		@Test (priority = 6)
		public void testPlatformPageFlexScheduling() {
			
			PlatformMenuFooter.platformPageFlexScheduling(driver);
			
			String currentURL = driver.getCurrentUrl();
			String expectedURL = "https://www.humanity.com/platform#flex-scheduling";
			
			Assert.assertEquals(currentURL, expectedURL);
		}
		
		@Test (priority = 7)
		public void testPlatformPageTimeClock() {
			
			PlatformMenuFooter.platformPageTimeClock(driver);
			
			String currentURL = driver.getCurrentUrl();
			String expectedURL = "https://www.humanity.com/platform#time-clock";
			
			Assert.assertEquals(currentURL, expectedURL);
		}
		
		@Test (priority = 8)
		public void testPlatformPageIntegration() {
			
			PlatformMenuFooter.platformPageIntegration(driver);
			
			String currentURL = driver.getCurrentUrl();
			String expectedURL = "https://www.humanity.com/platform#integration";
			
			Assert.assertEquals(currentURL, expectedURL);
		}
		
}
