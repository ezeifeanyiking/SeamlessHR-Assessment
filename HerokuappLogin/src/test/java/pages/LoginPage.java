package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private static WebElement element = null;
	public static WebElement username(WebDriver driver) {
		element = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]"));
		return element;
	}
	
	public static WebElement password(WebDriver driver) {
		element = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/input[1]"));
		return element;
	}
	
	public static WebElement login_btn(WebDriver driver) {
		element = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/button[1]/i[1]"));
		return element;
	}
	
	public static WebElement message(WebDriver driver) {
		element = driver.findElement(By.id("flash"));
		return element;
	}

}
