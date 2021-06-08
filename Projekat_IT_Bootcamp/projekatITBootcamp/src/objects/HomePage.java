package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
	
	public static final String URL = "https://www.humanity.com/";
	public static final String ABOUT_US_MENU_XPATH = "//a[text()='About us']";
	public static final String ABOUT_US_PAGE_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul/li[1]/a/p[1]";
	public static final String LOGIN_XPATH = "//*[@id=\"navbarSupportedContent\"]/div/a[2]/p";
	
	
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
	
	public static void loginPage (WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(LOGIN_XPATH));
		we.click();
	}
	
	public static void inputUsername(WebDriver driver, String email) {
		driver.findElement(By.id("email")).sendKeys(email);
	}

	public static void inputPassword(WebDriver driver, String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	public static void clickLogin (WebDriver driver) {
		driver.findElement(By.name("login")).click();
	}
	
	public static void login (WebDriver driver) {
		driver.get("https://www.humanity.com/");
		driver.manage().window().maximize();
		HomePage.closePopUpWindow(driver);
		HomePage.loginPage(driver);
		String email = "paolomaldini@email.com";
		HomePage.inputUsername(driver, email);
		String password = "DresBroj3";
		HomePage.inputPassword(driver, password);
		HomePage.clickLogin(driver);
		
	}
	
	
	

}
