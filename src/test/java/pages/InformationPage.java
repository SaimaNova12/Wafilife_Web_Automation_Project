package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import utility.CommonMethods;
import utility.GetScreenShot;

public class InformationPage extends CommonMethods{
	
	ExtentTest test;
	public InformationPage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	    this.test = test;
	}
	
	@FindBy(xpath = "//input[@id='billing_first_name']")
	WebElement name;
	
	@FindBy(xpath = "//input[@id='billing_phone']")
	WebElement phone;
	
	@FindBy(xpath = "//input[@id='billing_alternative_phone']")
	WebElement alt;
	
	@FindBy(xpath = "//input[@id='billing_email']")
	WebElement email;
     
	@FindBy(xpath = "//select[@id='billing_state']")
	WebElement drop;

    public void selectByVisibleText(String text) {
        Select dropdown = new Select(drop);
        dropdown.selectByVisibleText(text);
    }

	@FindBy(xpath = "//select[@id='billing_area']")
	WebElement drop2;
	
	public void dropselect(String text2) {
		Select dropdown2 = new Select(drop2);
		dropdown2.selectByVisibleText(text2);
	}
	
	@FindBy(css = "#billing_address_1")
	WebElement thikana;
	
	@FindBy(xpath = "//textarea[@id='order_comments']")
	WebElement onnano;
	
	
	public void info() throws InterruptedException, IOException {
		try {
			if(name.isDisplayed()) {
				name.clear();
				name.sendKeys("Saima");
				timeout();
	  			  test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Name Input Section is Working Successfully</b></p>");
	    		  String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Name Input Section is Working Successfully");
	    		  String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Name Input Section is Working Successfully.png";
	    		  test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		}
		catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Name Input Section is not Working Successfully</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Name Input Section is not Working Successfully");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Name Input Section is not Working Successfully.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(name.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
		}
		
		try {
			if(phone.isDisplayed()) {
				phone.clear();
				phone.sendKeys("01644417057");
				timeout();
	  			  test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Phone Number Input Section is Working Successfully</b></p>");
	    		  String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Phone Number Input Section is Working Successfully");
	    		  String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Phone Number Input Section is Working Successfully.png";
	    		  test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		}
		catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Phone Number Input Section is not Working Successfully</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Phone Number Input Section is not Working Successfully");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Phone Number Input Section is not Working Successfully.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(phone.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
		}
		
		try {
			if(alt.isDisplayed()) {
				alt.sendKeys("01644419098");
				timeout();
	  			  test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Alternative Phone Number Input Section is Working Successfully</b></p>");
	    		  String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Alternative Phone Number Input Section is Working Successfully");
	    		  String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Alternative Phone Number Input Section is Working Successfully.png";
	    		  test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		}
		catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Alternative Phone Number Input Section is not Working</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Alternative Phone Number Input Section is not Working");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Alternative Phone Number Input Section is not Working.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(alt.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
		}
		try {
			if(email.isDisplayed()) {
				email.clear();
				email.sendKeys("saimabintayounus1999@gmail.com");
				timeout();
	  			  test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Email Input Section is Working Successfully</b></p>");
	    		  String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Email Input Section is Working Successfully");
	    		  String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Email Input Section is Working Successfully.png";
	    		  test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		}
		catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Email Input Section is not Working</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Email Input Section is not Working");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Email Input Section is not Working.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(email.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
		}
		
       try {    
            timeout();
            selectByVisibleText("Bagerhat");
            timeout();
			  test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>District Input Section is Working Successfully</b></p>");
    		  String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "District Input Section is Working Successfully");
    		  String dest = System.getProperty("user.dir")+"\\screenshots\\" + "District Input Section is Working Successfully.png";
    		  test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());

        }
        catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>District Input Section is not Working</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "District Input Section is not Working");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "District Input Section is not Working.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(drop.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
        }
       try {
   	    
           timeout();
           dropselect("বাগেরহাট সদর");
           timeout();
			  test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>State Input Section is Working Successfully</b></p>");
    		  String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "State Input Section is Working Successfully");
    		  String dest = System.getProperty("user.dir")+"\\screenshots\\" + "State Input Section is Working Successfully.png";
    		  test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());

       }
       catch(Exception e) {
    		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>State Input Section is not Working</b></p>");
    		Throwable t = new InterruptedException("Exception");
    		test.fail(t);
    		
    		@SuppressWarnings("unused")
    		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "State Input Section is not Working");
    		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "State Input Section is not Working.png";
    		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
    		Assert.assertTrue(drop2.isDisplayed());
    		PageDriver.getCurrentDriver().quit();
       }
       
		try {
			if(thikana.isDisplayed()) {
				thikana.clear();
				thikana.sendKeys("53/A, Bagerhat Sadar, Bagerhat, Khulna");
				timeout();
	  			  test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Details Input Section is Working Successfully</b></p>");
	    		  String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Details Input Section is Working Successfully");
	    		  String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Details Input Section is Working Successfully.png";
	    		  test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		}
		catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Details Input Section is not Working</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Details Input Section is not Working");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Details Input Section is not Working.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(thikana.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
		}
		
		try {
			if(onnano.isDisplayed()) {
				onnano.clear();
				onnano.sendKeys("N/A");
				timeout();
	  			  test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Other Input Section is Working Successfully</b></p>");
	    		  String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Other Input Section is Working Successfully");
	    		  String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Other Input Section is Working Successfully.png";
	    		  test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		}
		catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Other Input Section is not Working</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Other Input Section is not Working");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Other Input Section is not Working.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(onnano.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
		}
       
		
	}
}
