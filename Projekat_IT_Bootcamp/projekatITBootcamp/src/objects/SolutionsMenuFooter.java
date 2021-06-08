package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SolutionsMenuFooter {

	public static final String SOLUTIONS_PAGE_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[2]";
	public static final String SOLUTIONS_HEALTHCARE_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[2]/ul/div/div[1]/li/div/a[1]";
	public static final String SOLUTIONS_RETAIL_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[2]/ul/div/div[1]/li/div/a[2]";
	public static final String SOLUTIONS_CALL_CENTER_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[2]/ul/div/div[1]/li/div/a[3]";
	public static final String SOLUTIONS_HOSPITALITY_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[2]/ul/div/div[2]/li/div/a[1]";
	public static final String SOLUTIONS_UNIVERSITIES_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[2]/ul/div/div[2]/li/div/a[2]";
	public static final String SOLUTIONS_FOOD_AND_BEVERAGE_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[2]/ul/div/div[2]/li/div/a[3]";
	public static final String SOLUTIONS_FITNESS_AND_RECREATION_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[2]/ul/div/div[3]/li/div/a[1]";
	public static final String SOLUTIONS_MANUFACTURING_AND_FACILITIES_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[2]/ul/div/div[3]/li/div/a[2]";
	public static final String SOLUTIONS_TRANSPORTATION_AND_DELIVERY_XPATH = "//*[@id=\"navbarSupportedContent\"]/ul/li[2]/ul/div/div[3]/li/div/a[3]";

	public static void closePopUpWindow(WebDriver driver) {
		WebElement we = driver.findElement(By.cssSelector("#tcp-modal > div > div > div.modal-header > button"));
		we.click();
	}

	public static void solutionsHealthcare(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(SOLUTIONS_PAGE_XPATH));
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
		driver.findElement(By.xpath(SOLUTIONS_HEALTHCARE_XPATH)).click();
	}

	public static void solutionsRetail(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(SOLUTIONS_PAGE_XPATH));
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
		driver.findElement(By.xpath(SOLUTIONS_RETAIL_XPATH)).click();
	}

	public static void solutionsCallCenter(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(SOLUTIONS_PAGE_XPATH));
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
		driver.findElement(By.xpath(SOLUTIONS_CALL_CENTER_XPATH)).click();
	}

	public static void solutionsHospitality(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(SOLUTIONS_PAGE_XPATH));
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
		driver.findElement(By.xpath(SOLUTIONS_HOSPITALITY_XPATH)).click();
	}

	public static void solutionsUniveristies(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(SOLUTIONS_PAGE_XPATH));
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
		driver.findElement(By.xpath(SOLUTIONS_UNIVERSITIES_XPATH)).click();
	}

	public static void solutionsFoodAndBeverage(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(SOLUTIONS_PAGE_XPATH));
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
		driver.findElement(By.xpath(SOLUTIONS_FOOD_AND_BEVERAGE_XPATH)).click();
	}

	public static void solutionsFitnessAndRecreation(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(SOLUTIONS_PAGE_XPATH));
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
		driver.findElement(By.xpath(SOLUTIONS_FITNESS_AND_RECREATION_XPATH)).click();
	}

	public static void solutionsManufacturingAndFacilities(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(SOLUTIONS_PAGE_XPATH));
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
		driver.findElement(By.xpath(SOLUTIONS_MANUFACTURING_AND_FACILITIES_XPATH)).click();
	}

	public static void solutionsTransportationAndDelivery(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(SOLUTIONS_PAGE_XPATH));
		Actions act = new Actions(driver);
		act.moveToElement(we).perform();
		driver.findElement(By.xpath(SOLUTIONS_TRANSPORTATION_AND_DELIVERY_XPATH)).click();
	}

}
