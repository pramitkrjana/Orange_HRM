package testNG_first;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Orange_Hrm {
	@Test
	public void hrm()
	{
	System.setProperty("webdriver.edge.driver", "./Pramit_Software/msedgedriver.exe");
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
	      String title = driver.getTitle();
	      System.out.println(title);
	      String title1 = "OrangeHRM";
	      Assert.assertEquals(title, title1 );
	      driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']")).click();
	      driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
	      driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Johnny");
	      driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("johnny");
	      driver.findElement(By.xpath("//button[@type='submit']")).click();
	     boolean dis = driver.findElement(By.xpath("//div[@class='oxd-toast-content oxd-toast-content--success']")).isDisplayed();
	     Assert.assertTrue(dis);
	     System.out.println("Employee is add succesfully");
	                     SoftAssert s = new SoftAssert();
	                     
	                     s.assertEquals(dis, dis);
	                   s.assertAll();
	     
	     
	      
	      
	      
	      
	      
	      
	      
	

}
}
