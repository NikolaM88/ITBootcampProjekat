package testsB;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.HomePage;

public class ProfileChanges {
	
	public static final String PROFILE_XPATH = "//*[@id=\"wrap_us_menu\"]";
	public static final String EDIT_PROFILE_XPATH = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
	public static final String PROFILE_ID_NUMBER_XPATH ="//*[@id=\"eid\"]";
	
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
	public void profileChanges() throws InterruptedException {

		driver.findElement(By.xpath(PROFILE_XPATH)).click(); 	
		driver.findElement(By.linkText("Profile")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("Edit Details")).click();
		
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		Thread.sleep(5000);
		driver.findElement(By.id("nick_name")).sendKeys("Capitano");
		
		driver.findElement(By.id("eid")).sendKeys("AC_Milan_#3");
		
		((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
		
		driver.findElement(By.className("dia_submit")).click();
		
		
	}

}
