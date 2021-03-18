package QSP;

import org.openqa.selenium.chrome.ChromeDriver;

public class cBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver c=new ChromeDriver();
		Thread.sleep(2000);
		c.close();

	}

}
