package DataDrivenTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.excel.lib.util.Xls_Reader;

public class facebook {

	static
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		Xls_Reader r = new Xls_Reader("E:\\Selenium\\Automation\\Data\\fbreg.xlsx");
	  String firstname=  r.getCellData("Sheet1", "Firstname", 2);
	  String surname=  r.getCellData("Sheet1", "surname", 2);
	  String email=  r.getCellData("Sheet1", "emailaddress", 2);
	  String password=  r.getCellData("Sheet1", "password", 2);
	  String day=  r.getCellData("Sheet1", "day", 2);
		driver.get("https://en-gb.facebook.com");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		driver.findElement(By.name("firstname")).sendKeys(firstname);
		driver.findElement(By.name("lastname")).sendKeys(surname);
		driver.findElement(By.name("reg_email__")).sendKeys(email);
		driver.findElement(By.name("reg_passwd__")).sendKeys(password);
		driver.findElement(By.id("day")).sendKeys(day);
		Thread.sleep(3000);
		driver.close();
		}
		
}	
		
		
		
	

