package utilitties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	 private static ThreadLocal<WebDriver> driver =
	            new ThreadLocal<>();

	    public static void setDriver(String browser) {

	        WebDriver webDriver;

	        if (browser.equalsIgnoreCase("chrome")) {
	            webDriver = new ChromeDriver();

	        } else if (browser.equalsIgnoreCase("firefox")) {
	            webDriver = new FirefoxDriver();

	        } else if (browser.equalsIgnoreCase("edge")) {
	            webDriver = new EdgeDriver();

	        } else {
	            throw new IllegalArgumentException(
	                    "Browser not supported: " + browser);
	        }

	        driver.set(webDriver);
	    }

	    public static WebDriver getDriver() {
	        return driver.get();
	    }

	    public static void quitDriver() {

	        if (driver.get() != null) {
	            driver.get().quit();
	            driver.remove();
	        }
	    }
}
