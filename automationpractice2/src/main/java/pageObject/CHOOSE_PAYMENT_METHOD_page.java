package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CHOOSE_PAYMENT_METHOD_page 
{
WebDriver driver;

public CHOOSE_PAYMENT_METHOD_page(WebDriver driver) {
	
	this.driver=driver;
}
	


By Check=By.cssSelector("a[class='cheque'] span");

By Bank_Wire=By.cssSelector("a[class='bankwire'] span");
	
	
public WebElement Through_Check() 
{

	return driver.findElement(Check);
	
}
public WebElement Through_Bank_Wire() 
{

	return driver.findElement(Bank_Wire);
	
}
		
	
	
	
	
}
