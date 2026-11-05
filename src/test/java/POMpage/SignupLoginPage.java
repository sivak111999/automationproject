package POMpage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupLoginPage {
	  private WebDriver driver;
	  //  private WebDriverWait wait;

	    private By newUserSignupHeading =
	        By.xpath("//h2[text()='New User Signup!']");

	    private By nameField =
	        By.xpath("//input[@data-qa='signup-name']");

	    private By emailField =
	        By.xpath("//input[@data-qa='signup-email']");

	    
	    @FindBy(xpath="//*[@data-qa='signup-button']")
	    
	    WebElement signupbuttonclick;
	   
	    @FindBy(xpath="//p[text()='Email Address already exist!']")
	    WebElement existingEmailError;

	    public SignupLoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	       // this.wait = wait;
	    }

	    public boolean isNewUserSignupVisible() {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	         return wait.until(
	            ExpectedConditions.visibilityOfElementLocated(
	                newUserSignupHeading
	            )
	        ).isDisplayed();
	    }

	    public void enterName(String name) {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(
	            ExpectedConditions.visibilityOfElementLocated(nameField)
	        ).sendKeys(name);
	    }

	    public void enterEmail(String email) {
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        wait.until(
	            ExpectedConditions.visibilityOfElementLocated(emailField)
	        ).sendKeys(email);
	    }
	    
	    public void clicksignbutton() {
	    	signupbuttonclick.click();
	    	
	    }

		public String getExistingEmailError() {
			// TODO Auto-generated method stub
			return existingEmailError.getText();
		}

	  

	 
}
