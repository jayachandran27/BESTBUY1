package base;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.Utility;

public class Baseclass extends Utility {
	@BeforeMethod
	
	public void startup() throws IOException, InterruptedException {
		driver = intitalizedriver();
		driver.get(pro.getProperty("url"));
		driver.findElement(By.xpath("//img[@alt='United States']")).click();
		
		
		
	}
@AfterMethod
	public void close()   {
		driver.quit();

	}

}
