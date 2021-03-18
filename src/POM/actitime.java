package POM;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actitime {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");

    }
public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		driver.get("https://demo.actitime.com/login.do");
		login l = new login(driver);
		l.enterusername("admin");
		Thread.sleep(2000);
		l.enterpassword("manager");
		Thread.sleep(2000);
		l.lbutton();
		Thread.sleep(2000);
		driver.close();
}

}
