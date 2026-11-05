package seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	WebDriver driver ;
	public void alertsmethod() {
		
	
	driver = new ChromeDriver();
	driver.switchTo().alert().accept();
     driver.quit();
	
	}
	
}
