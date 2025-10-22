package page_Classes;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base_Class.Base_Page;

public class ValidateOrderSummary_Page extends Base_Page {

	public ValidateOrderSummary_Page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//button[@name=\"finish\"]")
	WebElement btn_Finish;
	
	@FindBy(className = "cart_item")
	List<WebElement>summaryitems;
	
	public List<String> summaryProducts()
	{
		List<String>summaryProducts=new ArrayList<>();
		for(WebElement ele:summaryitems)
		{
			summaryProducts.add(ele.findElement(By.className("inventory_item_name")).getText());
		}
		
		return summaryProducts;
	}
	
	public void click_Finish()
	{
		btn_Finish.click();
	}

}
