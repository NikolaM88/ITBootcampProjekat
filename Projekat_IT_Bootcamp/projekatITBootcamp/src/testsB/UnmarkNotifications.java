package testsB;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import objects.HomePage;
import objects.SettingsPage;

public class UnmarkNotifications {
	
	@Test
	public void changeLanguage() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Milanovici\\Desktop\\New folder\\Nikola\\Programiranje\\QA\\Selenium\\Chrome drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		SoftAssert as = new SoftAssert();
		HomePage.login(driver);
		Thread.sleep(5000);
		SettingsPage.settingsMenu(driver);
		Thread.sleep(5000);
		
		((JavascriptExecutor)driver).executeScript("scroll(0,200)");
		
		
		driver.findElement(By.id("pref_pref_email")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("pref_pref_sms")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("pref_pref_mobile_push")).click();
		
		((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
		driver.findElement(By.id("_save_settings_button")).click(); 
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.id("pref_pref_email")).isSelected());
		Assert.assertTrue(driver.findElement(By.id("pref_pref_sms")).isSelected());
		Assert.assertTrue(driver.findElement(By.id("pref_pref_mobile_push")).isSelected()); 
		
		as.assertAll();
		driver.close();
		
	}
}
