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

public class OrderPage extends CommonMethods{
	
	ExtentTest test;
	public OrderPage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
	    this.test = test;
	}
	
	@FindBy(xpath = "//span[contains(text(),'অর্ডার সম্পন্ন করুন')]")
	WebElement order;
	
	
	public void order() throws IOException {
		try {
			if(order.isDisplayed()) {
				order.click();
				timeout();
	  			  test.pass("<p style=\"color:#85BC63; font-size: 13px\"><b>Order Page Section is Working Successfully</b></p>");
	    		  String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Order Page Section is Working Successfully");
	    		  String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Order Page Section is Working Successfully.png";
	    		  test.pass(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			}
		}
		catch(Exception e) {
     		test.fail("<p style=\"color:#FF5353; font-size: 13px\"><b>Order Page Section is not Working Successfully</b></p>");
     		Throwable t = new InterruptedException("Exception");
     		test.fail(t);
     		
     		@SuppressWarnings("unused")
     		String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Order Page Section is not Working Successfully");
     		String dest = System.getProperty("user.dir")+"\\screenshots\\" + "Order Page Section is not Working Successfully.png";
     		test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
     		Assert.assertTrue(order.isDisplayed());
     		PageDriver.getCurrentDriver().quit();
		}
	}

}
