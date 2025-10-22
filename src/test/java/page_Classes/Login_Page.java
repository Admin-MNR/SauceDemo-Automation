package page_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base_Class.Base_Page;

public class Login_Page extends Base_Page {
	
	public Login_Page(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@placeholder=\"Username\"]")
	WebElement txt_UserName;
	
	@FindBy(xpath="//input[@placeholder=\"Password\"]")
	WebElement txt_Password;
	
	@FindBy(xpath="//input[@type=\"submit\"]")
	WebElement btn_Login;
	
	public void UserName(String name)
	{
		txt_UserName.clear();
		txt_UserName.sendKeys(name);
	}
	
	public void Password(String pwd)
	{
		txt_Password.clear();
		txt_Password.sendKeys(pwd);
	}
	
	public void click_Login()
	{
		btn_Login.click();
	}
}
