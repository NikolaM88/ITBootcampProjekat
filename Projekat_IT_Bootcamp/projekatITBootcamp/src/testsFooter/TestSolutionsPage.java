package testsFooter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.CompanyHumanity;
import objects.SolutionsMenuFooter;

public class TestSolutionsPage {
	
	private static WebDriver driver;


	@BeforeClass				
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Milanovici\\Desktop\\New folder\\Nikola\\Programiranje\\QA\\Selenium\\Chrome drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
				driver.navigate().to(CompanyHumanity.URL);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				SolutionsMenuFooter.closePopUpWindow(driver);
	}
	
	@AfterClass
	public void closeDriver() {
		driver.close();
	}
	
	@Test (priority = 1)
	public void testSolutionsHealthcare() {
		
		SolutionsMenuFooter.solutionsHealthcare(driver);
		
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://www.humanity.com/industry/healthcare";
		
		Assert.assertEquals(currentURL, expectedURL);
	}
	
	@Test (priority = 2)
	public void testSolutionsRetail() {
		
		SolutionsMenuFooter.solutionsRetail(driver);
		
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://www.humanity.com/industry/retail";
		
		Assert.assertEquals(currentURL, expectedURL);
	}
	
	@Test (priority = 3)
	public void testSolutionsCallCenter() {
		
		SolutionsMenuFooter.solutionsCallCenter(driver);
		
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://www.humanity.com/industry/call-center";
		
		Assert.assertEquals(currentURL, expectedURL);
	}
	
	@Test (priority = 4)
	public void testSolutionsHospitality() {
		
		SolutionsMenuFooter.solutionsHospitality(driver);
		
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://www.humanity.com/industry/hospitality";
		
		Assert.assertEquals(currentURL, expectedURL);
	}

	@Test (priority = 5)
	public void testSolutionsUniveristies() {
		
		SolutionsMenuFooter.solutionsUniveristies(driver);
		
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://www.humanity.com/industry/education";
		
		Assert.assertEquals(currentURL, expectedURL);
	}
	
	@Test (priority = 6)
	public void testSolutionsFoodAndBeverage() {
		
		SolutionsMenuFooter.solutionsFoodAndBeverage(driver);
		
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://www.humanity.com/industry/restaurant";
		
		Assert.assertEquals(currentURL, expectedURL);
	}
	
	@Test (priority = 7)
	public void testSolutionsFitnessAndRecreation() {
		
		SolutionsMenuFooter.solutionsFitnessAndRecreation(driver);
		
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://www.humanity.com/industry/gym-and-fitness";
		
		Assert.assertEquals(currentURL, expectedURL);
	}
	
	@Test (priority = 8)
	public void testSolutionsManufacturingAndFacilities() {
		
		SolutionsMenuFooter.solutionsManufacturingAndFacilities(driver);
		
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://www.humanity.com/industry/manufacturing-facilities";
		
		Assert.assertEquals(currentURL, expectedURL);
	}
	
	@Test (priority = 9)
	public void testSolutionsTransportationAndDelivery() {
		
		SolutionsMenuFooter.solutionsTransportationAndDelivery(driver);
		
		String currentURL = driver.getCurrentUrl();
		String expectedURL = "https://www.humanity.com/industry/travel";
		
		Assert.assertEquals(currentURL, expectedURL);
	}
}
