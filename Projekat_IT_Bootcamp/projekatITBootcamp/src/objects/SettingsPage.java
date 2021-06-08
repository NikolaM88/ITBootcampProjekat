package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SettingsPage {
	public static final String SELECT_LNG_XPATH = "//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select";
	public static final String SETINGS_XPATH = "//*[@id=\"sn_admin\"]/span/i";
	public static final String SERBIAN_LANGUAGE_XPATH = "//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select/option[37]";
	public static final String SAVE_SETTINGS_XPATH = "//*[@id=\"act_primary\"]";
	
	public static void settingsMenu (WebDriver driver) {
		driver.findElement(By.xpath(SETINGS_XPATH)).click();
	}
	
	
	public static void selectLanguage(WebDriver driver, String languge) {
		String language = "Serbian (machine)";
		driver.findElement(By.xpath(SELECT_LNG_XPATH)).sendKeys(language);
		
		
	}
	public static void saveSettingsButton (WebDriver driver) {
		driver.findElement(By.xpath(SAVE_SETTINGS_XPATH)).click();
	}
	
}
