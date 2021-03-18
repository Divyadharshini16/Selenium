package QSP;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");

    }

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		driver.get("https://home.redbrickhealth.com/");
		WebElement English= driver.findElement(By.xpath(("(//span[@class='menu-image-title-after menu-image-title'])[1]")));
		Thread.sleep(2000);	
		Actions a= new Actions(driver);
		a.moveToElement(English).perform();
		List<WebElement> menu =driver.findElements(By.id("menu-languages"));
		int count = menu.size();
		System.out.println(count);
		for(WebElement lang : menu)
		{
			String text = lang.getText();
			System.out.println(text);
		}
		
		Thread.sleep(2000);
		driver.close();
	}
}
