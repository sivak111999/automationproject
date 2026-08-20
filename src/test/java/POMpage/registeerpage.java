package POMpage;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class registeerpage {
	
	 WebDriver driver;
	
	@FindBy(xpath="//*[@name='name']")
	WebElement name;
	
	@FindBy(xpath="//*[@data-qa='signup-email']")
	WebElement emailaddres;
	
	@FindBy(xpath="//button[@data-qa='signup-button']")
	WebElement signbutton;
	
	@FindBy(xpath ="//*[@id='id_gender1']")
	WebElement radiobutton;
	
	@FindBy(xpath="//*[@id='name']")
	WebElement name1;
	
	
	
	@FindBy(xpath="//*[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//*[@id='uniform-days']")
	WebElement dateofbirthday;
	@FindBy(xpath="//*[@id='uniform-months']")
	WebElement dateofbirthdaymonth;
	@FindBy(xpath="//*[@id='uniform-years']")
	WebElement dateofbirthdayyear;
	
	@FindBy(xpath="//*[@id='newsletter']")
	WebElement clicksignupbutton;
	
	@FindBy(xpath="//*[@id='optin']")
	WebElement clicknewsleeterbuton;
	
	@FindBy(xpath="//*[@id='first_name']")
	WebElement firstname;
	
	@FindBy(xpath="//*[@id='last_name']")
	WebElement lastname;
	
	@FindBy(xpath="//*[@id='company']")
	WebElement company;
	
	@FindBy(xpath="//*[@data-qa='address']")
	WebElement addres;
	
	@FindBy(xpath="//*[@data-qa='address2']")
	WebElement address2;
	
	@FindBy(xpath="//*[@id=\"country\"]")
	List<WebElement> country;
	
	@FindBy(xpath="//*[@id='state']")
	WebElement state;
	
	@FindBy(xpath="//*[@id='city']")
	WebElement city;
	
	@FindBy(xpath="//*[@id='zipcode']")
	WebElement zipcode;
	
	@FindBy(xpath="//*[@data-qa='mobile_number']")
	WebElement mobilenumber;
	
	@FindBy(xpath="//*[@data-qa='create-account']")
	WebElement createbuttonclick;
	
	
	 public registeerpage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	 
	 public void username(String names, String useremail) {
		name.sendKeys(names);
		emailaddres.sendKeys(useremail);
		signbutton.click();
		
		 
	 }
	 public void radiobuttonclick() {
		 
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		 wait.until( ExpectedConditions.elementToBeClickable(radiobutton));
		 
	 }
	 
	 public void name(String names) {
		 name1.sendKeys(names);
		 
	 }
	 public void pass(String pass) {
		 
		 password.sendKeys(pass);
	 }
	 public void dateofbirth(int day, int month, int yea) {
		 dateofbirthday.sendKeys("day");
		 dateofbirthdaymonth.sendKeys("month");
		 dateofbirthdayyear.sendKeys("yea");
		 
		 
		 
	 }
	 
	 public void clicknewsleete() {
		 
		 clicksignupbutton.click();
		 clicknewsleeterbuton.click();
	 }
	 
	 public void firstlastcompany(String first, String last, String comap ) {
		 firstname.sendKeys(first);
		 lastname.sendKeys(last);
		 company.sendKeys(comap);
		 
		 
	 }
	 
	 public void addres(String addre, String addres2) {
		 addres.sendKeys(addre);
		 address2.sendKeys(addres2);
		 
	 }
	 
	 public void country() {
		 
		 List<WebElement> countr= country;
		 
		 
		 for(WebElement country:countr ) {
			 
			 if(country.equals("india")) {
				 
				 country.click();
			 }
		 }
	 }
		 public void statecityzipmobile(String state1, String city1, String zip, String mobile) {
			 state.sendKeys(state1);
			 city.sendKeys(city1);
			 zipcode.sendKeys(zip);
			 mobilenumber.sendKeys(mobile);
			 
			 
			 
		 }
		 
		 public void create() {
			 
			 createbuttonclick.click();
		 }
		
		
	 
	 
	 

}
