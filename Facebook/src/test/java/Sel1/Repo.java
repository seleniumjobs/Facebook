package Sel1;
import java.time.Duration;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
	 public class Repo
	 {
	static String ExpectedTitleebay="Electronics, Cars, Fashion, Collectibles & More | eBay";
	 static WebDriver driver; 
	 static  ExtentReports  report;
	 static ExtentTest test1;
	 //public static ExtentReports extent=new ExtentReports();
	
		 
	 
	//ExtentSparkReporter  spark=new ExtentSparkReporter("C:/Users/jj/eclipse-workspace/Facebook/ExtentReport/extent.html");
 //ExtentReports extent=new ExtentReports("C:\\Users\\jj\\eclipse-workspace\\Facebook\\ExtentReport\\extent.html",true);
	// extent.attachReporter(spark);
	// ExtentTest test1=extent.createTest("ebay search test","test to validate search box");
	 
		//ExtentReports extent=new ExtentReports();
	 +
	//extent.attachReporter(spark);
	 @BeforeTest
	 public void reports() throws InterruptedException {
		 
	 //WebDriverManager.edgedriver().setup();
	 //driver=new EdgeDriver();
		//ExtentSparkReporter  spark=new ExtentSparkReporter("C:/Users/jj/eclipse-workspace/Facebook/ExtentReport/extent.html");
		//ExtentReports extent=new ExtentReports();
		//extent.attachReporter(spark);
		//ExtentTest test1=extent.createTest("ebay search test","test to validate search box");
		WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
		report=new  ExtentReports ("C:\\Users\\jj\\eclipse-workspace\\Facebook\\extent reports\\extent.html", true);
		  test1=report.startTest("ebay search test,test to validate search box");
		test1.log(LogStatus.INFO,"starting test case");
		driver.manage().window().maximize();
		//test1.pass("maximize has done");
	 }
		@Test
		public void validateTitle()
		{
		driver.get("https://www.ebay.com");
		//Thread.sleep(1000);
		//test1.pass("Navigate to Ebay.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
	Assert.assertEquals(actualTitle,ExpectedTitleebay);
	//test1.pass("title is correct");
	driver.findElement(By.xpath("//input[@id=\"gh-ac\"]")).sendKeys("Mobile");
	//test1.pass("entered the text in the text box");
	driver.findElement(By.xpath("//input[@id=\"gh-btn\"]")).sendKeys(Keys.RETURN);
			//test1.pass("press keyboard enter key");
			//test1.pass("closed the browser");
			//test1.info("test.completed");
			//ExtentReports extent = null;
			//extent.flush();
	 
		}
			
			@AfterTest
			public void teardown() {
			
			//driver.close();
			//test1.pass("closed the browser");
			//test1.info("test.completed");
			report.flush();
			}
	 }		
	

	 
