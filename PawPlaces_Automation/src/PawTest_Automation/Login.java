package PawTest_Automation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class Login {
	
	@Test
	public void LoginTest() {
		
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		 driver.get(UniversalLoginLocators.PawPlacesURL);
		 driver.manage().window().maximize();
		 //Click Login
		 wait.until(ExpectedConditions.elementToBeClickable(UniversalLoginLocators.LOGIN_BUTTON)).click();
		 
		 
		 wait.until(ExpectedConditions.elementToBeClickable(UniversalLoginLocators.EMAIL_FORM)).sendKeys("tajecit137@biowey.com");
		 
		 wait.until(ExpectedConditions.elementToBeClickable(UniversalLoginLocators.PASSWORD_FORM)).sendKeys("Asdf@1234");
		 
		 driver.findElement(UniversalLoginLocators.LOGIN_ACC_BUTTON).click(); //Login to account
		 
		 driver.quit();
		 
		 
	}
}
