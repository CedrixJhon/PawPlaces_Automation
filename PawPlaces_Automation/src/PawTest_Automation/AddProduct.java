package PawTest_Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AddProduct {
	
	@Test
	public void AddProductItem()  {
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
		 driver.get(UniversalLoginLocators.PawPlacesURL);
		 driver.manage().window().maximize();
		 //Click Login
		 wait.until(ExpectedConditions.elementToBeClickable(UniversalLoginLocators.LOGIN_BUTTON)).click();
		 
		 
		 wait.until(ExpectedConditions.elementToBeClickable(UniversalLoginLocators.EMAIL_FORM)).sendKeys("tajecit137@biowey.com");
		 
		 wait.until(ExpectedConditions.elementToBeClickable(UniversalLoginLocators.PASSWORD_FORM)).sendKeys("Asdf@1234");
	
		 
		 driver.findElement(UniversalLoginLocators.LOGIN_ACC_BUTTON).click(); //Login to account

		 //Click Product Dropdown
		 wait.until(ExpectedConditions.elementToBeClickable(UniversalLoginLocators.PRODUCT_MENU)).click();
		 wait.until(ExpectedConditions.elementToBeClickable(UniversalLoginLocators.PRODUCT_MENU_DP_RESULT)).click();
		 
		 wait.until(ExpectedConditions.elementToBeClickable(UniversalLoginLocators.ADDPRODUCT_BUTTON)).click(); //Click add product Button\
		 
		 //Create Product form
		 wait.until(ExpectedConditions.elementToBeClickable(UniversalLoginLocators.PRODUCT_NAME)).sendKeys("TestProduct"); //Product Name Field
		 wait.until(ExpectedConditions.elementToBeClickable(UniversalLoginLocators.BRAND_NAME)).sendKeys("TestBrandName"); //Brand Name Field
		 wait.until(ExpectedConditions.elementToBeClickable(UniversalLoginLocators.PRODUCT_DESCRIPTION)).sendKeys("TestPRoductDescription"); //Product Description Field
		 wait.until(ExpectedConditions.elementToBeClickable(UniversalLoginLocators.PRODUCT_PRICE)).sendKeys("250"); //Product Price Field
		 wait.until(ExpectedConditions.elementToBeClickable(UniversalLoginLocators.PRODUCT_DISCOUNT)).sendKeys("5"); //Product discount Field
		 wait.until(ExpectedConditions.elementToBeClickable(UniversalLoginLocators.IS_BESTSELLER)).click(); //isBestSeller checkbox
		 wait.until(ExpectedConditions.elementToBeClickable(UniversalLoginLocators.IS_AVAILABLE)).click(); //isBestSeller checkbox
		 wait.until(ExpectedConditions.elementToBeClickable(UniversalLoginLocators.PRODUCT_WEIGHT)).sendKeys("5"); //Product weight Field
		 wait.until(ExpectedConditions.elementToBeClickable(UniversalLoginLocators.PRODUCT_QUANTITY)).sendKeys("40"); //Product quantity Field
		 
		 wait.until(ExpectedConditions.elementToBeClickable(UniversalLoginLocators.PRODUCT_CATEGORY)).click(); //Click Product SubCategory
		 wait.until(ExpectedConditions.elementToBeClickable(UniversalLoginLocators.SELECTED_CATEGORY)).click();
		 
		// wait.until(ExpectedConditions.elementToBeClickable(UniversalLoginLocators.PRODUCT_SUBCATEGORY)).click();
		// wait.until(ExpectedConditions.elementToBeClickable(UniversalLoginLocators.SELECTED_SUBCATEGORY)).click();
		 
		  driver.quit();
	}
}
