package POMpage;

import static org.testng.Assert.assertEquals;
import org.testng.Assert;

import basepage.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;




public class loginpage  {
	
	static  WebDriver driver;
	 
       
	 
	    @FindBy(xpath = "//input[@data-qa='login-email']")
	    WebElement loginusername;

	    @FindBy(xpath = "//input[@name='password']")
	    WebElement loginpassword;

	    @FindBy(xpath = "//button[@data-qa='login-button']")
	    WebElement loginsubmite;
	    
	    @FindBy(xpath="//*[@id=\"form\"]/div/div/div[1]/div/form/p")
	    WebElement errormsg;

	   
	    public loginpage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    
	    
	    public void login(String user, String pass) {
	        loginusername.sendKeys(user);
	        loginpassword.sendKeys(pass);
	        loginsubmite.click();
	    }
	    
	    public String  errmsg() {
	    	return errormsg.getText();
	    }
	    public void login1(String user1, String pass1) {
	    	
	    	
	        loginusername.sendKeys(user1);
	        loginpassword.sendKeys(pass1);
	        loginsubmite.click();
	    }
	

}
