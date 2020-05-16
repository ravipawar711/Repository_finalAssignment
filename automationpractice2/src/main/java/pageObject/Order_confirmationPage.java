package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Order_confirmationPage 

{

	
	WebDriver driver;
	public Order_confirmationPage(WebDriver driver) {
		
		
		
		this.driver=driver;
		
	}
	
	
	By ORDER_CONFIRMATION =By.cssSelector("div[class='box']");
	
	
	By Back_to_orders=By.cssSelector("a[class='button-exclusive btn btn-default']");
	
	
	public WebElement getText_ORDER_CONFIRMATION_block(){
		
		
		return driver.findElement(ORDER_CONFIRMATION);
		
	}
	
	
public WebElement getbutton_Back_to_orders(){
		
		
		return driver.findElement(Back_to_orders);
		
	}
	
	
	
}
