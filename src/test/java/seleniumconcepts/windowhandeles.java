package seleniumconcepts;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import basepage.baseclass;

public class windowhandeles  extends baseclass{

	@Test
	public void windowhandle() {
		
		
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("ipone15");
		
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		//driver.findElement(By.xpath("//*[@id=\"bcfa69fb-0816-4aa0-ba5f-872cccbcc6ae\"]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/a/h2/span/text()")).click();
List<WebElement> web = driver.findElements(By.xpath("//*[@class='a-link-normal s-line-clamp-2 puis-line-clamp-3-for-col-4-and-8 s-link-style a-text-normal']"));
		web.get(0).click();
		String parrentwindoe=driver.getWindowHandle();
		
		Set<String> childwindow = driver.getWindowHandles();
		  for(String window : childwindow)
	        {
	            if(!window.equals(parrentwindoe))
	            {
	               driver.switchTo().window(window);
	                break;
	          
	            }
	        }
		  System.out.println("Child Window Title: " + driver.getTitle());
WebElement radio=driver.findElement(By.xpath("//*[@class='a-icon a-accordion-radio a-icon-radio-inactive']"));
radio.click();
System.out.println(  radio.isSelected());
System.out.println(  radio.isDisplayed());
		  driver.switchTo().window(parrentwindoe);

	        // Print Child Window Title
	        System.out.println(driver.getTitle());

	        driver.quit();
	}
}
