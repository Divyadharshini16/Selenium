package QSP;
import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Browser Name");
        String browser=sc.next();
        if(browser.equals("chrome"))
        {
        	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        	ChromeDriver c= new ChromeDriver();
        	c.close();
        }
        else if(browser.equals("firefox"))
        {
        	System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
            FirefoxDriver f= new FirefoxDriver();
        	Thread.sleep(2000);
        	f.close();
        }
	}

}
