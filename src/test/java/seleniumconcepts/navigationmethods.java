package seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import basepage.baseclass;

public class navigationmethods  {
	WebDriver driver;
	@Test
	public void navigatiomethod() throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		 Thread.sleep(2000);
	System.out.println(	 driver.getTitle());
		driver.get("https://automationexercise.com/");
		 Thread.sleep(2000);
			System.out.println(	 driver.getTitle());

		driver.navigate().back();
		
		driver.navigate().forward();
		driver.navigate().refresh();
	//	driver.navigate().to("");
		
		//driver.close();
		driver.quit();
		
	}

}
