package textexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import POMpage.SignupLoginPage;
import POMpage.homepage;
import POMpage.registeerpage;
import basepage.baseclass;


public class registeerclass  extends baseclass{
	
	@Test
	public void regiestercreated() {
		
		registeerpage rp = new registeerpage(driver);
		
		rp.username(randomstring(),randomalpanumaric() );
		rp.radiobuttonclick();
		rp.name(randomstring());
		rp.pass("Siva$123");
		rp.dateofbirth();
		rp.clicknewsleete();
		rp.firstlastcompany("siva", "reddy", "capgemini");
		rp.addres("ammenpur", "brudhavancolony");
		rp.country();
		rp.statecityzipmobile("andhraparadesh", "guntur", "500500", "44455");
		rp.create();		
		
		
	}
      @Test
	public void Register_User_with_existing_email() {
		
		
		homepage hp = new homepage(driver);
		hp.isHomePageVisible();
		hp.clickSignupLogin();
		  SignupLoginPage signupPage =
		            new SignupLoginPage(driver);

		        // Step 1: Verify home page
		  Assert.assertTrue(
		            hp.isHomePageVisible(),
		            "Home page is not visible"
		        );

		        System.out.println("Home page displayed successfully");

		        // Step 2: Click Signup / Login
		        hp.clickSignupLogin();

		        // Step 3: Verify New User Signup heading
		        Assert.assertTrue(
		            signupPage.isNewUserSignupVisible(),
		            "New User Signup heading is not visible"
		        );

		        System.out.println("New User Signup heading is visible");

		        // Step 4: Enter name and registered email
		        signupPage.enterName("sivareddy");
		        signupPage.enterEmail("sivareddy@gmail.com");

		        // Step 5: Click Signup
		        signupPage.clicksignbutton();

		        // Step 6: Verify error message
		        String actualError = signupPage.getExistingEmailError();

		        String expectedError = "Email Address already exist!";

		        Assert.assertEquals(
		            actualError,
		            expectedError
		           
		        );

		      
		    }
		
		
		
		
		
	}


