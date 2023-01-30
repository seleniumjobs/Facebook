package Sel1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.edgedriver().setup();	
WebDriver driver=new EdgeDriver();
driver.get("http://google.com/");
driver.get("http://gmail.com/");
//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//wait.until(ExpectedConditions.visibilityOfElementLocated
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.id("//div[text()='Phone number or email']")).sendKeys("hai123@gmail.com");
driver.findElement(By.xpath("//span[text()='Next']")).click();

}
}
