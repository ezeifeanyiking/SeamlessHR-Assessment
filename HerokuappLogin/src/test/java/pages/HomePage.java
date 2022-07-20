package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private static WebElement element = null;
	public static WebElement form_authentication_link(WebDriver driver) {
		element = driver.findElement(By.linkText("Form Authentication"));
		return element;
	}

}
