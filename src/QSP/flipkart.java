package QSP;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkart {
	 static
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");

    }

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
         driver.get("https://www.flipkart.com");
         Thread.sleep(3000);
         driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z'] ")).click();
         driver.findElement(By.name("q")).sendKeys("iphone11");
         Thread.sleep(2000);
        List<WebElement> s = driver.findElements(By.xpath("//a[@class='_3izBDY']"));
        int count = s.size();
        System.out.println("The number of Suggestions available for iphone11: " +count);
         driver.close();
         
        
}
}