package verification_and_validation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verifyerror {
	
	
	@Test
public void verify() {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://pos.smartbytz.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		driver.findElement(By.xpath("//button[@id='js_login']")).click();
	String actual_text=	driver.findElement(By.xpath("//span[@id='username-error']")).getText();
	//String actual_text=	driver.findElement(By.xpath("//span[@id='username-error']")).getAttribute("innerHTML");
	
    String expected_text="This field is required.";
	
    //Type1
    Assert.assertEquals(actual_text, expected_text);
        
    driver.close();
}

}
