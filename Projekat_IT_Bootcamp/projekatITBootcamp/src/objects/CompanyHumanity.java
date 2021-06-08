package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompanyHumanity {
	
	public static final String URL = "https://www.humanity.com/";
	public static final String PLATFORM_URL = "https://www.humanity.com/platform";
	public static final String LOGO_HOMEPAGE_XPATH = "//*[@id=\"wrapper\"]/header/div[1]/div/div/div/nav/div[1]/a/svg";
	public static final String PRICING_PAGE_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a";
	public static final String INTEGRATIONS_AND_PARTNERS_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[3]/a";
	
	public static void closePopUpWindow (WebDriver driver) {
		WebElement we = driver.findElement(By.cssSelector("#tcp-modal > div > div > div.modal-header > button"));
		we.click();
	}
	
	public static void clickOnLogo (WebDriver driver) {
		WebElement we = driver.findElement(By.cssSelector("#wrapper > header > div.top-header > div > div > div > nav > div.logo-holder > a > svg"));
		we.click();
	}
	
	public static void clickOnPricingPage (WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(PRICING_PAGE_XPATH));
		we.click();
	}
	
	public static void clickOnIntegrationsAndPartners (WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(INTEGRATIONS_AND_PARTNERS_XPATH));
		we.click();
	}
	
}
