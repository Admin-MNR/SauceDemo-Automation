package TestClasses;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.*;
import Utilities.LoginDataProvider;
import page_Classes.Add_Products_Page;
import page_Classes.CheckOut_Info_Page;
import page_Classes.Login_Page;
import page_Classes.ValidateCart_Page;
import page_Classes.ValidateOrderSummary_Page;
import page_Classes.VerifyAndLogout_Page;

public class TestClass extends BaseClass {

	@Test(dataProvider="LoginData",dataProviderClass=LoginDataProvider.class)
	public void login(String username,String pwd,String fname,String lname,String code)
	{
		Login_Page lp=new Login_Page(driver);
		lp.UserName(username);
		lp.Password(pwd);
		lp.click_Login();

		Add_Products_Page app=new Add_Products_Page(driver);
		boolean verify=app.verify_Login();
		Assert.assertTrue(verify, "Login Failed!...");
		List<String> addedProducts=app.addProductsToCart();
		app.click_Cart();

		ValidateCart_Page vcp=new ValidateCart_Page(driver);
		List<String> cartProducts=vcp.addedCartItems();
		Assert.assertEquals(cartProducts, addedProducts, "Cart items do not match added products");
		vcp.click_CheckOut();

		CheckOut_Info_Page cip=new CheckOut_Info_Page(driver);
		cip.firstName(fname);
		cip.lastName(lname);
		cip.postalCode(code);
		cip.click_Continue();

		ValidateOrderSummary_Page vosp=new ValidateOrderSummary_Page(driver);
		List<String> summaryItems=vosp.summaryProducts();
		Assert.assertEquals(summaryItems, cartProducts, "Summary items do not match cart items");
		vosp.click_Finish();

		VerifyAndLogout_Page logout=new VerifyAndLogout_Page(driver);
		String cnfrm_msg=logout.confirmation_msg();
		Assert.assertEquals(cnfrm_msg, "Thank you for your order!");
		logout.click_OpenMenu();
		logout.click_Logout();

		System.out.println("**********"+cnfrm_msg+"**********");

	}
}
