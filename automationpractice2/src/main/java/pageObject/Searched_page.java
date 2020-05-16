package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Searched_page {

	WebDriver Driver;
	public Searched_page(WebDriver Driver) 
	{
		this.Driver=Driver;
	}
	
	
	//By number_of_result=By.cssSelector("div[class='center_column col-xs-12 col-sm-9'] \\h1 span");
	
	//By serached_result=By.cssSelector("div[class='center_column col-xs-12 col-sm-9'] \\p");
	

	By number_of_result=By.cssSelector("div[class='center_column col-xs-12 col-sm-9'] span:nth-child(2)");
	
	By serached_result=By.cssSelector("div[class='center_column col-xs-12 col-sm-9'] span:nth-child(1)");
	
	By image=By.xpath("//div[@id='center_column'] /ul/li/div/div[2]/h5/a");
	//div/ul/li[3]/div[1]/div[1]/div[1]
	
	
	//By box-cart-button=

	By cartbutton=By.xpath("//*[@id=\"add_to_cart\"]/button/span");
	
	By number_of_products=By.cssSelector("[class='product-container']");
	 
	By limiting=By.cssSelector("[class='product_list grid row']");

	
	public WebElement Tocartbutton() 
	{
		return 	 Driver.findElement(cartbutton);
		
	}



	public int getlimitingDriver() 
	{
		return 	 Driver.findElement(limiting).findElements(number_of_products).size();
		
	}
	
	
	
	public List<WebElement> getclickonimageDriver() 
	{
		return 	 Driver.findElement(limiting).findElement(number_of_products).findElements(image);
		
	}
	
	

	public WebElement getProductsNumber() 
	{
	return	 Driver.findElement(number_of_products);
		
	}
	
	
	
	
	public WebElement show_number_of_results() 
	{
	return	 Driver.findElement(number_of_result);
		
	}
	
	
	public WebElement show_serached_result() 
	{
	return	 Driver.findElement(serached_result);
		
	}
	
	
	
	
	
	
	
}
