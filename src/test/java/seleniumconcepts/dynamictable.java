package seleniumconcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dynamictable {
	
	@Test
	public void dynamictable() {
		
	
	WebDriver driver ;
	driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"taskTable\"]"));
	for(WebElement row:rows) {
		
		//System.out.println(row.getText());
		 String name = row.findElement(
		            By.xpath("//*[@id=\"rows\"]/tr[3]/td[1]")).getText();
		 
		 if(name.equalsIgnoreCase("Firefox")) {
			 
			row.findElement(
		                By.xpath("./td[5]")).click();
		           row.getText();
		           System.out.println(row.getText());
		      break;
		 }
	}
	
	
	
	
	}
}
