package handling_secure_http_server;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlecertificate {
	
	
	@Test
	public static void httpsecure() {
		
		
		ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true); // This replaces DesiredCapabilities

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.cacert.org/");
	}

}
