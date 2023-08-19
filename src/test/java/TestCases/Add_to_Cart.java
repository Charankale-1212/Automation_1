package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.BaseClass.TestBase;
import com.qa.Page.Object.Model.Addtocart;
import com.qa.Page.Object.Model.PDP_Page;
import com.qa.Page.Object.Model.SearchTextBox;
import com.qa.Page.Object.Model.SignUppage;

import jdk.internal.org.jline.utils.Log;

public class Add_to_Cart extends TestBase {
	SearchTextBox stbox;
	SignUppage signup;
	PDP_Page pdppage;
	Addtocart addtocart;
@BeforeMethod
	public void SetUP() {
		LaunchApp();
		stbox=new SearchTextBox();
		pdppage =new PDP_Page();
		 addtocart=new Addtocart();
		
}
@Test
public void AddtoCartBtn() {
	Log.info("select the add to cart button");
	addtocart.AddtoCartSelectable();
	Log.info("select the add to cart");
	boolean result=addtocart.DisplayInstockItems();
	Log.info("Display the Instock items");
	Assert.assertTrue(result);
	Log.info("Resulat display");
}




@AfterMethod
public void tearDown() {
	driver.quit();
}


}