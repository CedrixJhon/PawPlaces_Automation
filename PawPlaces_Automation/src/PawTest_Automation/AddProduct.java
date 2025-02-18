package PawTest_Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AddProduct {
	
	@Test
	public void AddProductItem() throws InterruptedException, AWTException  {
		
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
		 
		 wait.until(ExpectedConditions.elementToBeClickable(UniversalLoginLocators.PRODUCT_SUBCATEGORY)).click();
		 wait.until(ExpectedConditions.elementToBeClickable(UniversalLoginLocators.SELECTED_SUBCATEGORY)).click();//Click SubCategory Product
		 
		
		 
		 Thread.sleep(3000);
	
		 
	        
	         

	            // Step 5: Locate the hidden button element
	            WebElement hiddenButton = driver.findElement(By.cssSelector("label[for='multi']"));


	            // Step 6: Use JavaScript to make the button visible
	            JavascriptExecutor js = (JavascriptExecutor) driver;
	            js.executeScript("arguments[0].classList.remove('hidden');", hiddenButton);
	            js.executeScript("arguments[0].style.display = 'block';", hiddenButton);

	            // Step 7: Click the button to trigger the file selection dialog
	           // hiddenButton.click();
	            js.executeScript("arguments[0].click();", hiddenButton);

	            // Step 8: Handle the file selection dialog (this part depends on your browser and OS)
	            // Note: Selenium cannot directly interact with native OS dialogs (e.g., file selection dialogs).
	            // You may need to use tools like AutoIT or Robot Class for this step.
	            String filePath = "C:\\Selenium Web Driver\\WebDrivers\\testproduct.jpg"; // Replace with the actual file path
	            Robot robot = new Robot();
	            robot.delay(2000); // Wait for the file selection dialog to appear

	            // Simulate typing the file path
	            StringSelection stringSelection = new StringSelection(filePath);
	            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

	            // Paste the file path (Ctrl+V)
	            robot.keyPress(KeyEvent.VK_CONTROL);
	            robot.keyPress(KeyEvent.VK_V);
	            robot.keyRelease(KeyEvent.VK_V);
	            robot.keyRelease(KeyEvent.VK_CONTROL);

	            // Press Enter to confirm the file selection
	            robot.keyPress(KeyEvent.VK_ENTER);
	            robot.keyRelease(KeyEvent.VK_ENTER);
	            
	    
	          wait.until(ExpectedConditions.elementToBeClickable(UniversalLoginLocators.SAVE_BUTTON)).click();
	        
	            // Close the browser
	         //   driver.quit();
	        }
		 
		
		 
		 
	
}
