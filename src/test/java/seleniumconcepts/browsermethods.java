package seleniumconcepts;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import basepage.baseclass;

public class browsermethods extends baseclass {
	
	@Test
	public void browsermethod() {
		
	
	//driver.get("https://www.google.com");
	//driver.navigate().to("https://www.amazon.in");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Amazon"));

		System.out.println(driver.getTitle());

    System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());

	//driver.close();
	driver.quit();
	}
}
