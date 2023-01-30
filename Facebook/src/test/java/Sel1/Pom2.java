package Sel1;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Pom2 {
	public static void main(String[] args) {
	 //WebDriver driver;
	Page1 p;
WebDriverManager.edgedriver().setup();
WebDriver driver=new EdgeDriver();
driver.get("https://www.google.com");
		 p=new Page1(driver);
		p.enterSearch("Automation");
		p.clickEnter("Keys.RETURN");
}	
}	
