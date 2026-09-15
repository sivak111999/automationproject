package seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepage.baseclass;

public class javascriptexecutor extends baseclass {
	
	
	@Test
	public void javascript() {
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"PageList1\"]/div/ul/li[1]/a"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

	js.executeScript("arguments[0].scrollIntoView();", element);
	element.click();
	}

	public void executeScript(String string, List<WebElement> rows) {
		// TODO Auto-generated method stub
		
	}

}
