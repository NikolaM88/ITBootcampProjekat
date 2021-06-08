package testsB;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.AddEmployee;
import objects.HomePage;

public class TestAddNewEmployee {
	
	
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
		
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			AddEmployee.clickStaffMenu(driver);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		AddEmployee.clickAddEmployee(driver);
		
		String name = "Alessandro";
		AddEmployee.addEmployeeName(driver, name);
		
		String lastName = "Nesta";
		AddEmployee.addEmployeeLastName(driver, lastName);
		
		String emailOfAddedEmployee = "alessandronesta@email.com";
		AddEmployee.addEmployeeEmail(driver, emailOfAddedEmployee);
		
		AddEmployee.clickSaveEmployees(driver);
		
		AddEmployee.clickStaffMenu(driver);
		Assert.assertTrue(driver.getPageSource().contains("alessandronesta@email.com"));
		
		
			
		}
		
	}

