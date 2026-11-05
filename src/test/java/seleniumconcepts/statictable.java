package seleniumconcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class statictable {
	
	@Test
	public void statictble() {
	WebDriver driver ;
	driver = new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table"));
	
	for(WebElement data:rows) {
		
	//	System.out.println("table" +data.getText());
		
	
	  List<WebElement> columns =
		        data.findElements(By.xpath("//*[@id=\"HTML1\"]/div[1]/table/tbody/tr[5]"));

		    if (columns.size() >= 3 &&
		        columns.get(1).getText().equals("Master In Selenium")) {

		        String price = columns.get(3).getText();

		        System.out.println("Master In Selenium: " + columns);

		        break;
		    }}}
}
