package com.apollo.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

//import com.crm.qa.util.WebEventListener;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	//public  static EventFiringWebDriver e_driver;
	//public static WebEventListener eventListener;
	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream fs = new FileInputStream("E:\\EclipseNewForFramework\\Workspace\\APOLLO\\src\\main\\java\\com\\apollo\\qa\\config\\config.properties");
			prop.load(fs);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void initialization(){
		String browserName = prop.getProperty("Browser");
		
		if(browserName.equals("Chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\selenium-java-3.141.59\\chromedriver_win32 - Copy\\chromedriver.exe");
			driver = new ChromeDriver(); 
		}
		else if(browserName.equals("FireFox"))			
		{
			System.setProperty("webdriver.chrome.driver", browserName);
			driver = new ChromeDriver();
			
		}
		else if(browserName.equals("InternetExplorer"))			
		{
			System.setProperty("webdriver.chrome.driver", browserName);
			driver = new ChromeDriver();
			
		}
		else if(browserName.equals("MicrosoftEdge"))			
		{
			System.setProperty("webdriver.chrome.driver", browserName);
			driver = new ChromeDriver();
			
		}
		else if(browserName.equals("Chromium"))			
		{
			System.setProperty("webdriver.chrome.driver", browserName);
			driver = new ChromeDriver();
			
		}
		
		
		//e_driver = new EventFiringWebDriver(driver);
		//Now create object of EventListerHandler to register it with EventFiringWebDriver
		//eventListener = new WebEventListener();
		//e_driver.register(eventListener);
		//driver = e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("URL"));
		
	}
	
	
	
	
	
	
	
	

}
