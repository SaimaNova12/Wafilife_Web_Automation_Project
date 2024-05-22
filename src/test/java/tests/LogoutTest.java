package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import pages.Logout;
import utility.ExtentFactory;

public class LogoutTest extends BaseDriver{
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	   @BeforeClass
	   public void openUrl() { 
		   report = ExtentFactory.getInstance();
		   parentTest = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>LOGOUT TEST</b></p>").assignAuthor("QA TEAM").assignDevice("window");
		   
	   }
	
	@Test(priority = 7)
	public void Logout() throws IOException {
		childTest = parentTest.createNode("<p style = \"color:#3E96E7; font-size:20px\">LOGOUT TEST</p>");
		Logout log = new Logout(childTest);
		log.logout();
	}
	
    @AfterClass
    public void afterClass() {
        report.flush();
    }
	

}
