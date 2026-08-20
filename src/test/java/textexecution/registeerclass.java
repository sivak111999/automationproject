package textexecution;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import POMpage.registeerpage;
import basepage.baseclass;

public class registeerclass  extends baseclass{
	WebDriver driver;
	@Test
	public void regiestercreated() {
		
		registeerpage rp = new registeerpage(driver);
		
		rp.username("sivareddy", "siavreddy@gmail.com");
		rp.radiobuttonclick();
		rp.name("sivareddy");
		rp.pass("Siva$123");
		rp.dateofbirth(16, 06, 1997);
		rp.clicknewsleete();
		rp.firstlastcompany("siva", "reddy", "capgemini");
		rp.addres("ammenpur", "brudhavancolony");
		rp.country();
		rp.statecityzipmobile("andhraparadesh", "guntur", "500500", "44455");
		rp.create();		
		
		
	}

}
