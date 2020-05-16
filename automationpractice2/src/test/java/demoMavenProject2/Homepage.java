package demoMavenProject2;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObject.AUTHENTICATION_page;
import pageObject.CHOOSE_PAYMENT_METHOD_page;
import pageObject.Cart_Page;
import pageObject.Home_page_elements;
import pageObject.ORDER_SUMMARY_Page;
import pageObject.Order_confirmationPage;
import pageObject.Product_detailed_Page;
import pageObject.Searched_page;
import pageObject.Shipping_page;
import resources.Base;
public class Homepage extends Base {


	
	
	@Test
	public void homepage() throws IOException, InterruptedException, NullPointerException, AWTException {

		driver = Initialise();
		// http://automationpractice.com/index.php?id_product=2&controller=product

		driver.get("http://automationpractice.com/index.php");

		//Thread.sleep(8000);
		Home_page_elements abc = new Home_page_elements(driver);
		

		abc.searchBar().sendKeys("Casual Dresses");
//Keys.chord(Keys.CONTROL,Keys.ENTER);
		//	abc.searchBar().click();
		String h=Keys.chord(Keys.CONTROL);		

		abc.searchButton().click();//.sendKeys(h);

		/*
	sp.product_image().click();

	
		Actions xyz=new Actions(driver);
		xyz.moveToElement(abc.DRESSNAV()).build().perform();
		
		abc.navBarmethod().click();
		*/
		driver.manage().window().maximize();
	
		Searched_page sp = new Searched_page(driver);

		
		System.out.println(sp.show_serached_result().getText());

		System.out.println(sp.show_number_of_results().getText());
		
int  count=		sp.getlimitingDriver();

System.out.println("Total Count is-->"+count);
Thread.sleep(5000);
for(int i=0;i<count;i++) 
{
//          sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER))
	//xyz.moveToElement(sp.getclickonimageDriver().get(i)).build().perform();

//	xyz.moveToElement(sp.getclickonimageDriver().get(i)).click().build().perform();
	sp.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
	Thread.sleep(5000);
	System.out.println("moved Count is-->"+i);

//jk.click_add_to_cart();
//sp.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.TAB));
	
}

Thread.sleep(5000);

Set <String> fff=driver.getWindowHandles();

Iterator It = fff.iterator();

driver.switchTo().window((String) It.next());

Product_detailed_Page po= new Product_detailed_Page(driver);

while(It.hasNext()) {

Thread.sleep(5000);

driver.switchTo().window((String) It.next());
	//Thread.sleep(8000);
	
	
//WebElement BB=	driver.findElement(By.cssSelector("button[class='exclusive']"));
		if(po.click_add_to_cart().isEnabled())
	{
			po.click_add_to_cart().click();
			Thread.sleep(3000);
			
			
	}
		else 
{
		
		System.out.println("no add to  cart");
	
}

	System.out.println(driver.getCurrentUrl()+"CurrentUrl");

}


	

//driver.findElement(By.cssSelector("div[id='layer_cart'] div[class='layer_cart_cart col-xs-12 col-md-6'] a[class='btn btn-default button button-medium']")).click();
Thread.sleep(5000);
po.click_Proceed_to_checkOut_button().click();

Cart_Page LL=new Cart_Page(driver);


Thread.sleep(5000);
LL.Click_Proceed_to_checkout().click();

AUTHENTICATION_page GG=new AUTHENTICATION_page(driver);			
String USERNAME=GG.UN;
String PASSWORD=GG.PW;
//GG.Insert_UserName().sendKeys("USERNAME");
//GG.Insert_PassWord().sendKeys("PASSWORD");
//driver.findElement(By.cssSelector("div[class='col-xs-12 col-sm-6'] input[id='email']")).sendKeys("automationpracticerushi@dispostable.com");

//driver.findElement(By.cssSelector("div[class='col-xs-12 col-sm-6'] input[id='passwd']")).sendKeys("test123");
GG.Insert_UserName().sendKeys("automationpracticerushi@dispostable.com");
GG.Insert_PassWord().sendKeys("test123");

GG.Submit_button().click();

driver.findElement(By.cssSelector("button[class='button btn btn-default button-medium']")).click();
Shipping_page PS= new Shipping_page(driver);

Thread.sleep(5000);
PS.Click_checkbox().click();


PS.Click_ProccedToCheckOutbutton().click();



CHOOSE_PAYMENT_METHOD_page CPMP= new CHOOSE_PAYMENT_METHOD_page(driver);


CPMP.Through_Check().click();
Thread.sleep(5000);
ORDER_SUMMARY_Page OSP= new ORDER_SUMMARY_Page(driver);

String ORDER_SUMMARY_Page=OSP.Through_ORDER_SUMMARY().getText();

System.out.println(ORDER_SUMMARY_Page);

OSP.I_confirm_my_order().click();
Thread.sleep(10000);
Order_confirmationPage OC=new Order_confirmationPage(driver);

OC.getbutton_Back_to_orders().click();

ORDER_HISTORY_Page OHP=new ORDER_HISTORY_Page(driver);


OHP.center_Column().click();
//driver.findElement(By.id("history")).sendKeys(Keys.chord(Keys.ARROW_DOWN,Keys.ARROW_DOWN));
Thread.sleep(5000);
OHP.Get_Download_your_invoice_as_PDF_file().click();


	
Thread.sleep(5000);
Actions xyz=new Actions(driver);
xyz.moveToElement(OHP.page()).sendKeys(Keys.chord(Keys.PAGE_DOWN,Keys.DOWN)).sendKeys(Keys.chord(Keys.CONTROL,Keys.SUBTRACT)).build().perform();

	
	Robot ROBO=new Robot();
	
	for(int i=0;i<2;i++) {
	ROBO.keyPress(KeyEvent.VK_CONTROL);
	ROBO.keyPress(KeyEvent.VK_SUBTRACT);
	
	ROBO.keyRelease(KeyEvent.VK_CONTROL);
	
	ROBO.keyRelease(KeyEvent.VK_SUBTRACT);}
	}
	
	

	

	
	
	
	
	
	

}
