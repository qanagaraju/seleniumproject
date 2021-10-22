package com.AppUtilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CaptureScreenClass {
	
	static WebDriver driver;
	
	
	public String screenCapture(WebDriver driver,WebElement element,String screenname) throws IOException {
		
		
		///File file =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File file =element.getScreenshotAs(OutputType.FILE);
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		
		File dest = new File("./AppScreens/"+screenname+dateName+".png");
		
		String destpath = dest.getAbsolutePath();
		FileUtils.copyFile(file, dest);
		
		return destpath;
		
		
		
		
	}
	

}
