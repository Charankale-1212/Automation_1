package TestCases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.qa.BaseClass.TestBase;
import com.qa.Page.Object.Model.PDP_Page;
import com.qa.Page.Object.Model.SearchTextBox;
import com.qa.Page.Object.Model.SignUppage;

public class PDPPage extends TestBase{
	SearchTextBox stbox;
	SignUppage signup;
	PDP_Page pdppage;
@BeforeMethod
	public void SetUP() {
		LaunchApp();
		stbox=new SearchTextBox();
		pdppage =new PDP_Page();
	}
@Test
@Ignore
public void ProductSpecificationDisplay() {
	stbox.SearchText();
	stbox.SearchIconClick();
	boolean result=pdppage.ProductDisplay();
	Assert.assertTrue(result);
}
@Test
@Ignore
public void WomenBtnSelectable() {
	stbox.SearchText();
	stbox.SearchIconClick();
	String Btnsel=pdppage.WomenBtnSelectable();
	String Exp_Btnsel="DRESSES";
	Assert.assertEquals(Btnsel, Exp_Btnsel);
}
@Test

public void DressesBtnSelectable() {
	stbox.SearchText();
	stbox.SearchIconClick();
	String BtnselEv=pdppage.DressesBtnSelectable();
	String Exp_BtnselEv="EVENING DRESSES";
	Assert.assertEquals(BtnselEv, Exp_BtnselEv);
	throw new SkipException("TestSkip Due To Some Technical Issue");
}
@Test
@Ignore
public void TshirtBtnSelectable() {
	stbox.SearchText();
	stbox.SearchIconClick();
	boolean BtnselTshirt=pdppage.TShirtBtnSelectable();
	Assert.assertTrue(BtnselTshirt);
}
@Test
public void AddToCartClick() {
	stbox.SearchText();
	stbox.SearchIconClick();
	boolean Act=pdppage.AddToKartBtnSel();
	//String Exp="Product successfully added to your shopping cart";
	Assert.assertTrue(Act);
}

	
@AfterMethod
public void tearDown() {
	driver.quit();
}

	
}
