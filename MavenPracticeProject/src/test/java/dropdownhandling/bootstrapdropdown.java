package dropdownhandling;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bootstrapdropdown {
	
	
	@Test
public void bootstrap() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	   driver.findElement(By.xpath("//button[@id='menu1']")).click();	   
	   List<WebElement> list = driver.findElements(By.xpath("//body/div[3]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]"));
	
	   for(WebElement ele:list) {
		   
		   System.out.println(ele.getAttribute("innerHTML"));
		   
		   if(ele.getAttribute("innerHTML").contains("JavaScript")) {
			   
			   ele.click();
		   }
		   break;
		   
	   }
	
	   driver.close();
	   
}

}
