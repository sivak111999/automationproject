package utilitties;

import java.awt.Desktop;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v138.page.model.Screenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import basepage.baseclass;

public class TestListener implements ITestListener {
//WebDriver driver;
public ExtentSparkReporter sparkreporter;
public ExtentReports extent;
public ExtentTest test;

String repname;
    
    public void onStart(ITestContext testcontext) {
    	String timestamp= new SimpleDateFormat("yyyy.MM.dd.hh.ss").format(new Date());
    	
    	repname = "Test-report-" + timestamp + ".html";
    	sparkreporter= new ExtentSparkReporter(".\\reports\\"+ repname);
    	sparkreporter.config().setDocumentTitle("automation test report");
    	sparkreporter.config().setReportName("automationexercise functiona testing");
    	sparkreporter.config().setTheme(Theme.DARK);
    	
    	extent = new ExtentReports();
    	extent.attachReporter(sparkreporter);
    	
    	
    	String os= testcontext.getCurrentXmlTest().getParameter("os");
    	extent.setSystemInfo("operating system", os);
    	String browser= testcontext.getCurrentXmlTest().getParameter("os");
    	extent.setSystemInfo("operating system", browser);
    	
    	List<String> includedgroups = testcontext.getCurrentXmlTest().getIncludedGroups();
    	if(!includedgroups.isEmpty()) {
    		extent.setSystemInfo("groups", includedgroups.toString());
    	}
    	
        System.out.println("Execution Started");
    }

    
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
    	test = extent.createTest(result.getTestClass().getName());
    	test.assignCategory(result.getMethod().getGroups());
    	test.log(Status.PASS,result.getName()+"got successfully executed");
        System.out.println("Test Passed: " + result.getName());
    }

   

    
    public void onTestSkipped(ITestResult result) {
    	test = extent.createTest(result.getTestClass().getName());
    	test.assignCategory(result.getMethod().getGroups());
    	test.log(Status.SKIP,result.getName()+ "got skipped");
    	test.log(Status.INFO, result.getThrowable().getMessage());
}
       
   
    public void onFinish(ITestContext testcontext) {
    	extent.flush();
    	String pathofextentreport = System.getProperty("user.dir")+"\\reports\\"+repname;
    	File extentreport = new File(pathofextentreport);
    	try {
    		Desktop.getDesktop().browse(extentreport.toURI());
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
      
    }
   
   /* @Override
    public void onTestFailure(ITestResult result) {
    	test = extent.createTest(result.getTestClass().getName());
    	test.assignCategory(result.getMethod().getGroups());
    	test.log(Status.FAIL,result.getName() +"got failed");
    	test.log(Status.INFO, result.getThrowable().getMessage());
    //	WebDriver driver = null;
		String imgpath = new baseclass().capturescreen(driver,result.getName());
		test.addScreenCaptureFromPath(imgpath);

    }*/
    
    public void onTestFailure(ITestResult result) {

        test = extent.createTest(result.getTestClass().getName());

        test.assignCategory(result.getMethod().getGroups());

        test.log(Status.FAIL,
                result.getName() + "  got failed");

        test.log(Status.INFO,
                result.getThrowable().getMessage());

        baseclass base = (baseclass) result.getInstance();

        WebDriver driver = base.getDriver();

        String imgpath = null;
		try {
			imgpath = base.capturescreen(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        try {
            test.addScreenCaptureFromPath(imgpath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    