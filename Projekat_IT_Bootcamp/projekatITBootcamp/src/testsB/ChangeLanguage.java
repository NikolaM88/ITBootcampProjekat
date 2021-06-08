package testsB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import objects.HomePage;
import objects.SettingsPage;

public class ChangeLanguage {
	@Test
	public void changeLanguage() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Milanovici\\Desktop\\New folder\\Nikola\\Programiranje\\QA\\Selenium\\Chrome drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		HomePage.login(driver);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		SettingsPage.settingsMenu(driver);
		
		
		WebElement language_dropdown = driver.findElement(By.xpath(SettingsPage.SELECT_LNG_XPATH));
		
		Thread.sleep(3000);
		
		Select select = new Select(language_dropdown);
		//((Select) select).selectByVisibleText("Serbian (machine)");
		((Select) select).selectByVisibleText("American English");

		driver.findElement(By.id("_save_settings_button")).click(); 
		
		//Assert.assertTrue(driver.getPageSource().contains("American English"));
		
		driver.close();
	} 
	
	

}
