package POMpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	
	 WebDriver driver;

	    By username = By.xpath("//*[@id=\"form\"]/div/div[1]/div[1]/div/form/input[2]");
	    By password = By.xpath("//input[@name='password']");
	    By loginBtn = By.xpath("//*[text()='Login']");

	    public loginpage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void login(String user, String pass) {

	        driver.findElement(username).sendKeys(user);
	        driver.findElement(password).sendKeys(pass);
	        driver.findElement(loginBtn).click();
	    }

}
