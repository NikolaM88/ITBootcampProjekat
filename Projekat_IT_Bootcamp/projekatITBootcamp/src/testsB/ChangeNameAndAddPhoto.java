package testsB;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import objects.AddEmployee;
import objects.HomePage;

public class ChangeNameAndAddPhoto {
	
	public static void main(String[] args) {
	
	WebDriver driver;
	//private static WebDriver driver;
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Milanovici\\Desktop\\New folder\\Nikola\\Programiranje\\QA\\Selenium\\Chrome drivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.humanity.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		HomePage.closePopUpWindow(driver);
		
		HomePage.loginPage(driver);
		String email = "paolomaldini@email.com";
		HomePage.inputUsername(driver, email);
		String password = "DresBroj3";
		HomePage.inputPassword(driver, password);
		HomePage.clickLogin(driver);
		AddEmployee.clickStaffMenu(driver);
		driver.findElement(By.xpath("//*[@id=\"7\"]/a")).click();
		driver.findElement(By.linkText("Edit Details")).click();
		driver.findElement(By.id("first_name")).clear();
		driver.findElement(By.id("first_name")).sendKeys("ALESSANDRO");
		
		WebElement choosePhoto = driver.findElement(By.id("fileupload"));
		choosePhoto.sendKeys("C:\\Users\\Milanovici\\Desktop\\New folder\\Nikola\\Programiranje\\Projekat_IT_Bootcamp\\projekatITBootcamp\\alessandro_nesta.jpg");
		
		driver.findElement(By.xpath("//*[@id=\"NewEmployeeForm\"]/table/tbody/tr[39]/td/input")).click();
		driver.close();
}}


