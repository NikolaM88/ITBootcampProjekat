package testsB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import objects.AddEmployee;
import objects.HomePage;

public class TestAddingEmployeesFromExcel {
	
	
private static WebDriver driver;
	
	@BeforeClass				
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Milanovici\\Desktop\\New folder\\Nikola\\Programiranje\\QA\\Selenium\\Chrome drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
			HomePage.login(driver);
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	
	@AfterClass
	public void closeDriver() {
		driver.close();
	}
		
		@Test
		public void checkAddedEmployee() {
			
			AddEmployee.addEmployeesFromList(driver);
			AddEmployee.clickSaveEmployees(driver);
			AddEmployee.clickStaffMenu(driver);
			Assert.assertTrue(driver.getPageSource().contains("andreapirlo@email.com"));
			
			
		}
		
}
