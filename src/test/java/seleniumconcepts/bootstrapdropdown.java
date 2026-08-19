package seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepage.baseclass;

public class bootstrapdropdown  extends baseclass{
	
	@Test
	public void bootstrap() {
		
	//	driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//div[@class='selector-wraplist productType option-box']")).click();
	List<WebElement> drop =	driver.findElements(By.xpath("//ul[@class='options']/li"));
	System.out.println(drop.size());
	
	selectdropdown(drop, "HDFC Bank MYCards");
		
	/*for(WebElement dr : drop) {
		
		if(dr.getText().equals("HDFC Bank MYCards")){
			dr.click();
			break;
		}
		
	}*/
	}
	public static void selectdropdown(List<WebElement> options, String value) {
		
		for(WebElement option : options) {
			
			if(option.getText().equals(value)) {
				
				option.click();
				break;
			}
		}
		
	}
		
	
	}
	


