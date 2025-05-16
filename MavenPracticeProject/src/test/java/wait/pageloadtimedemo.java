package wait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pageloadtimedemo {
	
	

public static void main (String[] args) {
	
	
	WebDriverManager.firefoxdriver().setup();	
	WebDriver driver = new FirefoxDriver();
	driver.get("https://learn-automation.com/handle-multiple-windows-in-selenium-webdriver/");
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
	
}

}
