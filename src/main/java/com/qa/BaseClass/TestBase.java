package com.qa.BaseClass;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import jdk.internal.org.jline.utils.Log;



public class TestBase {
	public  static WebDriver driver;
	public static Properties  prop;
	 Logger logger = LogManager.getLogger(TestBase.class);
	
	public void LoadConf() {
		
		
		
		
		
	}
	
	public  void LaunchApp() {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver2\\chromedriver.exe");
		//driver=new ChromeDriver();
	
		
		System.setProperty("webdriver.edge.driver", "D:\\edge_driver\\msedgedriver.exe");
		driver=new EdgeDriver();
		
		
		driver.manage().window().maximize();
		
		 driver.manage().deleteAllCookies();
		
		 driver.navigate().refresh();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("http://automationpractice.com/");
		
		
	}
	
	

}
