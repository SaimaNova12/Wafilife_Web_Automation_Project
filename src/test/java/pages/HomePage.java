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

public class HomePage extends CommonMethods{
    
	ExtentTest test;
	public HomePage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	    this.test = test;
	}
	
	@FindBy(xpath = "//span[contains(text(),'বই')]")
	WebElement boi;
	
	@FindBy(xpath = "//span[contains(text(),'জেনারেল বই')]")
	WebElement genboi;
	
	@FindBy(xpath = "//span[contains(text(),'আরবি বই')]")
	WebElement arboi;
	
	
	public void home() throws IOException {
		try {
			if(boi.isDisplayed()) {
				boi.click();
				timeout();
    			test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Book section is Working Successfully</b></p>");
        		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Book section is Working Successfully");
        		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Book section is Working Successfully.png";
        		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		}
		catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Book section is Not Working</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Book section is Not Working");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Book section is Not Working.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(boi.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
		}
		
		try {
			if(genboi.isDisplayed()) {
				genboi.click();
				timeout();
    			test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>General Book section is Working Successfully</b></p>");
        		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "General Book section is Working Successfully");
        		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "General Book section is Working Successfully.png";
        		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		}
		catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>General Book section is Not Working</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "General Book section is Not Working");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "General Book section is Not Working.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(genboi.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
		}
		
		try {
			if(arboi.isDisplayed()) {
				arboi.click();
				timeout();
    			test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Arabic Book section is Working Successfully</b></p>");
        		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Arabic Book section is Working Successfully");
        		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Arabic Book section is Working Successfully.png";
        		test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		}
		catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Arabic Book section is Not Working</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Arabic Book section is Not Working");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Arabic Book section is Not Working.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(arboi.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
		}
		PageDriver.getCurrentDriver().navigate().back();
		PageDriver.getCurrentDriver().navigate().back();
		PageDriver.getCurrentDriver().navigate().back();
	}
}
