package testNG_first;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enable {
	public class Priority {
		@Test(enabled = false)
		public void login() {
			Reporter.log("Login",true);
			}
		@Test( )
		public void signup() {
			Reporter.log("Signup",true);
		}
		@Test()
		public void like() {
			Reporter.log("Like a page",true);
		}
		}
}
