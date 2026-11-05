package seleniumconcepts;

import java.io.IOException;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkChecker2 {
    public static void main(String[] args) throws MalformedURLException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement> links = driver.findElements(By.tagName("a"));     
        
        System.out.println("Total links found: " + links.size());
        int validLinks = 0;
        int brokenLinks = 0;
        int unableToCheck = 0;
        
        for(WebElement link :links) {
        	
        	String url = link.getAttribute("herf");
        	
        	
        	if(url==null || url.isEmpty() ) {
        		
             	
        		continue;
        	}
        	try {
        		
        	
        	 HttpURLConnection connection =
                     (HttpURLConnection) URI.create(url)
                             .toURL()
                             .openConnection();
        	 connection.setRequestMethod("head");
        	 connection.connect();
        	 int responsecode = connection.getResponseCode();
        	 
        	 if(responsecode >= 400) {
        		 System.out.println( "Broken Link: " + url 
        				 + " | Status Code: " + responsecode  );
        		 brokenLinks ++;
        	 } else {
        		 
        		 System.out.println( "Valid Link: " + url 
        				 + " | Status Code: " + responsecode  );
        		 validLinks++;
        	 }
        	 connection.disconnect();
        	 
        }catch (Exception e) {
     	   System.out.println(
                   "Unable to verify: " + url);
       }
        	
        
            System.out.println("Valid Links: " + validLinks);
            System.out.println("Broken Links: " + brokenLinks);
        driver.quit();
   
        }
    }
}