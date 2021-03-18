package QSP;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class screenshot {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");

    }
	public static void getScreenshot(WebDriver driver, String name)
	{
		
	
		try
		{
			Files.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("./"+name+".png"));
		}
		catch(Exception e)
		{
			
		}
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		driver.get("https://www.youtube.com/");
		//TakesScreenshot ts=(TakesScreenshot) driver;
		//File src=ts.getScreenshotAs(OutputType.FILE);
		//File dest = new File("./ss.png");
		//Files.copy(src,dest);
		getScreenshot(driver, "Yt");
		driver.close();
		


}
}