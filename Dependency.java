package testNG_first;

import org.seleniumhq.jetty9.security.authentication.LoginAuthenticator;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependency {
	public class Priority {
		@Test()
		public void login() {
			Reporter.log("Login",true);
			}
		@Test(dependsOnMethods="login")
		public void signup() {
			Reporter.log("Signup",true);
		}
		@Test(dependsOnMethods = "signup")
		public void like() {
			Reporter.log("Like a page",true);
		}
		}
}
