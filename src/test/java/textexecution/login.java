package textexecution;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v136.page.model.Screenshot;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POMpage.loginpage;
import basepage.baseclass;

import org.testng.annotations.Listeners;

import utilitties.TestListener;


@Listeners(TestListener.class)
public class login extends baseclass {
	
	
	
	 

		   @Test(priority=1, groups ={"regression"})
		    public void validcrenditials() throws Exception {
			   
			   
               logger.info("test satrted");
		        loginpage log = new loginpage(driver);
               logger.info("enter the credntials");
              log.login("sivareddy@gmail.com","Siva$123");
              
              capturescreen( driver,"validcrenditials.png");
           //   logger.info("testexecuted");
          
		       
		     
		    }
		   
		 //  String expectedmessage="Your email or password is incorrect!";
		   @Test(priority=2, groups={"regression"})
			   public void invalidcredentials() throws IOException {
			   
			   logger.info("test satrted");
			   loginpage login = new loginpage(driver);
		       login.login("sivareddy1@gmail.com", "Siva$1234");
		      logger.info("get error message");
		      capturescreen(driver,"invalidcredentials.png");
		      String expectedmessage="Your email or password is incorrect!";
				String actualmessage= login.errmsg();
		System.out.println(actualmessage);
		  
		    Assert.assertEquals(
		            actualmessage,expectedmessage
		            
		        );
		    //  logger.info("testended");
			   
		   }
		   @Test(priority=3,groups ={"regression"})
		   public void invalidemaiidandvalidpassword() throws IOException {
		   
		   logger.info("test satrted");
		   loginpage login = new loginpage(driver);
	       login.login("sivareddy123@gmail.com", "Siva$123");
	      logger.info("get error message");
	      capturescreen(driver,"invalidemaiidandvalidpassword.png");
	      String expectedmessage="Your email or password is incorrect!";
			String actualmessage= login.errmsg();
	System.out.println(actualmessage);
	  
	   Assert.assertEquals(actualmessage, expectedmessage);
	     logger.info("testended");
		   
	   }
		   @Test(priority=4,groups ={"regression"})
		   public void validemaiidandinvalidpassword() throws IOException {
		   
		   logger.info("test satrted");
		   loginpage login = new loginpage(driver);
	       login.login("sivareddy123@gmail.com", "Siva$123");
	      logger.info("get error message");
	      capturescreen(driver,"validemaiidandinvalidpassword.png");
	      String expectedmessage="Your email or password is incorrect!";
			String actualmessage= login.errmsg();
	System.out.println(actualmessage);
	  
	   Assert.assertEquals(actualmessage, expectedmessage);
	     logger.info("testended");
		   
	   }
		   @Test(priority=5,groups ={"regression"})
		   public void ValidateloggingintotheApplicationwithoutprovidinganycredentials() throws IOException {
		   
		   logger.info("test satrted");
		   loginpage login = new loginpage(driver);
	       login.login("", "");
	      logger.info("get error message");
	      capturescreen(driver,"ValidateloggingintotheApplicationwithoutprovidinganycredentials.png");
	      String expectedmessage="please fill in this feild.";
			String actualmessage= login.errmsg();
	System.out.println(actualmessage);
	  
	   Assert.assertEquals(actualmessage, expectedmessage);
	     logger.info("testended");
		   
	   }
		   @Test(priority=6,groups ={"regression"})
		   public void repeatedlogin() throws IOException {
		   
		   logger.info("test satrted");
		   loginpage login = new loginpage(driver);
	       login.login("sivareddy123@gmail.com", "Siva");
	      logger.info("get error message");
	      capturescreen(driver,"ValidateloggingintotheApplicationwithoutprovidinganycredentials.png");
	      String expectedmessage="Your email or password is incorrect!";
			String actualmessage= login.errmsg();
	System.out.println(actualmessage);
	  
	   Assert.assertEquals(actualmessage, expectedmessage);
	   
		   }
		   
		   public   String randomstring() {
			   
			    String generatedstring = RandomStringUtils.randomAlphabetic(5);
			   return generatedstring;
			   
		   }
		   
		   public String randomnumber() {
			    String generatednumber= RandomStringUtils.randomNumeric(10);
				return generatednumber
						;
			   
		   }
		   
		   public String randomalpanumaric() {
			   String generatedstring = RandomStringUtils.randomAlphabetic(3);
			   String generatednumber = RandomStringUtils.randomNumeric(3);
			   return (generatedstring+ "@"+generatednumber);
		   }
	

	   
}
