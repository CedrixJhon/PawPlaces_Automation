package PawTest_Automation;

import org.openqa.selenium.By;

public class UniversalLoginLocators {
	//Login
	public static final String PawPlacesURL = "https://portal.pawplaces.app/";
	public static final By LOGIN_BUTTON = By.linkText("Login →");
	public static final By EMAIL_FORM = By.id("email");
	public static final By PASSWORD_FORM = By.id("password");
	public static final By LOGIN_ACC_BUTTON = By.xpath("//button[contains(text(),'Login to your account')]");
	
	
	//After login
	
	public static final By PRODUCT_MENU = By.cssSelector("button[aria-controls='products-dropdown-merchant']");
	public static final By PRODUCT_MENU_DP_RESULT = By.cssSelector("a[href='/portal/merchant/products']");
	public static final By ADDPRODUCT_BUTTON = By.cssSelector("button[routerlink='/portal/merchant/products/add-product']");
	
	//Add Product form
	public static final By PRODUCT_NAME = By.id("productName");
	public static final By BRAND_NAME = By.id("brandName");
	public static final By PRODUCT_DESCRIPTION = By.id("productDescription");
	public static final By PRODUCT_PRICE = By.id("productPrice");
	public static final By PRODUCT_DISCOUNT = By.id("productDiscount");
	public static final By IS_BESTSELLER = By.id("isBestSeller");
	public static final By IS_AVAILABLE = By.id("isAvailable");
	public static final By PRODUCT_WEIGHT = By.id("productWeight");
	public static final By PRODUCT_QUANTITY = By.id("productQuantity");
	public static final By PRODUCT_CATEGORY = By.name("productCategory");

	public static final By SELECTED_CATEGORY = By.xpath("//option[text()='Food and Treats']");
	public static final By PRODUCT_SUBCATEGORY = By.cssSelector("label[for='productSubCategoryId']");
	
	public static final By SELECTED_SUBCATEGORY = By.xpath("//option[text()='Raw food']");
	
	
}