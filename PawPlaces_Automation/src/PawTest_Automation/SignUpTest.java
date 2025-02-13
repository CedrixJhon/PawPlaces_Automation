package PawTest_Automation;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SignUpTest {
	@Test
	public void SignupPageStart() throws InterruptedException  {
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); 
		
		 String randomName = randomNameGenerator.getRandomString(8);
			
		 driver.get(UniversalLoginLocators.PawPlacesURL);
		 driver.manage().window().maximize();   
		        //Signup with email
		        WebElement SignUpEmailBtn =driver.findElement(By.xpath("//button[contains(text(),'Sign up with email')]"));
		        SignUpEmailBtn.click();
		        
		       //FirstName field
		        driver.findElement(By.id("firstName")).sendKeys(randomName);
		       //LastNamefield
		        driver.findElement(By.id("lastName")).sendKeys(randomName);
		        
		        //Switch to new tab to get tempmail      
		        // Open a new tab using JavaScript
		        ((JavascriptExecutor) driver).executeScript("window.open();");
		        Thread.sleep(2000);
		        
		        // Get all window handles (tabs)
		        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		     
		        // Switch to the new tab (second tab)
		        driver.switchTo().window(tabs.get(1));
		        driver.get("https://temp-mail.io/en"); // Open a URL in the new tab
		        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
		        element.click();
		        
		        // Switch back to the first tab
		        driver.switchTo().window(tabs.get(0));
		        
		        //Click email box to begin pasting
		        WebElement emlField = driver.findElement(By.id("email"));
		        emlField.click();
		        
		        Actions actions = new Actions(driver);
		        actions.click(emlField).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
		       
		        
		        //Input password
		       WebElement password = driver.findElement(By.id("password"));
		       password.sendKeys("Password@123");
		    
		        
		        //Click Create account button
		        WebElement button = driver.findElement(By.xpath("//button[contains(text(), 'Create PawPlaces account')]"));
		        button.click();

		        //Switch back to the new tab for email confirmation
		        driver.switchTo().window(tabs.get(1));
		        
		        Thread.sleep(10000);
		        //Click verify emaill sent
		        //WebElement verifAcc =driver.findElement(By.xpath("//span[contains(text(), 'Verify Account')]"));
		        WebElement verifAcc = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'Verify Account')]")));
		        verifAcc.click();
		     
		        //Confirm email
		        WebElement confirmEmailLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn-primary']/a[contains(text(), 'Confirm Email')]")));
		        confirmEmailLink.click();
		        driver.quit();
	}
}
