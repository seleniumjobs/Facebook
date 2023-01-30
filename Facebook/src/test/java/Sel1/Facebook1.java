package Sel1;
import java.io.File;



import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Facebook1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
   WebDriverManager.edgedriver().setup();
    	
	WebDriver driver=new EdgeDriver();
driver.get("https://www.facebook.com/");
WebElement ele=driver.findElement(By.linkText("Create New Account"));
		ele.click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebElement fname=driver.findElement(By.name("firstname"));
				 fname.sendKeys("hai");
				 driver.manage().window().maximize();
				// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
WebElement surname=driver.findElement(By.name("lastname"));
surname.sendKeys("h");
driver.findElement(By.name("reg_email__")).sendKeys("hello");
driver.findElement(By.id("password_step_input")).sendKeys("welcom");
Select day=new Select(driver.findElement(By.id("day")));
day.selectByIndex(29);
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));							
Select mon=new Select(driver.findElement(By.id("month")));
mon.selectByVisibleText("Apr");
WebElement ele1=driver.findElement(By.id("year"));
Select year=new Select(ele1);
year.selectByIndex(5);
driver.findElement(By.xpath("//label[text()='Female']")).click();
driver.findElement(By.xpath("//label[text()='Male']")).click();
driver.findElement(By.xpath("//label[text()='Female']")).click();
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//webElement ele3=new WebDriverWait(driver,Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Sign Up']")).click();
	

Thread.sleep(1000);
driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(f,new File( "C:/Users/jj/Desktop/screenshot/screen.png"));
System.out.println("screenshot captured");
	}

}
