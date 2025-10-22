package page_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base_Class.Base_Page;

public class CheckOut_Info_Page extends Base_Page {

	public CheckOut_Info_Page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@name=\"firstName\"]")
	WebElement first_Name;

	@FindBy(xpath="//input[@name=\"lastName\"]")
	WebElement last_Name;
	
	@FindBy(xpath="//input[@name=\"postalCode\"]")
	WebElement postal_Code;
	
	@FindBy(xpath="//input[@name=\"continue\"]")
	WebElement btn_Continue;
	
	public void firstName(String fName)
	{
		first_Name.sendKeys(fName);
	}
	
	public void lastName(String lName)
	{
		last_Name.sendKeys(lName);
	}
	
	
	public void postalCode(String pinCode)
	{
		postal_Code.sendKeys(pinCode);
	}
	
	public void click_Continue()
	{
		btn_Continue.click();
	}
}
