import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testtitle {
	
	
	
	@Test
	public void titletest() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://t2.devero.com/?site=qaautomation");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.name("username")).sendKeys("sa");
		
		driver.findElement(By.name("password")).sendKeys("testing123");
		
		
		driver.findElement(By.id("submitButton")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[contains(text(),'New Patient')]")).click();
		
		Thread.sleep(10000);
		
		try {
			driver.findElement(By.xpath("//td[contains(text(),'First Name')]//parent::tr//preceding-sibling::td//input[@name='value(M0040FirstName)']")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//td[contains(text(),'First Name')]//parent::tr//preceding-sibling::td//input[@name='value(M0040FirstName)']")).sendKeys("Vijay");
		
		
	}

}
