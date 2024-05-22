package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.HomePage;
import utility.ExtentFactory;

public class HomeTest extends BaseDriver{
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
     
	@BeforeClass
	public void Openurl() {
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:#FF6000; font-size:20px\"><b>HOME PAGE TEST</b></p>");
		PageDriver.getCurrentDriver().manage().window().maximize();
		PageDriver.getCurrentDriver().get(url);
	}
	
	@Test(priority=1)
	public void HomePage() throws IOException {
		childTest = parentTest.createNode("<p style = \"color:#3E96E7; font-size:20px\">HOME PAGE TEST</p>");
		HomePage ho = new HomePage(childTest);
		ho.home();
	}
	
    @AfterClass
    public void afterClass() {
        report.flush();
    }
	
}
