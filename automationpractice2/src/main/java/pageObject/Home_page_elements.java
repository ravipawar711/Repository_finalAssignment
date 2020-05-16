package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Home_page_elements

{
	
	WebDriver driver;
	
	public Home_page_elements(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	By DRESS=By.xpath("//div/ul/li[2]");
	
	By html_content= By.cssSelector("[id='htmlcontent_home'] li:nth-child(3)") ;
	
	By header_logo =By.id("id=\"header_logo\"");
	
	By Submit_Search=By.xpath("//button[@name='submit_search']");
	
	By searchBar=By.xpath("//input[@id='search_query_top']");
	
	By summerDressesnavBar=By.xpath("//div/ul/li[2]/ul/li[3]");
	
	//form[@id='searchbox']
	//div/ul/li[2]/ul/li[3]
	By contactus= By.cssSelector("[id='contact-link']");
	
	public WebElement DRESSNAV() 
	{
		
		return 	driver.findElement(DRESS);
		
	}
	public WebElement contactusmethod() 
	{
		
		return 	driver.findElement(contactus);
		
	}
	
	
	public WebElement getsummerDressesnavBar() 
	{
		
		return 	driver.findElement(summerDressesnavBar);
		
	}
	
	
	
	
	public WebElement searchButton() 
	{
		
		return 	driver.findElement(Submit_Search);
		
	}
	
	
	
	
	
	public WebElement searchBar() 
	{
		
		return 	driver.findElement(searchBar);
		
	
	}
	
	/*
		
	}
	*/
	//sort pages elements
	//div[@id='center_column'] //ul/li[1]/div/div[2]/span
	//div[@id='center_column'] //ul/li[1]/div/div[1]



}
