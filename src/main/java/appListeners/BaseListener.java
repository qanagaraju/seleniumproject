package appListeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class BaseListener extends TestListenerAdapter {
	
	
	static WebDriver driver;
	
	
	
	public void onTestStart(ITestResult itr) {
		log("Test Started......");
		log("Test starting"+itr.getName());
	}
	
	
	public void onTestSuccess(ITestResult itr) {
		log("Test" +itr.getName() + "Passed");
		
		log("Prority of the method is " + itr.getMethod().getPriority());
	}
	
	
	public void onTestFailure(ITestResult itr) {
		log("Test" +itr.getName() +" Failed");
		log("Priority of the method is " + itr.getMethod().getPriority());
		log(itr.getName());
		
		
		
		//BrowserDriver.takeScreenShot();
	}
	
	
	
	
	public void onTestSkipped(ITestResult itr) {
		log("Test" +itr.getName() + "Skipped");
	}
	
	
	public void onFinish(ITestContext context) {
		System.out.println("This is onFinish method" +context.getPassedTests());
		System.out.println("This is onFinish method" +context.getFailedTests());
		}
	
	
	private void log(String methodName) {
		System.out.println(methodName);
	}
	
	

}
