import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handlingradiobutton {

	
	@Test
	public void verifyradiobutton() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=1653993520&extra_1=s%7Cc%7C318503009653%7Cb%7Copen%20facebook%7C&placement=&creative=318503009653&keyword=open%20facebook&partner_id=googlesem&extra_2=campaignid%3D1653993520%26adgroupid%3D63066389683%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-4155752899%26loc_physical_ms%3D9061977%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjw7pKFBhDUARIsAFUoMDYch4gNBrLgnP8uGAxJ72HLdWp1yPcS89LYpWNi9jFJ_Sfb_21PjNkaAigpEALw_wcB");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	WebElement radio_button	=driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
    boolean status1=	radio_button.isDisplayed();
	System.out.println("The radio button status is "+status1);
	boolean status2=radio_button.isEnabled();
	System.out.println("The radio button status is "+status2);
	boolean status3 =radio_button.isSelected();
	System.out.println("The radio button status is "+status3);
	radio_button.click();
	boolean status4 =radio_button.isSelected();
	System.out.println("The radio button status is "+status4);
		
	}
}
