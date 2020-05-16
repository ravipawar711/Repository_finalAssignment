package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ORDER_SUMMARY_Page {

	
	
	
	
	
	
	
	
	
	
	
	WebDriver driver;

	public ORDER_SUMMARY_Page(WebDriver driver) {
		
		this.driver=driver;
	}
		


	By ORDER_SUMMARY=By.cssSelector("div[class='box cheque-box']");

	By confirm_my_order=By.cssSelector("button[class='button btn btn-default button-medium']");
		
		
	public WebElement Through_ORDER_SUMMARY() 
	{

		return driver.findElement(ORDER_SUMMARY);
		
	}
	public WebElement I_confirm_my_order() 
	{

		return driver.findElement(confirm_my_order);
		
	}
			
	
	
	
}
