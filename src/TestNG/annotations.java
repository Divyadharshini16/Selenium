package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class annotations {
	@BeforeMethod
	public void beforemethod()
	{
		Reporter.log("Method starts Hi", true);
	}
	
    @AfterMethod
    public void aftermethod()
    {
    	Reporter.log("Method ends bye!!", true);
    }
    
    @BeforeClass
    public void beforeclass()
    {
    	Reporter.log("Test Class Starts", true);
    }
    
    @AfterClass
    public void afterclass()
    {
    	Reporter.log("Class ends", true);
    }
    
    @BeforeTest
    public void beforetest()
    {
    	Reporter.log("Testing Starts", true);
    }
    
    @AfterTest
    public void aftertest()
    {
    	Reporter.log("Testing ends", true);
    }
    
    @BeforeSuite
    public void beforeSuite()
    {
    	Reporter.log("Testing suite starts", true);
    }
    
    @AfterSuite
    public void afterSuite()
    {
    	Reporter.log("Testing suite ends", true);
    }
    	
    	
    }


