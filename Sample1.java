package testNG_first;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 {
	@Test(groups = {"smoke"})
	public void a() {
		Reporter.log("signup",true);
	}
	@Test(groups = ("sanity"))
	public void b() {
		Reporter.log("Login",true);
	}
	@Test(groups = ("regression"))
	public void c() {
		Reporter.log("like a page",true);
	}
	

}
