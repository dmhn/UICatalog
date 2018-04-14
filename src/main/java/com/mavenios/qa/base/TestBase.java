package com.mavenios.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumServiceBuilder;


public class TestBase {
	
	
		//private final static Logger logger = Logger.getLogger(AppiumIOS.class);
		public static IOSDriver driver;
		public static Properties prop;
		protected WebDriverWait wait;
		private static AppiumServiceBuilder service;//added newly for Appium to programatically start
		//public  static EventFiringWebDriver e_driver;
		//public static WebEventListener eventListener;

		
		public TestBase(){
			try {
			prop= new Properties();
			FileInputStream ip=new FileInputStream("/Users/deepamohan/"
					+ "eclipse-workspace/maveniosAppium/src/main/java/com/mavenios/qa/config/config.properties");
					prop.load(ip);
					
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
		
		public static void startAppium() {
			System.out.println("Begin to start Appium Server");
			service= new AppiumServiceBuilder().usingDriverExecutable(new File("/usr/local/bin/node")).withAppiumJS(
					new File("/Applications/Appium.app/Contents/Resources/app/node_modules/appium/build/lib/main.js"));
			service.build().start();
			System.out.println("Appium Server is at your service");
		}
		
		public static void stopAppium() {
			System.out.println("Begin to stop Appium Server");
			try {
			service.build().stop();
			}catch(Exception e) {
			System.out.println("Appium Server is already stopped");
		}
			System.out.println("Appium Server is now shut down");
		}
		@BeforeTest// runs once before all test cases are executed
		public void initialization() throws MalformedURLException, InterruptedException{ 
			stopAppium();//added newly for Appium to programatically start
			startAppium();//added newly for Appium to programatically start
			System.out.println("set desired cap");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			  capabilities.setCapability("deviceName", prop.getProperty("iOSDeviceName"));
			  capabilities.setCapability("app", prop.getProperty("app"));
			  capabilities.setCapability("automationName", "XCUITest");
			  capabilities.setCapability("platformName", "iOS");
			  capabilities.setCapability("platformVersion", prop.getProperty("iOSVersion"));
			  driver=new IOSDriver(new URL(prop.getProperty("hubUrl")),capabilities);
			  wait = new WebDriverWait(driver, 10);
			  
		}
		
		@AfterTest// runs once after all test cases are executed
	    public void afterTest(){
			driver.quit();
			stopAppium();//added newly for Appium to programatically start
	    }
	

		/*	
			
			 
			 
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITLY_WAIT, TimeUnit.SECONDS);
		*/


		

			
		
	/*
		 public static void main(String[] args) throws MalformedURLException, InterruptedException {
		  String hubUrl = "http://127.0.0.1:4723/wd/hub";
		  String iOSBrowserName = "Safari";
		  String iOSDeviceName = "iPhone Simulator";
		  String iOSVersion = "11.0";

		  DesiredCapabilities capabilities = new DesiredCapabilities();
		  capabilities.setCapability("deviceName", iOSDeviceName);
		  capabilities.setCapability("platformName", "iOS");
		  capabilities.setCapability("platformVersion", iOSVersion);
		  capabilities.setCapability("browserName", iOSBrowserName);
		  capabilities.setCapability("automationName", "XCUITest");
		  driver = new RemoteWebDriver(new URL(hubUrl), capabilities);
		  
		  String[] searchTerms = new String[] { 
		   "Bernard Lago Blogspot", 
		   "Bernard Lago Youtube",
		   "Bernard Lago Google Plus" 
		  };

		  for (int i = 0; i < searchTerms.length; i++) {
		   googleSearch(searchTerms[i]);
		   Thread.sleep(3000);
		   getInfoUsingResultIndex(1);  // 1 for the first link, 2 for 2nd etc...
		  }
		  
		  driver.quit();

		 }
		 
		 public static void googleSearch(String searchString) {
		  logger.info("Search term: " + searchString);
		  driver.navigate().to("https://www.google.com.ph/#q=" + searchString);
		 }

		 public static void getInfoUsingResultIndex(int index) {
		  String firstLinkLocator = String.format("div.g:nth-child(%s) h3.r a", index);
		  String firstCiteLocator = String.format("div.g:nth-child(%s) cite", index);
		  WebElement firstLink = driver.findElement(By.cssSelector(firstLinkLocator));
		  logger.info("First Link URL: "+ driver.findElement(By.cssSelector(firstCiteLocator)).getText());
		  logger.info("First link Page Title: " + firstLink.getText());
		 }

	*/


}

