package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import utility.CommonMethods;
import utility.GetScreenShot;

public class Logout extends CommonMethods{
	
	ExtentTest test;
	public Logout(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	    this.test = test;
	}
	
	@FindBy(xpath = "//div[@class='login-links']//a[@title='আমার অ্যাকাউন্ট'][contains(text(),'আমার অ্যাকাউন্ট')]")
	WebElement account;
	
	@FindBy(xpath = "//a[contains(text(),'লগআউট')]")
    WebElement logout;
	
	
	public void logout() throws IOException {
		try {
			if(account.isDisplayed()) {
				account.click();
				timeout();
	  			  test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Account Section is Working Successfully</b></p>");
	    		  String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Account Section is Working Successfully");
	    		  String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Account Section is Working Successfully.png";
	    		  test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		}
		catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Account Section is not Working</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Account Section is not Working");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Account Section is not Working.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(account.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
		}
		
		try {
			if(logout.isDisplayed()) {
				logout.click();
				timeout(2000);
	  			  test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Logout Successful</b></p>");
	    		  String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Logout Successful");
	    		  String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Logout Successful.png";
	    		  test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		}
		catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Logout is not Working</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Logout is not Working");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Logout is not Working.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(logout.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
		}
	}

}
