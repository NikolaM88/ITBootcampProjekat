package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PlatformMenuFooter {
	
	public static final String PLATFORM_PAGE_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a";
	public static final String PLATFORM_OVERVIEW_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[1]/ul/div/div[1]/li/div/a[1]";
	public static final String PLATFORM_DDSCHEDULE_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[1]/ul/div/div[1]/li/div/a[2]";
	public static final String PLATFORM_COMPLIANCE_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[1]/ul/div/div[1]/li/div/a[3]";
	public static final String PLATFORM_AUTO_SCHEDULING_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[1]/ul/div/div[1]/li/div/a[4]";
	public static final String PLATFORM_MOBILE_SHIFT_MANAGEMENT_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[1]/ul/div/div[2]/li/div/a[1]";
	public static final String PLATFORM_FLEX_SCHEDULING_XPATH ="//*[@id=\"navbarSupportedContent\"]/ul/li[1]/ul/div/div[2]/li/div/a[2]";
	public static final String PLATFORM_TIME_CLOCK_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[1]/ul/div/div[2]/li/div/a[3]";
	public static final String PLATFORM_INTEGRATION_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[1]/ul/div/div[2]/li/div/a[4]";
	
	
	public static void platformPageOverview (WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(PLATFORM_PAGE_XPATH));
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
		driver.findElement(By.xpath(PLATFORM_OVERVIEW_XPATH)).click();
		
	}
	
	public static void platformPageDemandDrivenSchedule (WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(PLATFORM_PAGE_XPATH));
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
		driver.findElement(By.xpath(PLATFORM_DDSCHEDULE_XPATH)).click();
	}
	
	public static void platformPageCompliance (WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(PLATFORM_PAGE_XPATH));
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
		driver.findElement(By.xpath(PLATFORM_COMPLIANCE_XPATH)).click();
	}
	
	public static void platformPageAutoScheduling (WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(PLATFORM_PAGE_XPATH));
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
		driver.findElement(By.xpath(PLATFORM_AUTO_SCHEDULING_XPATH)).click();
	}
	
	public static void platformPageMobileShiftManagement (WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(PLATFORM_PAGE_XPATH));
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
		driver.findElement(By.xpath(PLATFORM_MOBILE_SHIFT_MANAGEMENT_XPATH)).click();
	}
	
	public static void platformPageFlexScheduling (WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(PLATFORM_PAGE_XPATH));
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
		driver.findElement(By.xpath(PLATFORM_FLEX_SCHEDULING_XPATH)).click();
	}
	
	public static void platformPageTimeClock (WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(PLATFORM_PAGE_XPATH));
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
		driver.findElement(By.xpath(PLATFORM_TIME_CLOCK_XPATH)).click();
	}
	
	public static void platformPageIntegration (WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(PLATFORM_PAGE_XPATH));
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
		driver.findElement(By.xpath(PLATFORM_INTEGRATION_XPATH)).click();
	}
}
