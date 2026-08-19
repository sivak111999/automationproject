package seleniumconcepts;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import basepage.baseclass;

public class amazon extends baseclass {
	
	@Test
	public void findcountry() {
		
		
		System.out.println(driver.getTitle());
		
		String actualprice = "59,900";
		
	//driver.findElement(By.xpath("//i[@class='a-icon a-icon-dropdown']")).click();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("ipone15");
	
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		
	List<WebElement> price =driver.findElements(By.xpath("//span[contains(@class,'a-price')]"));
	//List<WebElement> prices = driver.findElements(By.xpath("//span[@class='price']"));

	for (int i = 0; i < price.size(); i++) {

	    String prices = price.get(i).getText();

	    if (prices.equals("₹59900")) {

	        driver.findElements(By.xpath("//*[@id=\"a-autoid-4-announce\"]")).get(i).click();

	        break;
	    }
	}

	price.get(0).click();
	/*String firstPrice = price.get(0).getText();

	System.out.println(firstPrice);
	Assert.assertEquals(actualprice, firstPrice); */
	

	String parent = driver.getWindowHandle(); 
	
	Set<String> child = driver.getWindowHandles();
	
	System.out.println(parent);
	//stem.out.println(child);

	for(String id:child)
	{
		System.out.println(id);
	}
	driver.switchTo().window(parent);
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
	
	driver.findElement(By.xpath("//*[@id=\"7c4bd195-5149-4f57-8f11-7620426c8076\"]/div/div/div/div/span/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div[1]/div[1]/a/span/span[2]/span[2]")).click();
	
	
//	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	//js.executeScript("arguments[0].clcik();", price);
	
	
	
		
	
	
	//driver.findElement(By.xpath("//i[@class='a-icon a-icon-dropdown']")).click();
	//	List<WebElement> countries =
		//driver.findElements(By.xpath("//li"));

		//countries.get(countries.size()-2).click();
		//countries.get(countries.size()-2).click();
	
		//countries.get(countries.size()-2).click();
	
//System.out.println(price.size());
System.out.println(price);
	}
	

}
