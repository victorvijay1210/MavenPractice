import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getpagesource {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://pos.smartbytz.com/account/login");
    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());
	driver.close();
		
	}

}
