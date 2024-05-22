package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import pages.OrderPage;
import utility.ExtentFactory;

public class OrderTest extends BaseDriver{
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	   @BeforeClass
	   public void openUrl() { 
		   report = ExtentFactory.getInstance();
		   parentTest = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>ORDER PAGE TEST</b></p>").assignAuthor("QA TEAM").assignDevice("window");
		   
	   }
	
	
	@Test(priority = 5)
	public void OrderPage() throws IOException {
		childTest = parentTest.createNode("<p style = \"color:#3E96E7; font-size:20px\">ORDER PAGE TEST</p>");
		pages.OrderPage op = new OrderPage(childTest);
		op.order();
	}
	
    @AfterClass
    public void afterClass() {
        report.flush();
    }

}
