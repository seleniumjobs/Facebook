package Sel2;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack    .extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Sel1.Page1;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Pom3 {
	// WebDriver driver;
	Page1 p;
	static WebDriver driver=null; 
	 static  ExtentReports  report;
	 static ExtentTest test1;
	@BeforeTest
	public void setdriver() {
//WebDriverManager.edgedriver().setup();
//WebDriver driver=new EdgeDriver();
ExtentSparkReporter  spark=new ExtentSparkReporter("pomextent.html");
 ExtentReports extent=new ExtentReports();
	 extent.attachReporter(spark);
	ExtentTest test1=extent.createTest("google search test","test to validate search box");
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	test1.log(Status.INFO,"starting test case");
driver.get("https://www.google.com");
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
p=new Page1(driver);
test1.pass("Entered text in Searchbox");
extent.flush();
	}
	@Test(priority=1)
	public void enterDetails()
	{
		// test1.pass("Entered text in Searchbox");
		//driver.get("https://www.google.com");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// p=new Page1(driver);
		p.enterSearch("Automation");
		
		p.clickEnter("Keys.RETURN");
		
	}
	//@AfterTest
	//public void clo()
	//{

	//driver.quit();

//}
}
