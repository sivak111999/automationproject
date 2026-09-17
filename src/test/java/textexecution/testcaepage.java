package textexecution;

import org.testng.Assert;
import org.testng.annotations.Test;

import POMpage.loginpage;
import POMpage.testcaespage;
import basepage.baseclass;

public class testcaepage extends baseclass {
	
	
	@Test
	void verifytestcaepage() {
		
		  logger.info("test satrted");
	        loginpage log = new loginpage(driver);
         logger.info("enter the credntials");
        log.login("sivareddy@gmail.com","Siva$123");
        testcaespage test = new testcaespage(driver);
        test.tescasebutton();
        String actualTitle = driver.getTitle();
     //   System.out.println(actualTitle);
        Assert.assertEquals(actualTitle, "Automation Exercise",
                "User is  navigated to Test Cases page");
        //System.out.println(driver.getTitle());
	}

}
