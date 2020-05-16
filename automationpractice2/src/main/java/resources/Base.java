package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public WebDriver driver;
	Properties prop = new Properties();

	
	public WebDriver Initialise() throws IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\rpawar\\eclipse-workspace\\TestNGDemo\\driver\\chromedriver.exe");

		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\automationpractice2\\src\\main\\java\\resources\\data.Properties");

		prop.load(fis);

		prop.getProperty("browser");

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		}

		else {

			driver = new FirefoxDriver();

		}
		return driver;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
