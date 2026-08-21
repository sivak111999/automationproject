package basepage;




import java.io.File;
import java.io.FileReader;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;


import org.apache.logging.log4j.core.Logger;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class baseclass {
	public org.apache.logging.log4j.Logger logger;
	protected   WebDriver driver;
	@BeforeMethod(groups ={"regression"})
	//@Parameters({"os","browser"})
	public void setupmethod(/*String os, String browser*/ ) throws IOException {

       // WebDriverManager.chromedriver().setup();
		
		FileReader file = new FileReader("./src//test//resources//config.properties");
	Properties	p = new Properties();
	p.load(file);
		logger = LogManager.getLogger(this.getClass());
		String browser="chrome";
		switch(browser.toLowerCase())
		{
		
		case "chrome": driver = new ChromeDriver(); break;
       
		case 	"edge": driver= new EdgeDriver(); break;
		case"firefox":            driver = new FirefoxDriver(); return;
        }
        
       
        driver.manage().window().maximize();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        
       
  // driver.get(p.getProperty("url"));
	driver.get("https://automationexercise.com/login");

		
		
		
	}
	
	
	  @AfterMethod
	    public void tearDown() {
        if(driver!=null) {
	        driver.quit();
	    }
	  }
	/*  public String capturescreen(WebDriver driver ,String tname) {
		  if (driver == null) {
		        throw new IllegalArgumentException("WebDriver is null. Cannot take screenshot.");
		    }
		  String timestamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		  TakesScreenshot takesscreenshot = (TakesScreenshot)driver;
		  File sourcefile = takesscreenshot.getScreenshotAs(OutputType.FILE);
		   String targetfilepath=System.getProperty("user.dir")+"\\screenshots\\" +tname + "_" +timestamp + ".png";
		  File targetfile = new File(targetfilepath);
		  return targetfilepath;
	  } */
	  public String capturescreen(WebDriver driver, String tname) throws IOException {

		 

		    String timestamp =
		            new SimpleDateFormat("yyyyMMdd_HHmmss")
		            .format(new Date());

		    TakesScreenshot ts = (TakesScreenshot) driver;

		    File sourcefile =
		            ts.getScreenshotAs(OutputType.FILE);

		    String targetfilepath =
		            System.getProperty("user.dir")
		            + "\\screenshots\\"
		            + tname + "_" + timestamp + ".png";

		    File targetfile = new File(targetfilepath);

		    FileHandler.copy(sourcefile, targetfile);

		    return targetfilepath;
		}


	  public WebDriver getDriver() {
		// TODO Auto-generated method stub
		return null;
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
