import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) throws Exception {
		
	
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("IPhone");
	  driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	  Thread.sleep(3000);
	  System.out.println(driver.findElement(By.xpath("(//div[@data-cy='title-recipe'])[1]")).getText());
	  System.out.println(driver.findElement(By.xpath("(//span[@class='a-price-whole']/preceding::div[@data-cy='title-recipe'])[1]")).getText());
	  System.out.println(driver.findElement(By.xpath("//div[@data-cy='title-recipe']/following::span[@class='a-price-whole']")).getText());
	}
	    	
}
       	

				
			
		
	    	
	 
	    

		
		
		


	


