package QSP;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrolling {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");

    }
public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		driver.get("https://www.youtube.com/");
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
       js.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(2000);
        driver.get("https://www.selenium.dev/downloads/");
        int y = driver.findElement(By.xpath("//h2[.='Selenium Client & WebDriver Language Bindings']")).getLocation().getY();
        int y1= y-200;
        js.executeScript("window.scrollBy(0, "+y1+")");
        driver.close();

}
}