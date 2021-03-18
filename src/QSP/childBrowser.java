package QSP;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class childBrowser {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");

    }
public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		driver.get("https://www.naukri.com/");
		String pw = driver.getWindowHandle();
		System.out.println(pw);
		Thread.sleep(3000);
		Set<String>  aw =driver.getWindowHandles();
       int count = aw.size();
       System.out.println("The number of child browsers are :"+ count);
       for(String w :aw)
       {
    	   driver.switchTo().window(w);
    	   String title = driver.getTitle();
    	   System.out.println("The titles of the webpages are:" +title);
       }
       Thread.sleep(2000);
       driver.quit();
}
       }

