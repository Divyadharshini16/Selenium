 package QSP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {
	static
	{
		
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");

		}

	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.selenium.dev/downloads/");
	}

}
