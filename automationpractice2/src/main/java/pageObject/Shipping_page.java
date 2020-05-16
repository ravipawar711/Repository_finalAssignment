package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shipping_page
{
	WebDriver driver;
	
	public Shipping_page(WebDriver driver) 
	{
		this.driver=driver;
	}

	By ProccedToCheckOutbutton= By.cssSelector("button[class='button btn btn-default standard-checkout button-medium']");
	
	By checkbox= By.cssSelector("div[class='checker']");
	
	public WebElement Click_checkbox() 
	
	{
		
return		driver.findElement(checkbox);
		
	}
public WebElement Click_ProccedToCheckOutbutton() 
	
	{
		
return		driver.findElement(ProccedToCheckOutbutton);
		
	}
	
	
	
	
	
	
	
	
	
	
}
