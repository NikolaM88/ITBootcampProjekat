package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AboutUsMenuFooter {
	
	public static final String ABOUT_US_MENU_XPATH = "//a[text()='About us']";
	public static final String ABOUT_US_PAGE_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul/li[1]/a/p[1]";
	public static final String ABOUT_US_CAREERS_XPATH ="//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul/li[3]/a/p[1]";
	public static final String ABOUT_US_CONTACT_US_XPATH ="//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul/li[5]/a/p[1]";
	public static final String ABOUT_US_HUMANITY_BLOG_XPATH ="//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul/li[2]/a/p[1]";
	public static final String ABOUT_US_NEWSROOM_XPATH ="//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul/li[4]/a/p[1]";
	
	public static void closePopUpWindow (WebDriver driver) {
		WebElement we = driver.findElement(By.cssSelector("#tcp-modal > div > div > div.modal-header > button"));
		we.click();
	}
	
	public static void aboutUsPage (WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(ABOUT_US_MENU_XPATH));
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
		driver.findElement(By.xpath(ABOUT_US_PAGE_XPATH)).click();
	}
	
	public static void aboutUsCareers (WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(ABOUT_US_MENU_XPATH));
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
		driver.findElement(By.xpath(ABOUT_US_CAREERS_XPATH)).click();
	}
	
	public static void aboutUsContactUs (WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(ABOUT_US_MENU_XPATH));
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
		driver.findElement(By.xpath(ABOUT_US_CONTACT_US_XPATH)).click();
	}
	
	public static void aboutUsHumanityBlog (WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(ABOUT_US_MENU_XPATH));
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
		driver.findElement(By.xpath(ABOUT_US_HUMANITY_BLOG_XPATH)).click();
	}
	
	public static void aboutUsNewsroom (WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(ABOUT_US_MENU_XPATH));
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
		driver.findElement(By.xpath(ABOUT_US_NEWSROOM_XPATH)).click();
	}

}
