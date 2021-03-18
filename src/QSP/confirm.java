package QSP;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class confirm {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");

    }
public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.get("file:///E:/Selenium/Selenium%20notes/Webpages/confirm1.html");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[.='Try it']")).click();
        Alert a = driver.switchTo().alert();
        a.dismiss();
        driver.close();
}

}
