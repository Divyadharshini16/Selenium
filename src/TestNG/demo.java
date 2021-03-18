package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demo {
	@Test
	public void testA()
	{
		Reporter.log("Hi",true);
	}

}
