package seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepage.baseclass;

public class webelements  extends baseclass{
	
	@Test
	public void webelement() {
		
		//sendKeys();

/*driver.findElement(By.id("name")).sendKeys("SivaReddy");
		//click();
WebElement login = driver.findElement(By.xpath("//*[@id=\"male\"]"));
login.click();

		//clear();
WebElement search = driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-input\"]"));

search.sendKeys("Laptop");

search.clear();

		//submit();
driver.findElement(By.xpath("//*[@id=\"input1\"]")).submit(); 

		//getText();
String text = driver.findElement(By.tagName("h2")).getText();

System.out.println(text);

		//getAttribute();
String value = driver.findElement(By.id("username"))
.getAttribute("value");

System.out.println(value); */

		//isDisplayed();
WebElement logo = driver.findElement(By.id("name"));

System.out.println(logo.isDisplayed());

		//isEnabled();
WebElement login1 = driver.findElement(By.id("name"));

System.out.println(login1.isEnabled());

		//isSelected();
		
WebElement checkbox = driver.findElement(By.id("name"));

checkbox.click();

System.out.println(checkbox.isSelected()); 
	}

}
