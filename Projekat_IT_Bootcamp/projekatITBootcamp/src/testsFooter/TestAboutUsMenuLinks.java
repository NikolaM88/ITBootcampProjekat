package testsFooter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.AboutUsMenuFooter;
import objects.CompanyHumanity;

public class TestAboutUsMenuLinks {
	
	private static WebDriver driver;


	@BeforeClass				
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Milanovici\\Desktop\\New folder\\Nikola\\Programiranje\\QA\\Selenium\\Chrome drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
		 driver.navigate().to(CompanyHumanity.URL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			AboutUsMenuFooter.closePopUpWindow(driver);
	}
	
	@AfterClass
	public void closeDriver() {
		driver.close();
	}

		@Test (priority = 1)
		public void testAboutUsPage() {
			
			AboutUsMenuFooter.aboutUsPage(driver);
			String currentURL = driver.getCurrentUrl();
			String expectedURL = "https://www.humanity.com/about";
			
			Assert.assertEquals(currentURL, expectedURL);
			
		}
		
		@Test (priority = 2)
		public void testAboutUsCareers() {
			
			AboutUsMenuFooter.aboutUsCareers(driver);
			String currentURL = driver.getCurrentUrl();
			String expectedURL = "https://www.humanity.com/careers";
			
			Assert.assertEquals(currentURL, expectedURL);
			driver.navigate().back();
		}
		
		@Test (priority = 3)
		public void testAboutUsContactUs() {
			
			AboutUsMenuFooter.aboutUsContactUs(driver);
			String currentURL = driver.getCurrentUrl();
			String expectedURL = "https://www.humanity.com/contact";
			
			Assert.assertEquals(currentURL, expectedURL);
			
		}
		
		@Test (priority = 4)
		public void testAboutUsHumanityBlog() {
			
			AboutUsMenuFooter.aboutUsHumanityBlog(driver);
			String currentURL = driver.getCurrentUrl();
			String expectedURL = "https://www.humanity.com/blog";
			
			Assert.assertEquals(currentURL, expectedURL);
			
		}
		
		@Test (priority = 5)
		public void testAboutUsNewsroom() {
			
			AboutUsMenuFooter.aboutUsNewsroom(driver);
			String currentURL = driver.getCurrentUrl();
			String expectedURL = "https://www.humanity.com/newsroom";
			
			Assert.assertEquals(currentURL, expectedURL);
			
		}

}
