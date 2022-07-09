import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newtest {
	
	
	
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("");
	
	
	List<WebElement> list = driver.findElements(By.xpath(""));
	
	List<Double> listprices = new ArrayList<Double>();
	
	for(WebElement pr:list) {
		
		listprices.add(Double.valueOf(pr.getText().replace("$", "")));
	}
	
	Collections.sort(listprices);
	
}
}
