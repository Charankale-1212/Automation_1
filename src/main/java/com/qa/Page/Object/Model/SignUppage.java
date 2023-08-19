package com.qa.Page.Object.Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.BaseClass.TestBase;

public class SignUppage extends TestBase {
	
	@FindBy(id="email")
	WebElement Email;
	@FindBy(id="passwd")
	WebElement Password;
	@FindBy(xpath="//*[@id=\"SubmitLogin\"]/span")
	WebElement SignUpPage;
	@FindBy(xpath="//*[@id=\"center_column\"]/div[1]/ol/li")
	WebElement AlreadyE;
	@FindBy(id="email_create")
	WebElement Email_Create;
	@FindBy(xpath="//*[@id=\"account-creation_form\"]/div[1]/h3")
	WebElement AccountVerify;
	@FindBy(xpath="//*[@id=\"SubmitCreate\"]/span")
	WebElement ClickOnRegister;
	@FindBy(xpath="//*[@id=\"create_account_error\"]/ol/li")
	WebElement AlertEmail;
	@FindBy(xpath="//a[text()='Forgot your password?']")
	WebElement ForgetPasswod;
	@FindBy(xpath="//*[@id=\"center_column\"]/div/h1")
	WebElement VerifyForPa;
	@FindBy(xpath="//*[@id=\"center_column\"]/div[1]/ol")
	WebElement WithoutEmailandPwd;
	
	public SignUppage() {
		PageFactory.initElements(driver, this);
	}
public void SucessfullySignUP() {
	Email.sendKeys("admin@xyz.com");
	Password.sendKeys("admin123");
	SignUpPage.click();
}
public String AlreadyExist() {
	String Act=AlreadyE.getText();
	return Act;
}
public void emailCreate() {
	Email_Create.sendKeys("charan@gmail.com");
	ClickOnRegister.click();
	
}
public String AccountVerify() {
String Actual_Account=AccountVerify.getText();
return Actual_Account;
}
public String ClickonRegisterPageWithoutFillingEmail() {
	ClickOnRegister.click();
	String ActAlert=AlertEmail.getText();
	return ActAlert;
}
public void ForgetPass() {
	ForgetPasswod.click();
	
}
public String VerifyForgetPassword() {
	String VerifyForPass=VerifyForPa.getText();
	return VerifyForPass;
}
public String WithoutFillingEmailandPassClickOnSignUp(){
	SignUpPage.click();
	String Act=WithoutEmailandPwd.getText();
	return Act;
}
}
