package textexecution;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

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

}
