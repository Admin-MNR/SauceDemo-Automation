package page_Classes;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base_Class.Base_Page;

public class Add_Products_Page extends Base_Page {

	public Add_Products_Page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//span[text()=\"Products\"]")
	WebElement title;

	@FindBy(xpath="//a[@class=\"shopping_cart_link\"]")
	WebElement btn_cart;
	
	@FindBy(className = "inventory_item")
	List<WebElement>products;
	
	public void click_Cart()
	{
		btn_cart.click();
	}
	
	public boolean verify_Login()
	{
		try
		{
			return title.isDisplayed();
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	
	public  List<String> addProductsToCart()
	{
		List<String>addedProducts=new ArrayList<>();
		for(WebElement ele:products)
		{
			String item=ele.findElement(By.className("inventory_item_name")).getText();
			WebElement addtocart=ele.findElement(By.tagName("button"));
			if(addedProducts.size()<2)
			{
				addedProducts.add(item);
				addtocart.click();
			}
		}
		
		return addedProducts;
	}
	
}
