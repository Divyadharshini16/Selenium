package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
     
	@FindBy(id ="username")
	private WebElement un;
	
	@FindBy(name="pwd")
	private WebElement pw;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement login;
	
	public login(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enterusername(String eun)
	{
		un.sendKeys(eun);
	}
	public void enterpassword(String epw)
	{
		pw.sendKeys(epw);
	}
	public void lbutton()
	{
		login.click();
}
}
