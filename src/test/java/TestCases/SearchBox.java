package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.qa.BaseClass.TestBase;
import com.qa.Page.Object.Model.SearchTextBox;

public class SearchBox extends TestBase {
	 public SearchTextBox stbox;
	@BeforeMethod
	public void SetUP() {
		LaunchApp();
		stbox=new SearchTextBox();
	}
	
		
	@Test
	//@Ignore
	public void ClickOnSearchIcon() {
		
		stbox.SearchIconClick();
		String Acttitle=stbox.VerifyTitle();
		String Exptitle="Search - My Store";
		Assert.assertEquals(Acttitle, Exptitle);
		
		
	}
	@Test
	//@Ignore
	public void DisplayMyStoreLogo() {
	
		boolean result=stbox.VerifyingLogo();
		Assert.assertTrue(result);
		
	}
	@Test
	//@Ignore
	public void ClickOnSearchIconPageRef() {
		
		stbox.SearchIconClick();
		boolean result=stbox.VerifyingLogo();
		Assert.assertTrue(result);
	}
	@Test
	//@Ignore
	public void SignUpBtnSelectable() {
		
		stbox.ClickOnSignPage();
		String Act_title=stbox.VerifyTitleLogin();
	    String	Exp_title="Login - My Store";
	    Assert.assertEquals(Act_title, Exp_title);
	}
	@Test
	//@Ignore
	public void ContentClickSelectable() {
		
		stbox.ClickOnContent();
		String ActURL=stbox.CurrentURL();
		String ExpURL="http://automationpractice.com/index.php?controller=contact";
		Assert.assertEquals(ActURL, ExpURL);
	}
	@Test
	public void Storeinformation() {
		
		String Act=stbox.Storeinformation();
		String Exp="Store information";
		Assert.assertEquals(Act, Exp);
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
