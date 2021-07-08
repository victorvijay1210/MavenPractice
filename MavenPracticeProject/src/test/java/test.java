import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://develop-ecosystem.gravitycare.health/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@placeholder='Enter Email ID / Mobile Number']")).sendKeys("gravityadmin@yopmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("Admin@123");
		driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h3[contains(text(),'Gravity Hospital')]")).click();
		driver.findElement(By.xpath("//body/div[@id='q-app']/div[1]/div[1]/div[1]/main[1]/div[1]/button[1]/span[2]/span[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Manage Gravity Users')]")).click();
		driver.findElement(By.xpath("//body/div[@id='q-app']/div[1]/div[1]/aside[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/div[2]")).click();
		Thread.sleep(3000);
			    	
	    
	}
	    	
}
       	

				
			
		
	    	
	 
	    

		
		
		


	


