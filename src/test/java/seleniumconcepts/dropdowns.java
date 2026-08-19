package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import basepage.baseclass;

public class dropdowns extends baseclass {
	
	@Test
	public void dropdown() {
		
		WebElement drop =driver.findElement(By.xpath("//*[@id=\"country\"]"));
		
		Select dp = new Select(drop);
	//	dp.selectByVisibleText("Canada");
	
	  //  dp.selectByValue("usa");
	    dp.selectByIndex(5);
		
	}

}
