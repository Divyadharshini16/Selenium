package QSP;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class AllSuggestions {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");

    }

	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.get("https://www.google.com/");
         driver.findElement(By.name("q")).sendKeys("selenium");
         List<WebElement> allsug= driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
         int count = allsug.size();
         System.out.println(count);
         for(WebElement sug : allsug)
         {
        	 String text= sug.getText();
        	 System.out.println(text);
         }
         Thread.sleep(2000);
         allsug.get(count-1).click();
         Thread.sleep(2000);
         driver.close();
	}
	

}
