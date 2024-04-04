package Crossbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verifycrossbrowser {
	WebDriver driver;
	
	@Test
	@Parameters("Browsers")
	public void crossbrowsertest(String browsername) {
		
		
		if(browsername.equalsIgnoreCase("FireFox")) {
			
			driver= new FirefoxDriver();			
		}
		
		else if(browsername.equalsIgnoreCase("Chrome")) {
			
			 driver = new ChromeDriver();
		}
		
		
		driver.get("https://app.posbytz.com/account/login?next=/store/settings");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
