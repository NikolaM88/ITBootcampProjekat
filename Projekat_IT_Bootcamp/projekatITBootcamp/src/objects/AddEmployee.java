package objects;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddEmployee {
	
	public static final String STAFF_XPATH = "//*[@id=\"sn_staff\"]";
	public static final String SAVE_EMPLOYEE_XPATH = "//*[@id=\"_as_save_multiple\"]";
	public static final String ALL_STAFF_XPATH = "//*[@id=\"StaffSchedules\"]/ul[1]/li[1]/a";
	public static final String CREATED_NEW_EMPLOYEE_XPATH = "//*[@id=\"7\"]/a";
	
	
	public static void clickStaffMenu(WebDriver driver) {
		WebElement we = driver.findElement(By.xpath(STAFF_XPATH));
		we.click();
	}
	
	public static void clickAddEmployee(WebDriver driver) {
		WebElement we = driver.findElement(By.id("act_primary"));
		we.click();
	}
	
	public static void addEmployeeName(WebDriver driver, String name) {
		driver.findElement(By.className("_ns_fname")).sendKeys(name);
	}
	
	public static void addEmployeeLastName(WebDriver driver, String lastName) {
		driver.findElement(By.className("_ns_lname")).sendKeys(lastName);
	}
	
	public static void addEmployeeEmail(WebDriver driver, String email) {
		driver.findElement(By.className("_ns_email")).sendKeys(email);
	}
	
	public static void clickSaveEmployees (WebDriver driver) {
		driver.findElement(By.xpath(SAVE_EMPLOYEE_XPATH)).click();
	}
	
	public static void clickAllStaff(WebDriver driver) {
		driver.findElement(By.xpath(ALL_STAFF_XPATH)).click();
	}
	
	public static void clickOnCreatedEmployee(WebDriver driver) {
		driver.findElement(By.xpath(CREATED_NEW_EMPLOYEE_XPATH)).click();
	}
	
	public static void addEmployeesFromList (WebDriver driver) {
	
		String name_id = "_asf";
		String lastName_id = "_asl";
		String email_id = "_ase";
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		AddEmployee.clickStaffMenu(driver);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		AddEmployee.clickAddEmployee(driver);
		
		File f = new File("ListOfEmployees.xlsx");
		
		try {
			InputStream in = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(in);
			Sheet sheet = wb.getSheetAt(0);
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			
			for(int i = 0; i <= sheet.getLastRowNum(); i++) {
				Row row = sheet.getRow(i);
				Cell c0 = row.getCell(0);
				String name = c0.toString();
				driver.findElement(By.id((name_id + (i+1)).toString())).sendKeys(name);
				
				Cell c1 = row.getCell(1);
				String lastName = c1.toString();
				driver.findElement(By.id((lastName_id + (i+1)).toString())).sendKeys(lastName);
				
				Cell c2 = row.getCell(2);
				String email = c2.toString();
				driver.findElement(By.id((email_id + (i+1)).toString())).sendKeys(email);
			}
			wb.close();
			
		}	catch (IOException e) {
				e.printStackTrace();
			}
				
			}
		
	}

