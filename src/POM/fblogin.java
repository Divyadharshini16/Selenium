package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fblogin {

	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="pass")
	private WebElement pw;
	
	@FindBy(id="u_0_b")
	private WebElement login;
	
	public fblogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterEmail(String mailID)
	{
		email.sendKeys(mailID);
	}
	public void enterpw(String passwd)
	{
		pw.sendKeys(passwd);
	}
	public void loginbtn()
	{
		login.click();
	}
}
