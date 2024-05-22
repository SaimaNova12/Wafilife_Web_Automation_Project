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

public class AuthorPage extends CommonMethods{
	
	ExtentTest test;
	public AuthorPage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	    this.test = test;
	}
	
	@FindBy(xpath = "//h3[normalize-space()='Md. Iqbal Faruk']")
	WebElement select1;
	
	@FindBy(xpath = "//div[@class='product_thumbnail_wrapper']//a")
	WebElement select2;
	
	@FindBy(xpath = "//div[contains(text(),'পৃষ্ঠা : 358, কভার : পেপার ব্যাক, সংস্করণ : Reprin')]")
	WebElement text;
	
	@FindBy(xpath = "//div[@class='body-wrapper']//button[2]")
	WebElement click;
	
	
	public void author() throws IOException {
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
		
		try {
			if(select2.isDisplayed()) {
				select2.click();
				timeout();
	  			  test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Select Writer Section 2 is Working Successfully</b></p>");
	    		  String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Select Writer Section 2 is Working Successfully");
	    		  String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Select Writer Section 2 is Working Successfully.png";
	    		  test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		}
		catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Select Writer Section 2 is not Working Successfully</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Select Writer Section 2 is not Working Successfully");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Select Writer Section 2 is not Working Successfully.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(select2.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
		}
		
		try {
			if(text.isDisplayed()) {
				System.out.println(text.getText());
				timeout();
	  			  test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Select Writer Section 3 is Working Successfully</b></p>");
	    		  String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Select Writer Section 3 is Working Successfully");
	    		  String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Select Writer Section 3 is Working Successfully.png";
	    		  test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());	
			}
		}
		catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Select Writer Section 3 is not Working Successfully</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Select Writer Section 3 is not Working Successfully");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Select Writer Section 3 is not Working Successfully.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(text.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
		}
		
		try {
			if(click.isDisplayed()) {
				click.click();
				timeout();
	  			  test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Select Writer Section 4 is Working Successfully</b></p>");
	    		  String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Select Writer Section 4 is Working Successfully");
	    		  String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Select Writer Section 4 is Working Successfully.png";
	    		  test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		}
		catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Select Writer Section 4 is not Working Successfully</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Select Writer Section 4 is not Working Successfully");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Select Writer Section 4 is not Working Successfully.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(click.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
		}
	}

}
