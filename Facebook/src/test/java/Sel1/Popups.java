package Sel1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Popups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.edgedriver().setup();
WebDriver driver=new EdgeDriver();
driver.get("http://demo.guru99.com/test/delete_customer.php");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.name("cusid")).sendKeys("53920");
driver.findElement(By.name("submit")).submit();
Thread.sleep(1000);
Alert alert=driver.switchTo().alert();
//driver.switchTo().alert().accept();
//driver.switchTo().alert().dismiss();
String msg=driver.switchTo().alert().getText();
System.out.println(msg);
alert.accept();
driver.get("http://demo.guru99.com/popup.php");
driver.findElement(By.linkText("Click Here")).click();
String MainWindow=driver.getWindowHandle();
Set<String> s1=driver.getWindowHandles();
Iterator<String> i1=s1.iterator();
while(i1.hasNext())
{
	String ChildWindow=i1.next();
	if(!MainWindow.equalsIgnoreCase(ChildWindow))
	{
		driver.switchTo().window(ChildWindow);
		driver.findElement(By.name("emailid")).sendKeys("gaurav.33n@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		driver.close();
	}
	driver.switchTo().window(MainWindow);
		
	}

driver.get("https://demoqa.com/alerts");
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='promptButton']"))).click();
//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//wait.until(ExpectedConditions.alertIsPresent());

//((JavascriptExecutor)driver).executeScript("arguments[0].click()",el);
Alert promptAlert=driver.switchTo().alert();
String alertText=promptAlert.getText();
System.out.println("alert text is:"+alertText);
promptAlert.sendKeys("Test User");
promptAlert.accept();





	}



	}


