package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AUTHENTICATION_page 

{
	WebDriver driver;
	public AUTHENTICATION_page(WebDriver driver) {
		
		this.driver=driver;
	} 
	
	
	

	public String UN="automationpracticerushi@dispostable.com";
	public String PW="test123";
	By UserName=By.cssSelector("div[class='col-xs-12 col-sm-6'] input[id='email']");
	By PassWord=By.cssSelector("div[class='col-xs-12 col-sm-6'] input[id='passwd']");
	
	By Submit_button=By.cssSelector("button[id='SubmitLogin']");
	
	
	
	public WebElement Insert_UserName() {
		
		
		return driver.findElement(UserName);
	}
	
public WebElement Insert_PassWord() {
	return driver.findElement(PassWord);
	}
	
	

public WebElement Submit_button() {
	return driver.findElement(Submit_button);
	}
	
	
	
	
	
	
	
	
}
