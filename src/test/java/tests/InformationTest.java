package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import pages.InformationPage;
import utility.ExtentFactory;

public class InformationTest extends BaseDriver{
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	   @BeforeClass
	   public void openUrl() { 
		   report = ExtentFactory.getInstance();
		   parentTest = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>INFORMATION PAGE TEST</b></p>").assignAuthor("QA TEAM").assignDevice("window");
		   
	   }
	
	@Test(priority = 6)
	public void InformationPage() throws InterruptedException, IOException {
		childTest = parentTest.createNode("<p style = \"color:#3E96E7; font-size:20px\">INFORMATION PAGE TEST</p>");
		InformationPage op = new InformationPage(childTest);
		op.info();
	}
	
    @AfterClass
    public void afterClass() {
        report.flush();
    }

}
