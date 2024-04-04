package handling_secure_http_server;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlecertificate {
	
	
	@SuppressWarnings("deprecation")
	@Test
	public static void httpsecure() {
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
	
		
		//WebDriver driver = new ChromeDriver(cap);
		
		//driver.get("https://www.cacert.org/");
	}

}
