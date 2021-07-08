import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testtitle {
	
	
	
	@Test
	public void titletest() {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://pos-crm.smartbytz.com/login");
		
		String actual_title = driver.getTitle();
		
		String expected_title = "PosBytz | Login";
		System.out.println(actual_title);
		Assert.assertEquals(actual_title, expected_title);
		
		
	}

}
