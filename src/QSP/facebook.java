package QSP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");

	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		driver.get("https://en-gb.facebook.com");
		//driver.findElement(By.id("email")).sendKeys("mailtodivyadharshini@yahoo.in");
		//Thread.sleep(2000);
		//driver.findElement(By.name("pass")).sendKeys("Sujji123");
		//Thread.sleep(2000);
		//driver.findElement(By.name("login")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(5000);
		WebElement fname= driver.findElement(By.name("firstname"));
		fname.sendKeys("Divyadharshini");
		fname.sendKeys(Keys.CONTROL+ "ac");
		Thread.sleep(2000);
		WebElement lname= driver.findElement(By.name("lastname"));
		lname.sendKeys(Keys.CONTROL + "v");
		WebElement rad=driver.findElement(By.className("_58mt"));
		rad.click();
		boolean v = rad.isEnabled();
		if(v)
		{
			System.out.println("Element is Selected");
		}
		else
		{
			System.out.println("Element is not selected");
		}
		WebElement Day =driver.findElement(By.id("day"));
		Select s= new Select(Day);
		Thread.sleep(2000);
		s.selectByValue("16");
		Thread.sleep(2000);
	    WebElement Month = driver.findElement(By.id("month"));
	    Select s1= new Select(Month);
	    s1.selectByValue("5");
		WebElement Year = driver.findElement(By.id("year"));
		Select s2=new Select(Year);
		s2.selectByValue("1993");
		driver.close();
		}
		
		
		
		
		
	}

