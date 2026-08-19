package seleniumconcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import basepage.baseclass;

public class waits  extends baseclass{
	
	@Test
	public void waitted() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"name\"]")));
		driver.findElement(By.xpath(""));
		
		
	}

}
