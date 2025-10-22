package page_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base_Class.Base_Page;

public class VerifyAndLogout_Page extends Base_Page {

	public VerifyAndLogout_Page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//h2[normalize-space()=\"Thank you for your order!\"]")
	WebElement cnfrm_msg;
	
	@FindBy(xpath="//button[@id=\"react-burger-menu-btn\"]")
	WebElement openMenu;
	
	@FindBy(xpath="//a[text()=\"Logout\"]")
	WebElement logout;
	
	public void click_OpenMenu()
	{
		openMenu.click();
	}
	
	public void click_Logout()
	{
		logout.click();
	}
	
	public String confirmation_msg()
	{
		try
		{
			return cnfrm_msg.getText();
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
	}

}
