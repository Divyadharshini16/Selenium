package QSP;

import org.openqa.selenium.firefox.FirefoxDriver;

public class fbrowser {
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
    	FirefoxDriver f= new FirefoxDriver();
    	Thread.sleep(2000);
    	f.close();
		
	}

}
