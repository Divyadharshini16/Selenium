package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	
	
	@Test(priority = 1)
	public void RegisterUser()
	{
		Reporter.log("User is Registerd", true);
	}
	@Test(dependsOnMethods = "RegisterUser")
	public void DeleteUser()
	{
		Reporter.log("User is deleted", true);
	}

}
