package testNG_first;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
@Test(priority = 2)
public void login() {
	Reporter.log("Login",true);
	}
@Test(priority =1 )
public void signup() {
	Reporter.log("Signup",true);
}
@Test(priority = 3)
public void like() {
	Reporter.log("Like a page",true);
}
}
