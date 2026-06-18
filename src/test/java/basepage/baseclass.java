package basepage;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	 public static WebDriver driver;
	
	@BeforeClass
	public void setupmethod() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().window().maximize();

		
		
       // driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.get("https://automationexercise.com/login");
		//driver.findElement(By.xpath(""));
		
		
		
	}
	  @AfterMethod
	    public void tearDown() {

	        driver.quit();
	    }

}
