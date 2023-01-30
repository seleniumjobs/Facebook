package Sel1;
	import io.github.bonigarcia.wdm.WebDriverManager;


import java.time.Duration;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	import org.testng.annotations.AfterTest;

	
	public class Test1{

		 WebDriver driver;

		@BeforeTest
		 void setFirst()
		{
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();

	
	}
	@Test
	 void setSe()
	{
		driver.get("http://google.com/");
		driver.get("http://gmail.com/");
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("//div[text()='Phone number or email']")).sendKeys("hai123@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}
	@AfterTest
	 void tearDown()
	{
		driver.quit();
	}
	}


