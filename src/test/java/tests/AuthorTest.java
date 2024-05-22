package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import pages.AuthorPage;
import utility.ExtentFactory;

public class AuthorTest extends BaseDriver{
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	   @BeforeClass
	   public void openUrl() { 
		   report = ExtentFactory.getInstance();
		   parentTest = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>AUTHOR PAGE TEST</b></p>").assignAuthor("QA TEAM").assignDevice("window");
		   
	   }
	
	@Test(priority = 4)
	public void AuthorPage() throws IOException {
		childTest = parentTest.createNode("<p style = \"color:#3E96E7; font-size:20px\">AUTHOR PAGE TEST</p>");
		pages.AuthorPage au = new AuthorPage(childTest);
		au.author();
	}
	
    @AfterClass
    public void afterClass() {
        report.flush();
    }
	

}
