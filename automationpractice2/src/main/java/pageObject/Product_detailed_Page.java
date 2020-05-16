package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Product_detailed_Page 
{
 WebDriver driver1;
 

 public 	Product_detailed_Page(WebDriver driver1) {

	 this.driver1=driver1;
	
	
	
}
	
	By add_to_cart= By.cssSelector("button[class='exclusive']");
	
	By Proceed_to_checkOut_button=By.cssSelector("div[id='layer_cart'] div[class='layer_cart_cart col-xs-12 col-md-6'] a[class='btn btn-default button button-medium']");
	
	public WebElement click_add_to_cart() {
		
		
	return	driver1.findElement(add_to_cart);
			//driver1.findElement(add_to_cart);
	}
	

	public WebElement click_Proceed_to_checkOut_button() {
		
		
	return	driver1.findElement(Proceed_to_checkOut_button);
	}
	
	
	//div[@id='layer_cart'] /div[1]/div[2]/div[4]/a
	
	
	
	
}
