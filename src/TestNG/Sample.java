package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample extends annotations {
	@Test
	public void sampletest()
	{
		Reporter.log("testcases", true);
	}

}
