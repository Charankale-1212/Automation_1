package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.qa.BaseClass.TestBase;
import com.qa.Page.Object.Model.SearchTextBox;
import com.qa.Page.Object.Model.SignUppage;

public class SignUpPage extends TestBase {

	SearchTextBox stbox;
	SignUppage signup;

	@BeforeMethod
	public void SetUP() {
		LaunchApp();
		stbox = new SearchTextBox();
		signup = new SignUppage();

	}

	@Test
	public void SucessFullSignUpPage() {

		stbox.ClickOnSignPage();
		signup.SucessfullySignUP();
		String act = signup.AlreadyExist();
		String Exp = "Authentication failed.";
		Assert.assertEquals(act, Exp);

	}
	@Test
	public void AccountCraete() {
		stbox.ClickOnSignPage();
		signup.emailCreate();
		String Actual_Account=signup.AccountVerify();
		String Exp_Account="YOUR PERSONAL INFORMATION";
		Assert.assertEquals(Actual_Account, Exp_Account);
		
	}
	@Test
	public void WithoutFillEmailClickRegisterBtn() {
		stbox.ClickOnSignPage();
		
		String ActualClick=signup.ClickonRegisterPageWithoutFillingEmail();
		String ExpClick="Invalid email address.";
		Assert.assertEquals(ActualClick, ExpClick);
	}
	@Test
	public void VerifyForgetPassword() {
		stbox.ClickOnSignPage();
		signup.ForgetPass();
		String Actual=signup.VerifyForgetPassword();
	   String Expe="FORGOT YOUR PASSWORD?";
	   Assert.assertEquals(Actual, Expe);
	}
	@Test
	public void WithoutFillingEmailandPWD() {
		stbox.ClickOnSignPage();
		String ActWithout=signup.WithoutFillingEmailandPassClickOnSignUp();
		String ExpWithout="An email address required.";
		 Assert.assertEquals(ActWithout, ExpWithout);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}