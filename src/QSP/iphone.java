package QSP;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iphone {
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
         WebElement i= driver.findElement(By.name("q"));
         i.sendKeys("iphone11");
         i.sendKeys(Keys.ENTER);
         WebElement first = driver.findElement(By.xpath("(//a[@class='_1fQZEK'])[1]"));
         WebElement price =first.findElement(By.xpath("(//div[@class = '_30jeq3 _1_WHN1'])[1]"));
        System.out.println(price.getText());
	}
}
