package test;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;
import pages.LoginPage;

public class InvalidLogin {
	
private static WebDriver driver = null;
	
	@BeforeClass
	public void launchBrowser() {
		//Creating an object of ChromeDriver
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://the-internet.herokuapp.com");
	}
	
	@Test(priority = 1)
	public void Login() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		
		HomePage.form_authentication_link(driver).sendKeys(Keys.RETURN);
		LoginPage.username(driver).sendKeys("thomas");
		LoginPage.password(driver).sendKeys("SecretPassword!");
		LoginPage.login_btn(driver).click();
		
		// This will capture error message
		String message = LoginPage.message(driver).getText();
		String actual_msg = message.substring(0,25);
		    
		// Store message in variable
		String expect="Your username is invalid!";
		                

		// Verify error message
		Assert.assertEquals(actual_msg, expect);
		
	}

}

