package QSP;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenDivision {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");

    }
public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.get("https://www.cleartrip.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("DepartDate")).click();
        Thread.sleep(2000);
        //driver.findElement(By.xpath("//span[.='December']/../../..//a[.='21']")).click();
        //Thread.sleep(2000);
        Date date = new Date();
        SimpleDateFormat sd = new SimpleDateFormat("d");
        String day = sd.format(date);
        SimpleDateFormat sm= new SimpleDateFormat("MMMM");
        String month = sm.format(date);
        String xp= "//span[.='"+month+"']/../../..//a[.='"+day+"']";
        driver.findElement(By.xpath(xp)).click();
        		
        driver.close();
        
        
}
}
