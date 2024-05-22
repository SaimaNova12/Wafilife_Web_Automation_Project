package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import pages.SelectPage;
import utility.ExtentFactory;

public class SelectTest extends BaseDriver{
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	   @BeforeClass
	   public void openUrl() { 
		   report = ExtentFactory.getInstance();
		   parentTest = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>SELECT PAGE TEST</b></p>").assignAuthor("QA TEAM").assignDevice("window");
		   
	   }
	
	
	@Test(priority = 3)
	public void SelectPage() throws InterruptedException, IOException {
		childTest = parentTest.createNode("<p style = \"color:#3E96E7; font-size:20px\">SELECT PAGE TEST</p>");
		SelectPage select2 = new SelectPage(childTest);
		select2.select();		
	}
	
    @AfterClass
    public void afterClass() {
        report.flush();
    }

}
