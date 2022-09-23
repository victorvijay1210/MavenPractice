import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newtest {
	
	
	
public static void main(String[] args) throws Exception {
	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.cvfshp.openreach.co.uk/SHP/#/login");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys("btwma1");
    driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("btwma1");
   
    WebElement element = driver.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/div/div/div/form/table/tbody/tr[3]/td/button"));
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", element);
    Thread.sleep(20000);
WebElement select = driver.findElement(By.xpath("/html/body/app-root/app-cpsubmission/div/div[1]/div[2]/div/table/tbody/tr[1]/td[6]/select"));
	
	Select S = new Select(select);
	S.selectByIndex(2);
	WebElement select1 = driver.findElement(By.xpath("/html/body/app-root/app-cpsubmission/div/div[1]/div[2]/div/table/tbody/tr[3]/td[2]/select"));
	Select S1 = new Select(select1);
	S1.selectByValue("3");
	
	
}
}
