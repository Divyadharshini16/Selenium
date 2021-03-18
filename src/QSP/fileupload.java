package QSP;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileupload {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");

    }
public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		driver.get("https://www.actitime.com/contact-support");
		int y = driver.findElement(By.id("fileupload")).getLocation().getY();
		int y1 = y-200;
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, "+y1+")");
		Thread.sleep(2000);
		String fp= "C:\\Users\\Home\\Desktop\\Copy of Annexuer-I- 34142-2020-1 (1)";
		driver.findElement(By.id("fileupload")).sendKeys(fp);
		driver.close();
}

}
