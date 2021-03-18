package QSP;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
        String url= driver.getCurrentUrl();
        System.out.println(url);
	    String src= driver.getPageSource();
		System.out.println(src);
		Dimension d= new Dimension(200,250);
		driver.manage().window().setSize(d);
		Point p=new Point(300,200);
		driver.manage().window().setPosition(p);
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.close();
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.close();
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.close();
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.close();
		driver.switchTo().activeElement().sendKeys("java programming");
		driver.quit();
	}

}
