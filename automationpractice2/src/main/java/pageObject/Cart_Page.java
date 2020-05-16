package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cart_Page
{

	WebDriver driver;
public Cart_Page(WebDriver driver) {
	
	
	this.driver=driver;
	
}
	

By Proceedtocheckout=By.cssSelector("a[class='button btn btn-default standard-checkout button-medium']");
//Proceed_to_checkOut= 
	
	

	public WebElement Click_Proceed_to_checkout() 
	{
		
		return driver.findElement(Proceedtocheckout);
	}	
	
	
}
