package com.qa.Page.Object.Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.BaseClass.TestBase;

public class Addtocart extends TestBase {
	@FindBy(xpath="//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/b")
	WebElement AddtoCartBtn;
	@FindBy(xpath="//*[@id=\"center_column\"]/p")
	WebElement EmptyItems;
	
	
	
	
	
	public Addtocart() {
		PageFactory.initElements(driver, this);
}
	public void AddtoCartSelectable() {
		AddtoCartBtn.click();
		
	}
	public boolean DisplayInstockItems() {
	boolean EmptyItem=	EmptyItems.isDisplayed();
		return EmptyItem;
	}
	
	
}