package homePage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.HomePage;


public class TestAboutUs {
	
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
			
			HomePage.aboutUsPage(driver);
			
			JavascriptExecutor js = (JavascriptExecutor)driver; //scrolling the page before screenshot
			js.executeScript("window.scrollBy(0,100)", "");
			
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);		//about us page screenshot
			try {
				FileUtils.copyFile(screenshotFile, new File("C:\\Users\\Milanovici\\Desktop\\New folder\\Nikola\\Programiranje\\Projekat_IT_Bootcamp\\AboutUsPageScreenshot\\Screenshot_About_Us.png"));
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			String currentUrl = driver.getCurrentUrl();
			String expectedUrl = "https://www.humanity.com/about";
			
			Assert.assertEquals(currentUrl, expectedUrl);
		}
}
