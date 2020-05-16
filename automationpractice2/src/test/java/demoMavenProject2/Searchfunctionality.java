package demoMavenProject2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObject.AUTHENTICATION_page;
import pageObject.Addrees_VerficationPage;
import pageObject.CHOOSE_PAYMENT_METHOD_page;
import pageObject.Cart_Page;
import pageObject.Home_page_elements;
import pageObject.ORDER_HISTORY_Page;
import pageObject.ORDER_SUMMARY_Page;
import pageObject.Order_confirmationPage;
import pageObject.Product_detailed_Page;
import pageObject.Searched_page;
import pageObject.Shipping_page;
import resources.Base;

public class Searchfunctionality extends Base
{

	//Test11_testORDER_HISTORY_Page Test10_Order_Summury_Page Test9_SelectPaymentMethod Test8_ShippingPage 
	//Test7_ADDRESSES_verification Test6_UserAuthtification Test5_ShppingCartSummary_ Test4_AddtoCartSearchedProductsFromNewTab
	//  Test3_OpenSearchedProductsInNewTab Test2_testSearchfunction Test1_Invoke_homepage
 
	@BeforeClass(enabled=true)

	public void Test1_Invoke_homepage() throws IOException, InterruptedException, NullPointerException, AWTException
	{

		driver = Initialise();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
System.out.println("TEST !");
	}
	@Test(enabled=true)
	public void Test2_testSearchfunction() throws IOException, InterruptedException, AWTException
	{Test1_Invoke_homepage();
		
		driver.get("http://automationpractice.com/index.php");
		Home_page_elements HPE_Object = new Home_page_elements(driver);
		Actions xyz=new Actions(driver);

		HPE_Object.searchBar().sendKeys("Casual Dresses");
	

		HPE_Object.searchButton().click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Searched_page SP_Object = new Searched_page(driver);
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());
		
		System.out.println("TEST 2");
	}
	@Test (enabled=true)
	public void Test3_OpenSearchedProductsInNewTab() throws IOException, InterruptedException, AWTException
	{Test1_Invoke_homepage();
		
		driver.get("http://automationpractice.com/index.php");
		Home_page_elements HPE_Object = new Home_page_elements(driver);
		Actions xyz=new Actions(driver);

		HPE_Object.searchBar().sendKeys("Casual Dresses");
	

		HPE_Object.searchButton().click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Searched_page SP_Object = new Searched_page(driver);
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());
		
		System.out.println("TEST 2");
		
		int  count=		SP_Object.getlimitingDriver();

		System.out.println("Total related product Count is-->"+count);
		
		for(int i=0;i<count;i++) 
		{

			SP_Object.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
			 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			System.out.println("moved Count is-->"+i);

			
		}
	}
	//Test11_testORDER_HISTORY_Page Test10_Order_Summury_Page Test9_SelectPaymentMethod Test8_ShippingPage Test7_ADDRESSES_verification Test6_UserAuthtification Test5_ShppingCartSummary_ Test4_AddtoCartSearchedProductsFromNewTab
	@Test (enabled=false)
	public void Test4_AddtoCartSearchedProductsFromNewTab() throws IOException, InterruptedException, AWTException
	{Test1_Invoke_homepage();
		
		driver.get("http://automationpractice.com/index.php");
		Home_page_elements HPE_Object = new Home_page_elements(driver);
		Actions xyz=new Actions(driver);

		HPE_Object.searchBar().sendKeys("Casual Dresses");
	

		HPE_Object.searchButton().click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Searched_page SP_Object = new Searched_page(driver);
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());
		
		System.out.println("TEST 2");
		
		int  count=		SP_Object.getlimitingDriver();

		System.out.println("Total related product Count is-->"+count);
		
		for(int i=0;i<count;i++) 
		{

			SP_Object.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
			 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			System.out.println("moved Count is-->"+i);

			
		}
	
             //	---------------
		 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		Set <String> fff=driver.getWindowHandles();

		Iterator It = fff.iterator();

		driver.switchTo().window((String) It.next());

		Product_detailed_Page po= new Product_detailed_Page(driver);

		while(It.hasNext()) {

			 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		driver.switchTo().window((String) It.next());
			//Thread.sleep(8000);
			
			
		//WebElement BB=	driver.findElement(By.cssSelector("button[class='exclusive']"));
				if(po.click_add_to_cart().isEnabled())
			{
					po.click_add_to_cart().click();
					 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
					
					
			}
				else 
		{
				
				System.out.println("no add to  cart");
				break;
			
		}

			System.out.println(driver.getCurrentUrl()+"CurrentUrl");

		}


			

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		po.click_Proceed_to_checkOut_button().click();

			}
			
	
	//Test11_testORDER_HISTORY_Page Test10_Order_Summury_Page Test9_SelectPaymentMethod Test8_ShippingPage Test7_ADDRESSES_verification Test6_UserAuthtification Test5_ShppingCartSummary_
	@Test(enabled=true)
	public void Test5_ShppingCartSummary_() throws IOException, InterruptedException, AWTException
	{
		Test1_Invoke_homepage();
		
		driver.get("http://automationpractice.com/index.php");
		Home_page_elements HPE_Object = new Home_page_elements(driver);
		Actions xyz=new Actions(driver);

		HPE_Object.searchBar().sendKeys("Casual Dresses");
	

		HPE_Object.searchButton().click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Searched_page SP_Object = new Searched_page(driver);
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());
		
		System.out.println("TEST 2");
		
		int  count=		SP_Object.getlimitingDriver();

		System.out.println("Total related product Count is-->"+count);
		
		for(int i=0;i<count;i++) 
		{

			SP_Object.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
			 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			System.out.println("moved Count is-->"+i);

			
		}
	
             //	---------------
		 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		Set <String> fff=driver.getWindowHandles();

		Iterator It = fff.iterator();

		driver.switchTo().window((String) It.next());

		Product_detailed_Page po= new Product_detailed_Page(driver);

		while(It.hasNext()) {

			 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		driver.switchTo().window((String) It.next());
			//Thread.sleep(8000);
			
			
		//WebElement BB=	driver.findElement(By.cssSelector("button[class='exclusive']"));
				if(po.click_add_to_cart().isEnabled())
			{
					po.click_add_to_cart().click();
					 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
					
					
			}
				else 
		{
				
				System.out.println("no add to  cart");
				break;
			
		}

			System.out.println(driver.getCurrentUrl()+"CurrentUrl");

		}


			

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		po.click_Proceed_to_checkOut_button().click();
		Cart_Page CartObject=new Cart_Page(driver);


		Thread.sleep(5000);
		CartObject.Click_Proceed_to_checkout().click();
			}
	//Test11_testORDER_HISTORY_Page Test10_Order_Summury_Page Test9_SelectPaymentMethod Test8_ShippingPage Test7_ADDRESSES_verification Test6_UserAuthtification
	
	@Test(enabled=true)
	public void Test6_UserAuthtification() throws IOException, InterruptedException, AWTException
	{
		Test1_Invoke_homepage();
		
		driver.get("http://automationpractice.com/index.php");
		Home_page_elements HPE_Object = new Home_page_elements(driver);
		Actions xyz=new Actions(driver);

		HPE_Object.searchBar().sendKeys("Casual Dresses");
	

		HPE_Object.searchButton().click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Searched_page SP_Object = new Searched_page(driver);
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());
		
		System.out.println("TEST 2");
		
		int  count=		SP_Object.getlimitingDriver();

		System.out.println("Total related product Count is-->"+count);
		
		for(int i=0;i<count;i++) 
		{

			SP_Object.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
			 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			System.out.println("moved Count is-->"+i);

			
		}
	
             //	---------------
		 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		Set <String> fff=driver.getWindowHandles();

		Iterator It = fff.iterator();

		driver.switchTo().window((String) It.next());

		Product_detailed_Page po= new Product_detailed_Page(driver);

		while(It.hasNext()) {

			 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		driver.switchTo().window((String) It.next());
			//Thread.sleep(8000);
			
			
		//WebElement BB=	driver.findElement(By.cssSelector("button[class='exclusive']"));
				if(po.click_add_to_cart().isEnabled())
			{
					po.click_add_to_cart().click();
					 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
					
					
			}
				else 
		{
				
				System.out.println("no add to  cart");
				break;
			
		}

			System.out.println(driver.getCurrentUrl()+"CurrentUrl");

		}


			

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		po.click_Proceed_to_checkOut_button().click();
		Cart_Page CartObject=new Cart_Page(driver);


		Thread.sleep(5000);
		CartObject.Click_Proceed_to_checkout().click();
		//Here User tries to get loggedin
		AUTHENTICATION_page AuthObj=new AUTHENTICATION_page(driver);			

		AuthObj.Insert_UserName().sendKeys("automationpracticerushi@dispostable.com");

		AuthObj.Insert_PassWord().sendKeys("test123");

		AuthObj.Submit_button().click();


		
		
		
			}

	//Test11_testORDER_HISTORY_Page Test10_Order_Summury_Page Test9_SelectPaymentMethod Test8_ShippingPage Test7_ADDRESSES_verification
	@Test(enabled=true)
	public void Test7_ADDRESSES_verification() throws IOException, InterruptedException, AWTException
	{
		Test1_Invoke_homepage();
		
		driver.get("http://automationpractice.com/index.php");
		Home_page_elements HPE_Object = new Home_page_elements(driver);
		Actions xyz=new Actions(driver);

		HPE_Object.searchBar().sendKeys("Casual Dresses");
	

		HPE_Object.searchButton().click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Searched_page SP_Object = new Searched_page(driver);
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());
		
		System.out.println("TEST 2");
		
		int  count=		SP_Object.getlimitingDriver();

		System.out.println("Total related product Count is-->"+count);
		
		for(int i=0;i<count;i++) 
		{

			SP_Object.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
			 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			System.out.println("moved Count is-->"+i);

			
		}
	
             //	---------------
		 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		Set <String> fff=driver.getWindowHandles();

		Iterator It = fff.iterator();

		driver.switchTo().window((String) It.next());

		Product_detailed_Page po= new Product_detailed_Page(driver);

		while(It.hasNext()) {

			 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		driver.switchTo().window((String) It.next());
			//Thread.sleep(8000);
			
			
		//WebElement BB=	driver.findElement(By.cssSelector("button[class='exclusive']"));
				if(po.click_add_to_cart().isEnabled())
			{
					po.click_add_to_cart().click();
					 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
					
					
			}
				else 
		{
				
				System.out.println("no add to  cart");
				break;
			
		}

			System.out.println(driver.getCurrentUrl()+"CurrentUrl");

		}


			

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		po.click_Proceed_to_checkOut_button().click();
		Cart_Page CartObject=new Cart_Page(driver);


		Thread.sleep(5000);
		CartObject.Click_Proceed_to_checkout().click();
		//Here User tries to get loggedin
		AUTHENTICATION_page AuthObj=new AUTHENTICATION_page(driver);			

		AuthObj.Insert_UserName().sendKeys("automationpracticerushi@dispostable.com");

		AuthObj.Insert_PassWord().sendKeys("test123");

		AuthObj.Submit_button().click();


		Addrees_VerficationPage AddressObject = new Addrees_VerficationPage(driver);

		AddressObject.getProceedtocheckoutButton().click();
		
		
			}
	
	
	@Test(enabled=true)
	public void Test8_ShippingPage() throws IOException, InterruptedException, AWTException
	{
		Test1_Invoke_homepage();
		
		driver.get("http://automationpractice.com/index.php");
		Home_page_elements HPE_Object = new Home_page_elements(driver);
		Actions xyz=new Actions(driver);

		HPE_Object.searchBar().sendKeys("Casual Dresses");
	

		HPE_Object.searchButton().click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Searched_page SP_Object = new Searched_page(driver);
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());
		
		System.out.println("TEST 2");
		
		int  count=		SP_Object.getlimitingDriver();

		System.out.println("Total related product Count is-->"+count);
		
		for(int i=0;i<count;i++) 
		{

			SP_Object.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
			 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			System.out.println("moved Count is-->"+i);

			
		}
	
             //	---------------
		 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		Set <String> fff=driver.getWindowHandles();

		Iterator It = fff.iterator();

		driver.switchTo().window((String) It.next());

		Product_detailed_Page po= new Product_detailed_Page(driver);

		while(It.hasNext()) {

			 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		driver.switchTo().window((String) It.next());
			//Thread.sleep(8000);
			
			
		//WebElement BB=	driver.findElement(By.cssSelector("button[class='exclusive']"));
				if(po.click_add_to_cart().isEnabled())
			{
					po.click_add_to_cart().click();
					 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
					
					
			}
				else 
		{
				
				System.out.println("no add to  cart");
				break;
			
		}

			System.out.println(driver.getCurrentUrl()+"CurrentUrl");

		}


			

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		po.click_Proceed_to_checkOut_button().click();
		Cart_Page CartObject=new Cart_Page(driver);


		Thread.sleep(5000);
		CartObject.Click_Proceed_to_checkout().click();
		//Here User tries to get loggedin
		AUTHENTICATION_page AuthObj=new AUTHENTICATION_page(driver);			

		AuthObj.Insert_UserName().sendKeys("automationpracticerushi@dispostable.com");

		AuthObj.Insert_PassWord().sendKeys("test123");

		AuthObj.Submit_button().click();


		Addrees_VerficationPage AddressObject = new Addrees_VerficationPage(driver);

		AddressObject.getProceedtocheckoutButton().click();
		
		Shipping_page ShippingObject= new Shipping_page(driver);

		Thread.sleep(5000);
		ShippingObject.Click_checkbox().click();


		ShippingObject.Click_ProccedToCheckOutbutton().click();
			}
	
	
	//Test11_testORDER_HISTORY_Page Test10_Order_Summury_Page Test9_SelectPaymentMethod
	
	@Test(enabled=true)
	public void Test9_SelectPaymentMethod() throws IOException, InterruptedException, AWTException
	{
		Test1_Invoke_homepage();
		
		driver.get("http://automationpractice.com/index.php");
		Home_page_elements HPE_Object = new Home_page_elements(driver);
		Actions xyz=new Actions(driver);

		HPE_Object.searchBar().sendKeys("Casual Dresses");
	

		HPE_Object.searchButton().click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Searched_page SP_Object = new Searched_page(driver);
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());
		
		System.out.println("TEST 2");
		
		int  count=		SP_Object.getlimitingDriver();

		System.out.println("Total related product Count is-->"+count);
		
		for(int i=0;i<count;i++) 
		{

			SP_Object.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
			 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			System.out.println("moved Count is-->"+i);

			
		}
	
             //	---------------
		 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		Set <String> fff=driver.getWindowHandles();

		Iterator It = fff.iterator();

		driver.switchTo().window((String) It.next());

		Product_detailed_Page po= new Product_detailed_Page(driver);

		while(It.hasNext()) {

			 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		driver.switchTo().window((String) It.next());
			//Thread.sleep(8000);
			
			
		//WebElement BB=	driver.findElement(By.cssSelector("button[class='exclusive']"));
				if(po.click_add_to_cart().isEnabled())
			{
					po.click_add_to_cart().click();
					 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
					
					
			}
				else 
		{
				
				System.out.println("no add to  cart");
				break;
			
		}

			System.out.println(driver.getCurrentUrl()+"CurrentUrl");

		}


			

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		po.click_Proceed_to_checkOut_button().click();
		Cart_Page CartObject=new Cart_Page(driver);


		Thread.sleep(5000);
		CartObject.Click_Proceed_to_checkout().click();
		//Here User tries to get loggedin
		AUTHENTICATION_page AuthObj=new AUTHENTICATION_page(driver);			

		AuthObj.Insert_UserName().sendKeys("automationpracticerushi@dispostable.com");

		AuthObj.Insert_PassWord().sendKeys("test123");

		AuthObj.Submit_button().click();


		Addrees_VerficationPage AddressObject = new Addrees_VerficationPage(driver);

		AddressObject.getProceedtocheckoutButton().click();
		
		Shipping_page ShippingObject= new Shipping_page(driver);

		Thread.sleep(5000);
		ShippingObject.Click_checkbox().click();


		ShippingObject.Click_ProccedToCheckOutbutton().click();
		CHOOSE_PAYMENT_METHOD_page PAY_MethodObject= new CHOOSE_PAYMENT_METHOD_page(driver);


		PAY_MethodObject.Through_Check().click();
			}

	
	
	@Test(enabled=true)
	public void Test10_Order_Summury_Page() throws IOException, InterruptedException, AWTException
	{
		Test1_Invoke_homepage();
		
		driver.get("http://automationpractice.com/index.php");
		Home_page_elements HPE_Object = new Home_page_elements(driver);
		Actions xyz=new Actions(driver);

		HPE_Object.searchBar().sendKeys("Casual Dresses");
	

		HPE_Object.searchButton().click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Searched_page SP_Object = new Searched_page(driver);
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());
		
		System.out.println("TEST 2");
		
		int  count=		SP_Object.getlimitingDriver();

		System.out.println("Total related product Count is-->"+count);
		
		for(int i=0;i<count;i++) 
		{

			SP_Object.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
			 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			System.out.println("moved Count is-->"+i);

			
		}
	
             //	---------------
		 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		Set <String> fff=driver.getWindowHandles();

		Iterator It = fff.iterator();

		driver.switchTo().window((String) It.next());

		Product_detailed_Page po= new Product_detailed_Page(driver);

		while(It.hasNext()) {

			 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		driver.switchTo().window((String) It.next());
			//Thread.sleep(8000);
			
			
		//WebElement BB=	driver.findElement(By.cssSelector("button[class='exclusive']"));
				if(po.click_add_to_cart().isEnabled())
			{
					po.click_add_to_cart().click();
					 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
					
					
			}
				else 
		{
				
				System.out.println("no add to  cart");
				break;
			
		}

			System.out.println(driver.getCurrentUrl()+"CurrentUrl");

		}


			

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		po.click_Proceed_to_checkOut_button().click();
		Cart_Page CartObject=new Cart_Page(driver);


		Thread.sleep(5000);
		CartObject.Click_Proceed_to_checkout().click();
		//Here User tries to get loggedin
		AUTHENTICATION_page AuthObj=new AUTHENTICATION_page(driver);			

		AuthObj.Insert_UserName().sendKeys("automationpracticerushi@dispostable.com");

		AuthObj.Insert_PassWord().sendKeys("test123");

		AuthObj.Submit_button().click();


		Addrees_VerficationPage AddressObject = new Addrees_VerficationPage(driver);

		AddressObject.getProceedtocheckoutButton().click();
		
		Shipping_page ShippingObject= new Shipping_page(driver);

		Thread.sleep(5000);
		ShippingObject.Click_checkbox().click();


		ShippingObject.Click_ProccedToCheckOutbutton().click();
		CHOOSE_PAYMENT_METHOD_page PAY_MethodObject= new CHOOSE_PAYMENT_METHOD_page(driver);


		PAY_MethodObject.Through_Check().click();
		
		ORDER_SUMMARY_Page OrderSummerobject= new ORDER_SUMMARY_Page(driver);

		String ORDER_SUMMARY_Page=OrderSummerobject.Through_ORDER_SUMMARY().getText();

		System.out.println(ORDER_SUMMARY_Page);

		OrderSummerobject.I_confirm_my_order().click();
		Thread.sleep(10000);
			}
	@Test(enabled=true)
	public void Test11_Order_Summury_Page() throws IOException, InterruptedException, AWTException
	{
		Test1_Invoke_homepage();
		
		driver.get("http://automationpractice.com/index.php");
		Home_page_elements HPE_Object = new Home_page_elements(driver);
		Actions xyz=new Actions(driver);

		HPE_Object.searchBar().sendKeys("Casual Dresses");
	

		HPE_Object.searchButton().click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Searched_page SP_Object = new Searched_page(driver);
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());
		
		System.out.println("TEST 2");
		
		int  count=		SP_Object.getlimitingDriver();

		System.out.println("Total related product Count is-->"+count);
		
		for(int i=0;i<count;i++) 
		{

			SP_Object.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
			 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			System.out.println("moved Count is-->"+i);

			
		}
	
             //	---------------
		 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		Set <String> fff=driver.getWindowHandles();

		Iterator It = fff.iterator();

		driver.switchTo().window((String) It.next());

		Product_detailed_Page po= new Product_detailed_Page(driver);

		while(It.hasNext()) {

			 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		driver.switchTo().window((String) It.next());
			//Thread.sleep(8000);
			
			
		//WebElement BB=	driver.findElement(By.cssSelector("button[class='exclusive']"));
				if(po.click_add_to_cart().isEnabled())
			{
					po.click_add_to_cart().click();
					 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
					
					
			}
				else 
		{
				
				System.out.println("no add to  cart");
				break;
			
		}

			System.out.println(driver.getCurrentUrl()+"CurrentUrl");

		}


			

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		po.click_Proceed_to_checkOut_button().click();
		Cart_Page CartObject=new Cart_Page(driver);


		Thread.sleep(5000);
		CartObject.Click_Proceed_to_checkout().click();
		//Here User tries to get loggedin
		AUTHENTICATION_page AuthObj=new AUTHENTICATION_page(driver);			

		AuthObj.Insert_UserName().sendKeys("automationpracticerushi@dispostable.com");

		AuthObj.Insert_PassWord().sendKeys("test123");

		AuthObj.Submit_button().click();


		Addrees_VerficationPage AddressObject = new Addrees_VerficationPage(driver);

		AddressObject.getProceedtocheckoutButton().click();
		
		Shipping_page ShippingObject= new Shipping_page(driver);

		Thread.sleep(5000);
		ShippingObject.Click_checkbox().click();


		ShippingObject.Click_ProccedToCheckOutbutton().click();
		CHOOSE_PAYMENT_METHOD_page PAY_MethodObject= new CHOOSE_PAYMENT_METHOD_page(driver);


		PAY_MethodObject.Through_Check().click();
		
		
		ORDER_SUMMARY_Page OSP= new ORDER_SUMMARY_Page(driver);

		String ORDER_SUMMARY_Page=OSP.Through_ORDER_SUMMARY().getText();

		System.out.println(ORDER_SUMMARY_Page);
		

Order_confirmationPage Order_confirma_object=new Order_confirmationPage(driver);

Order_confirma_object.getbutton_Back_to_orders().click();
		
			}
	@Test(enabled=true)
	public void Test11_testORDER_HISTORY_Page() throws IOException, InterruptedException, AWTException
	{
		Test1_Invoke_homepage();
		
		driver.get("http://automationpractice.com/index.php");
		Home_page_elements HPE_Object = new Home_page_elements(driver);
	

		HPE_Object.searchBar().sendKeys("Casual Dresses");
	

		HPE_Object.searchButton().click();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		Searched_page SP_Object = new Searched_page(driver);
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());
		
		System.out.println("TEST 2");
		
		int  count=		SP_Object.getlimitingDriver();

		System.out.println("Total related product Count is-->"+count);
		
		for(int i=0;i<count;i++) 
		{

			SP_Object.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
			 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			System.out.println("moved Count is-->"+i);

			
		}
	
             //	---------------
		 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		Set <String> fff=driver.getWindowHandles();

		Iterator It = fff.iterator();

		driver.switchTo().window((String) It.next());

		Product_detailed_Page po= new Product_detailed_Page(driver);

		while(It.hasNext()) {

			 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		driver.switchTo().window((String) It.next());
			//Thread.sleep(8000);
			
			
		//WebElement BB=	driver.findElement(By.cssSelector("button[class='exclusive']"));
				if(po.click_add_to_cart().isEnabled())
			{
					po.click_add_to_cart().click();
					 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
					
					
			}
				else 
		{
				
				System.out.println("no add to  cart");
				break;
			
		}

			System.out.println(driver.getCurrentUrl()+"CurrentUrl");

		}


			

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		po.click_Proceed_to_checkOut_button().click();
		Cart_Page CartObject=new Cart_Page(driver);


		 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		CartObject.Click_Proceed_to_checkout().click();
		//Here User tries to get loggedin
		AUTHENTICATION_page AuthObj=new AUTHENTICATION_page(driver);			

		AuthObj.Insert_UserName().sendKeys("automationpracticerushi@dispostable.com");

		AuthObj.Insert_PassWord().sendKeys("test123");

		AuthObj.Submit_button().click();


		Addrees_VerficationPage AddressObject = new Addrees_VerficationPage(driver);

		AddressObject.getProceedtocheckoutButton().click();
		
		Shipping_page ShippingObject= new Shipping_page(driver);

		 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		ShippingObject.Click_checkbox().click();

		 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		ShippingObject.Click_ProccedToCheckOutbutton().click();
		CHOOSE_PAYMENT_METHOD_page PAY_MethodObject= new CHOOSE_PAYMENT_METHOD_page(driver);

		Thread.sleep(5000);
		PAY_MethodObject.Through_Check().click();
		 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		ORDER_SUMMARY_Page OSP= new ORDER_SUMMARY_Page(driver);

		String ORDER_SUMMARY_Page=OSP.Through_ORDER_SUMMARY().getText();

		System.out.println(ORDER_SUMMARY_Page);
		OSP.I_confirm_my_order().click();
		 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
Order_confirmationPage Order_confirma_object=new Order_confirmationPage(driver);

Order_confirma_object.getbutton_Back_to_orders().click();

ORDER_HISTORY_Page Order_History_Object=new ORDER_HISTORY_Page(driver);

driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
Order_History_Object.center_Column().click();
Thread.sleep(5000);
Order_History_Object.Get_Download_your_invoice_as_PDF_file().click();
Actions Act=new Actions(driver);
Thread.sleep(5000);
Act.moveToElement(Order_History_Object.page()).sendKeys(Keys.chord(Keys.PAGE_DOWN,Keys.DOWN)).sendKeys(Keys.chord(Keys.CONTROL,Keys.SUBTRACT)).build().perform();
Thread.sleep(5000);
	
	Robot ROBO=new Robot();
	
	for(int i=0;i<2;i++) {
	ROBO.keyPress(KeyEvent.VK_CONTROL);
	ROBO.keyPress(KeyEvent.VK_SUBTRACT);
	
	ROBO.keyRelease(KeyEvent.VK_CONTROL);
	
	ROBO.keyRelease(KeyEvent.VK_SUBTRACT);}
	}
	
		
			
	
}
