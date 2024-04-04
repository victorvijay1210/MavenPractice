package handling_auth_popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleauthpopup {
	
	@Test
	public static void authpopup() {
		
		
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // navigate to AUT URL
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    }
  
	

}
