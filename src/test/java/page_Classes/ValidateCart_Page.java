package page_Classes;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base_Class.Base_Page;

public class ValidateCart_Page extends Base_Page {

	public ValidateCart_Page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//button[@name=\"checkout\"]")
	WebElement btn_checkout;

	@FindBy(className = "cart_item")
	List<WebElement>cartitems;
	
	public List<String> addedCartItems()
	{
		List<String>cartProducts=new ArrayList<>();
		for(WebElement ele:cartitems)
		{
			cartProducts.add(ele.findElement(By.className("inventory_item_name")).getText());
		}
		
		return cartProducts;
	}
	
	public void click_CheckOut()
	{
		btn_checkout.click();
	}


}
