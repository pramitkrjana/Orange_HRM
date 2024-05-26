package testNG_first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_1 {
	
	@Test
	public void facebook()
	{
		
		System.setProperty("webdriver.edge.driver", "./Pramit_Software/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		 String title = driver.getTitle();
		 Reporter.log(title);
	}
	@Test
	public void ytube() 
	{
		System.setProperty("webdriver.edge.driver", "./Pramit_Software/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.youtube.com/");
		 String title = driver.getTitle();
		 Reporter.log(title);
		
	}
	
	


}
