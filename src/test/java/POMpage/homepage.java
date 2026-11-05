package POMpage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homepage {
	
	   private WebDriver driver;
	  //  private WebDriverWait wait;

	    private By homeLogo =
	        By.xpath("//div[@class='logo pull-left']//img");

	    private By signupLoginButton =
	        By.xpath("//a[contains(.,'Signup / Login')]");

	    public homepage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	       
	    }

	    public boolean isHomePageVisible() {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	         return wait.until(
	            ExpectedConditions.visibilityOfElementLocated(homeLogo)
	        ).isDisplayed();
	    }

	    public void clickSignupLogin() {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(
	            ExpectedConditions.elementToBeClickable(signupLoginButton)
	        ).click();
	    }

}
