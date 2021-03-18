package POM;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");

    }
public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		driver.get("https://www.facebook.com/");
        fblogin fb = new fblogin(driver);
        Thread.sleep(2000);
        fb.enterEmail("mailtodivyadharshini@yahoo.in");
        Thread.sleep(2000);
        fb.enterpw("Sujji123");
        Thread.sleep(2000);
        fb.loginbtn();
}
        
}
