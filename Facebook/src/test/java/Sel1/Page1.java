package Sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Page1 {

	//public Pom1(WebDriver driver) {
	//	this.driver = driver;
	//ODO Auto-generated constructor stub
	//}


		// TODO Auto-generated method stub
//WebDriverManager.edgedriver().setup();
	 WebDriver driver;
	public Page1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}

@FindBy(name=("q"))
WebElement name;

@FindBy(name=("btnK"))
WebElement enter;

//public Pom1(WebDriver driver) {
	//this.driver = driver;
//}
public void enterSearch(String str) 
{
	name.sendKeys(str);
}
public void clickEnter(String str)
{
	enter.sendKeys(Keys.RETURN);
}
	}


