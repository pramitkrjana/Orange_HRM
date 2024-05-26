package testNG_first;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Multiple_Parameter {
	@Test(priority = 1,invocationCount = 1)
	public void login() {
		Reporter.log("Login",true);
		}
	@Test(dependsOnMethods="login")
	public void signup() {
		Reporter.log("Signup",true);
	}
	@Test(enabled = false)
	public void like() {
		Reporter.log("Like a page",true);
	}
	}



