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

public class LoginPage extends CommonMethods{
	
	ExtentTest test;
	public LoginPage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	    this.test = test;
	}
	
	@FindBy(xpath = "//a[@title='আমার অ্যাকাউন্ট']")
	WebElement log1;
	
	@FindBy(xpath = "//input[@id='username']")
	WebElement send1;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement send2;
	
	@FindBy(xpath = "//input[@name='login']")
	WebElement login;
	
	@FindBy(xpath = "//body/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[1]/a[1]")
	WebElement home;
	
	public void login() throws IOException {
		
		try {
			if(log1.isDisplayed()) {}
			  log1.click();
			  timeout();
  			  test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Account Section is Working Successfully</b></p>");
    		  String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Account Section is Working Successfully");
    		  String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Account Section is Working Successfully.png";
    		  test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		}
		catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Account Section is not Working Successfully</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Account Section is not Working Successfully");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Account Section is not Working Successfully.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(log1.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
		}
		
		try {
			if(send1.isDisplayed()) {}
			  send1.sendKeys("saimabintayounus1999@gmail.com");
			  timeout();
  			  test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Sending Name in Login Section is Working Successful</b></p>");
    		  String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Sending Name in Login Section is Working Successful");
    		  String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Sending Name in Login Section is Working Successful.png";
    		  test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		}
		catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Sending Name in Login Section is not Working Successful</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Sending Name in Login Section is not Working Successful");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Sending Name in Login Section is not Working Successful.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(send1.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
		}
		
		try {
			if(send2.isDisplayed()) {}
			  send2.sendKeys("wafi11");
			  timeout();
  			  test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Sending password in Login Section is Working Successful</b></p>");
    		  String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Sending password in Login Section is Working Successful");
    		  String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Sending password in Login Section is Working Successful.png";
    		  test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		}
		catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Sending password in Login Section is not Working Successful</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Sending password in Login Section is not Working Successful");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Sending password in Login Section is not Working Successful.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(send2.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
		}
		
		try {
			if(login.isDisplayed()) {}
			  login.click();
			  timeout();
  			  test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Login Section is Working Successfully</b></p>");
    		  String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Login Section is Working Successfully");
    		  String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Login Section is Working Successfully.png";
    		  test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		}
		catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Login Section is not Working Successfully</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Login Section is not Working Successfully");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Login Section is not Working Successfully.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(login.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
		}
		
		try {
			if(home.isDisplayed()) {}
			  home.click();
			  timeout(2000);
  			  test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Back to Home is Working Successfully</b></p>");
    		  String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Back to Home is Working Successfully");
    		  String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Back to Home is Working Successfully.png";
    		  test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
		}
		catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Back to Home is not Working Successfully</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Back to Home is not Working Successfully");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Back to Home is not Working Successfully.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(home.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
		}
	}
	

}
