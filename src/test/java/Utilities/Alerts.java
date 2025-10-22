package Utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class Alerts {



	public static boolean handleAlertIfPresent(WebDriver driver) {
		try {
			Alert alert = driver.switchTo().alert();
			System.out.println("Alert appeared: " + alert.getText());
			alert.accept();  // Click OK
			return true;     // alert was present
		} catch (NoAlertPresentException e) {
			return false;    // no alert appeared
		}


	}
}
