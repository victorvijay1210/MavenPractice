import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	public static void main(String[] args) throws Exception {
		
	
	    ChromeOptions options = new ChromeOptions().addArguments("--incognito");
	    ChromeDriver driver = new ChromeDriver( options);
	    DevTools chromeDevTools = ((ChromeDriver) driver).getDevTools();
	    
	    chromeDevTools.createSession();
		
	
		
	}
	    	
}
       	

				
			
		
	    	
	 
	    

		
		
		


	


