package QSP;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowpopup {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");

    }
public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.linkText("3.141.59")).click();
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_LEFT);
        Thread.sleep(2000);
        r.keyRelease(KeyEvent.VK_LEFT);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_LEFT);
        Thread.sleep(2000);
        r.keyRelease(KeyEvent.VK_LEFT);
        Thread.sleep(2000);     
        r.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        driver.close();
        
		
		
}
		

}
