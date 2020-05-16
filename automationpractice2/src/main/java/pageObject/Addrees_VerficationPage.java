package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Addrees_VerficationPage
{

	WebDriver driver;
	
	
	public Addrees_VerficationPage(WebDriver driver) 
	{
		this.driver=driver;
		
		
	}
	
	
	By ProceedtocheckoutButton=By.cssSelector("button[class='button btn btn-default button-medium']");
	
	
	
	public WebElement getProceedtocheckoutButton(){
	return driver.findElement(ProceedtocheckoutButton);	
		
	}

	
	
}
