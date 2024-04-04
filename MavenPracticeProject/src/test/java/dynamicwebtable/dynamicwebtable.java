package dynamicwebtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamicwebtable {
	
	
	@Test
	public static void handlingwebtable() throws Exception {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://pos.smartbytz.com/account/login?next=/sale/report/sales-summary/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		driver.findElement(By.name("username")).sendKeys("dunzonew");
		driver.findElement(By.xpath("//body/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/input[1]")).sendKeys("qwert@123");
		driver.findElement(By.id("js_login")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[1]/div[1]/nav[1]/ul[1]/a[1]")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(),'May 1, 2021 - May 25, 2021')]")).click();
        driver.findElement(By.xpath("//li[contains(text(),'Custom Range')]")).click();
     List<WebElement> calender=  driver.findElements(By.xpath("//body/div[2]/div[2]"));
     
    int datecount= calender.size();
    
    for(int i=0;i<datecount;i++) {
    	
    	String dateno=calender.get(i).getText();
    	
    	if(dateno.equalsIgnoreCase("25")) {
    		act.moveToElement(calender.get(i)).build().perform();
    		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
    		break;
    	}
    	
    }
        
		
	}

}
