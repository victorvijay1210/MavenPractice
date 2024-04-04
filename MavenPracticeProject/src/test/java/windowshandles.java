import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowshandles {
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		String parent_window=driver.getWindowHandle();
		
	Set<String> S1=driver.getWindowHandles();
	
	Iterator<String>I1 =S1.iterator();
	
	
	while(I1.hasNext()) {
		
	String child_window=I1.next();
	
	
	if (!parent_window.equals(child_window)){
		
		driver.switchTo().window(child_window);
		System.out.println(driver.switchTo().window(child_window).getTitle());
		driver.close();
	}
	
	}
	driver.switchTo().window(parent_window);
	
	}
}
