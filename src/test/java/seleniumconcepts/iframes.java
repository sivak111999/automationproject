package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepage.baseclass;

public class iframes extends baseclass {
	
	@Test
	public void ifram() {
		
		driver.switchTo().frame("iframe2");
	driver.findElement(By.xpath("//*[@id=\"post-body-3189750326796220280\"]/table/tbody/tr[2]/td/ol/li[3]/b/a")).click();

		//JavascriptExecutor js = (JavascriptExecutor) driver;

	//	js.executeScript("arguments[0].click();", frame);

	//	js.executeScript("window.scrollBy(0,500)");

//		js.executeScript("arguments[0].scrollIntoView()", frame);
	//	driver.switchTo().frame(frame);
		//js.executeScript("arguments[0].click();", frame);
		driver.switchTo().defaultContent();
		
	}
	

}
