package testNG_first;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation_count {

	@Test(invocationCount =5 )
	public void invo() {
		Reporter.log("lo Bata",true);
	}
}
