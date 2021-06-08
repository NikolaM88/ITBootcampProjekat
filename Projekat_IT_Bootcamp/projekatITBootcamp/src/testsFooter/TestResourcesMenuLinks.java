package testsFooter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.CompanyHumanity;
import objects.ResourcesMenuFooter;

public class TestResourcesMenuLinks {
	
	private static WebDriver driver;


	@BeforeClass				
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Milanovici\\Desktop\\New folder\\Nikola\\Programiranje\\QA\\Selenium\\Chrome drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
				driver.navigate().to(CompanyHumanity.URL);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				ResourcesMenuFooter.closePopUpWindow(driver);
	}
	
	@AfterClass
	public void closeDriver() {
		driver.close();
	}
	
	@Test (priority = 1)
	public void testResourcesSuccessStories() {
		
		ResourcesMenuFooter.resourcesSuccessStories(driver);
		
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://www.humanity.com/success-stories";
		
		Assert.assertEquals(currentURL, expectedURL);
	}
	
	@Test (priority = 2)
	public void testResourcesLibrary() {
		
		ResourcesMenuFooter.resourcesLibrary(driver);
		
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://www.humanity.com/resources";
		
		Assert.assertEquals(currentURL, expectedURL);
	}
	
	@Test (priority = 3)
	public void testResourcesHumanityBlog() {
		
		ResourcesMenuFooter.resourcesHumanityBlog(driver);
		
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://www.humanity.com/blog";
		
		Assert.assertEquals(currentURL, expectedURL);
	}
	
	@Test (priority = 4)
	public void testResourcesHelpCenter() {
		
		ResourcesMenuFooter.resourcesHelpCenter(driver);
		
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://helpcenter.humanity.com/en/";
		
		Assert.assertEquals(currentURL, expectedURL);
	}

}
