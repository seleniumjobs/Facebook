package Sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
public static void main(String[] args)
{
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.get("https://the-internet.herokuapp.com/frames");
	driver.findElement(By.linkText("Nested Frames")).click();
driver.switchTo().frame("frame-bottom");	
WebElement l=driver.findElement(By.cssSelector("body"));
System.out.println("bottom frame text:"+l.getText());
//switch to  main page
driver.switchTo().defaultContent();
driver.quit();
}
}
