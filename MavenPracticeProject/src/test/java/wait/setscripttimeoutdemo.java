package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class setscripttimeoutdemo {

	public static void main(String[] args) {


		WebDriverManager.firefoxdriver().setup();	
		WebDriver driver = new FirefoxDriver();
		driver.get("https://learn-automation.com/handle-multiple-windows-in-selenium-webdriver/");
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		
		
	}

}
