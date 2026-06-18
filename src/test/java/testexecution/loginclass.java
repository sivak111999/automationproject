package testexecution;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import POMpage.loginpage;
import basepage.baseclass;

public class loginclass extends baseclass {
	// WebDriver driver;
	
	   @Test
	    public void verifyLogin() {

	        loginpage login = new loginpage(driver);
	       login.emai();
	       login.pass();
	       login.clickbutton();
	     
	    }
}
