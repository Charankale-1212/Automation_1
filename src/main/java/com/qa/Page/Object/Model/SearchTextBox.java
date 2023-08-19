package com.qa.Page.Object.Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.ActionClass.Action;
import com.qa.BaseClass.TestBase;

public class SearchTextBox extends TestBase{
	
	@FindBy(id="search_query_top")
	WebElement SearchBox;
	@FindBy(name="submit_search")
	WebElement SearchIcon;
	@FindBy(xpath="//*[@id=\"header_logo\"]/a/img")
	WebElement Logo;
	@FindBy(xpath="//a[@class='login']")
	WebElement ClickOnSign; 
	@FindBy(xpath="//*[@id=\"contact-link\"]/a")
	WebElement ClickOnContent;
	@FindBy(xpath="//h4[text()='Store information']")
	WebElement Storeinformation;
	
	
	
	
public SearchTextBox() {
	PageFactory.initElements(driver, this);
}
public void SearchText() {
	SearchBox.click();
	SearchBox.sendKeys("T Shirt");
}

public PDP_Page SearchIconClick( ) {
	SearchIcon.click();
	return new PDP_Page();
}
public String VerifyTitle() {
String title=driver.getTitle();	
return title;
}
public boolean VerifyingLogo() {
	boolean logo=Logo.isDisplayed();
	return logo;
}
public SignUppage ClickOnSignPage() {
	ClickOnSign.click();
	return new SignUppage();
}
public String VerifyTitleLogin() {
	String Logintitle=driver.getTitle();
	return Logintitle;
}
public ContactPage ClickOnContent() {
	ClickOnContent.click();
	return new ContactPage();
	
}
public String CurrentURL() {
	String url=driver.getCurrentUrl();
	return url;
}
public String Storeinformation() {
	String Storeinfo=Storeinformation.getText();
	return Storeinfo;
	
	
}

}
