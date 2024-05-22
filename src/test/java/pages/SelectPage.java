package pages;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import utility.CommonMethods;
import utility.GetScreenShot;

public class SelectPage extends CommonMethods{
	
	ExtentTest test;
	public SelectPage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	    this.test = test;
	}
	
	@FindBy(xpath = "//span[contains(text(),'লেখক')]")
	WebElement select1;
	
	@FindBy(xpath = "//a[@class='page-numbers'][normalize-space()='2']")
	WebElement next1;
	
	
	public void select() throws InterruptedException, IOException {
		
		
		try {
			if(select1.isDisplayed()) {
				select1.click();
				timeout();
	  			 test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Select Writer Section is Working Successfully</b></p>");
	    		 String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Select Writer Section is Working Successfully");
	    		 String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Select Writer Section is Working Successfully.png";
	    		 test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		}
		catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Select Writer Section is not Working Successfully</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Select Writer Section is not Working Successfully");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Select Writer Section is not Working Successfully.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(select1.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
		}
		
		JavascriptExecutor js = (JavascriptExecutor) PageDriver.getCurrentDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        timeout();
        
		try {
			if(next1.isDisplayed()) {
				next1.click();
				timeout();
	  			 test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Traveling to next Page is Working Successfully</b></p>");
	    		 String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Traveling to next Page is Working Successfully");
	    		 String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Traveling to next Page is Working Successfully.png";
	    		 test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		}
		catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Traveling to next Page is not Working Successfully</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Traveling to next Page is not Working Successfully");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Traveling to next Page is not Working Successfully.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(next1.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
		}
		
	}

}
