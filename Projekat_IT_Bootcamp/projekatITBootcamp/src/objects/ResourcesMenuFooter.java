package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ResourcesMenuFooter {
	
	public static final String RESOURCES_MENU_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[4]";
	public static final String RESOURCES_SUCCESS_STORIES_XPATH= "//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[1]/a/p[1]";
	public static final String RESOURCES_LIBRARY_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[3]/a/p[1]";
	public static final String RESOURCES_HUMANITY_BLOG_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[2]/a/p[1]";
	public static final String RESOURCES_HELP_CENTER_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[4]/ul/li[4]/a/p[1]";
	
	public static void closePopUpWindow (WebDriver driver) {
		WebElement we = driver.findElement(By.cssSelector("#tcp-modal > div > div > div.modal-header > button"));
		we.click();
	}
	
	public static void resourcesSuccessStories(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(RESOURCES_MENU_XPATH));
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
		driver.findElement(By.xpath(RESOURCES_SUCCESS_STORIES_XPATH)).click();
	}
	
	public static void resourcesLibrary(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(RESOURCES_MENU_XPATH));
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
		driver.findElement(By.xpath(RESOURCES_LIBRARY_XPATH)).click();
	}
	
	public static void resourcesHumanityBlog(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(RESOURCES_MENU_XPATH));
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
		driver.findElement(By.xpath(RESOURCES_HUMANITY_BLOG_XPATH)).click();
	}
	
	public static void resourcesHelpCenter(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(RESOURCES_MENU_XPATH));
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
		driver.findElement(By.xpath(RESOURCES_HELP_CENTER_XPATH)).click();
	}

}
