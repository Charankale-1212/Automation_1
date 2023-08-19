package com.qa.ActionClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.BaseClass.TestBase;

public class Action extends TestBase{
	
	
	public static void ScrollIntoViewVisibleElement(WebDriver driver,WebElement ele) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		
		
	}
	
	public static void Click(WebDriver driver,WebElement locatorName) {
		Actions act=new Actions(driver);
	    act.moveToElement(locatorName).click().build().perform();
	}
	public static boolean Type(WebElement ele,String text) {
		boolean flag=false;
		try {
			flag=ele.isDisplayed();
			ele.clear();
			ele.sendKeys(text);
			flag=true;
		}catch(Exception e) {
			System.out.println("Location not found");
		}finally {
			if(flag) {
				System.out.println("Sucessfully enter value");
			}else {
				System.out.println("Unable enter value");
			}
		}
		return flag;
	}
	

}
