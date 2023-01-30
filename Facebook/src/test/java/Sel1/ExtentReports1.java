package Sel1;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReports1 {
public static void main(String[] args) {
	

	ExtentSparkReporter htmlReporter=new ExtentSparkReporter("extentreports.html");
	ExtentReports extent=new ExtentReports();
	extent.attachReporter(htmlReporter);
	ExtentTest test1=extent.createTest("my first test","sample test");
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	test1.log(Status.INFO,"starting test case");
	driver.get("https://www.google.com");
	test1.pass("Entered text in Searchbox");
	driver.findElement(By.name("q")).sendKeys("Automation");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	test1.pass("pressed enter");
	//driver.quit();
	
	extent.flush();
}
}