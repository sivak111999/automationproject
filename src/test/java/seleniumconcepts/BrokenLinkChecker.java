package seleniumconcepts;

import java.io.IOException;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkChecker {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement> links = driver.findElements(By.tagName("a"));     
        
        System.out.println("Total links found: " + links.size());
        for (WebElement link : links) {

            String url = link.getAttribute("href");

            // Ignore empty links
            if (url == null || url.isEmpty()) {
                continue;
            }

            try {
                HttpURLConnection connection =
                        (HttpURLConnection) URI.create(url)
                                .toURL()
                                .openConnection();
             
                connection.setRequestMethod("HEAD");
                connection.connect();

                int responseCode =
                        connection.getResponseCode();

                if (responseCode >= 400) {
                    System.out.println(
                            "Broken Link: " + url +
                            " | Status Code: " + responseCode);
                } else {
                    System.out.println(
                            "Valid Link: " + url +
                            " | Status Code: " + responseCode);
                }

                connection.disconnect();

            } catch (Exception e) {
            	   System.out.println(
                           "Unable to verify: " + url);
               }
      
     /*   List<WebElement> links = driver.findElements(By.tagName("a"));        
        System.out.println("Total links found: " + links.size());

        for (WebElement element : links) {
            // 2. Extract the href attribute
            String url = element.getAttribute("href");

            // Skip empty or JavaScript links
            if (url == null || url.isEmpty() || url.startsWith("javascript")) {
                continue;
            }

            // 3 & 4. Verify if the link is broken
            checkLinkStatus(url);
        }
        driver.quit();
    }

    public static void checkLinkStatus(String linkUrl) {
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection httpConn = (HttpURLConnection) url.openConnection();
            
            // Optimize by requesting headers only (faster than GET)
            httpConn.setRequestMethod("HEAD"); 
            httpConn.setConnectTimeout(3000); // Set a timeout threshold
            httpConn.connect();

            int responseCode = httpConn.getResponseCode();
            
            // HTTP status codes >= 400 indicate errors
            if (responseCode >= 400) {
                System.out.println("❌ BROKEN LINK: " + linkUrl + " ---> Status Code: " + responseCode);
            } else {
                System.out.println("✅ VALID LINK: " + linkUrl + " ---> Status Code: " + responseCode);
            }
        } catch (IOException e) {
            System.out.println("⚠️ ERROR connecting to URL: " + linkUrl + " (" + e.getMessage() + ")");
        } */
        driver.quit();
    }
    }}

