package log4j;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class log4jdemo {

	public static void main(String[] args) {

    
		Logger log =Logger.getLogger("log4jdemo");
		
		PropertyConfigurator.configure("Log4j.properties");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		log.info("Chrome driver gets opened");
		driver.get("https://app.posbytz.com/account/login?next=/store/settings");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		log.info("its opening posbytz app");
		driver.close();
		log.info("application gets closed");
		
		
		
	}

}
