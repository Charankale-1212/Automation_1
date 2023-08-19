/**
 * 
 */
package com.qa.Page.Object.Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.BaseClass.TestBase;

/**
 * @author charan
 *
 */
public class PDP_Page extends TestBase {
	@FindBy(xpath="//a[@class='product-name']")
	WebElement Tshirt;
	@FindBy(xpath="//img[@class='replace-2x img-responsive1']")
	WebElement ImageDisplay;
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	WebElement WomenBtn;
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	WebElement DreesesBtn;
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	WebElement TShirtBtn;
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li")
	WebElement CompleteProductDisplay;
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[2]/div[1]/span")
	WebElement CostoFProduct;
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[2]/span/span")
	WebElement InstockBtn;
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/a")
	WebElement DisplayProduct;
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[2]/a")
	WebElement DisplayEvening;
	@FindBy(xpath="//*[@id=\"center_column\"]/div[1]/div/div/span")
	WebElement TshirtDisplay;
	@FindBy(xpath="//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")
	WebElement AddtoCart;
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[1]/div[1]/img")
	WebElement AddtoCartSuccessfully;
	
	
	//*[@id="block_top_menu"]/ul/li[2]/ul/li[2]/a
	
	
	public PDP_Page() {
		PageFactory.initElements(driver, this);
	}
	public boolean ProductDisplay() {
		boolean shirt=Tshirt.isDisplayed();
		return shirt;
	}
	public boolean ProductImage() {
		boolean Image=Tshirt.isDisplayed();
		return Image;
	}
	public String WomenBtnSelectable() {
		Actions act=new Actions(driver);
		act.moveToElement(WomenBtn).build().perform();
		String DisplayPrd=DisplayProduct.getText();
		return DisplayPrd;
		
	}
	public String DressesBtnSelectable() {
		Actions act=new Actions(driver);
		act.moveToElement(DreesesBtn).build().perform();
		String DisplayDress=DisplayEvening.getText();
		return DisplayDress;
		
	}
	public boolean TShirtBtnSelectable() {
		TShirtBtn.click();
		boolean Tshirtdis=TshirtDisplay.isDisplayed();
		return Tshirtdis;
	}
	public Addtocart AddToKart() {
		Actions act=new Actions(driver);
		act.moveToElement(CompleteProductDisplay).build().perform();
		AddtoCart.click();
		return new Addtocart();
	}
	public boolean AddToKartBtnSel() {
		Actions act=new Actions(driver);
		act.moveToElement(CompleteProductDisplay).build().perform();
		Actions actAdd=new Actions(driver);
		actAdd.doubleClick(AddtoCart).build().perform();
	boolean ActText=	AddtoCartSuccessfully.isDisplayed();
		return  ActText;
	}

	
}
