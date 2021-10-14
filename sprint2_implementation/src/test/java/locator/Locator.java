package locator;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import BrowserEbay.BrowserEbay;


public class Locator  extends BrowserEbay{

	public static WebElement loginLoginButton()
	{
		WebElement login_login_button = driver.findElement(By.xpath("//*[@id=\"gh-ug\"]/a"));
		
		return login_login_button;

	}
	
	public static WebElement loginEmailTextbox ()
	{

		WebElement login_email_textbox = driver.findElement(By.xpath("//*[@id=\"userid\"]"));
		return login_email_textbox;

	}
	public static WebElement ContinueButton ()
	{

		WebElement Continue = driver.findElement(By.xpath("//*[@id=\"signin-continue-btn\"]"));
		return Continue;

	}
	
	
	public static WebElement loginPasswordTextbox ()
	{
		WebElement login_password_textbox = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		return login_password_textbox;

	}
	
	
	public static WebElement SignInButton()
	{
		WebElement SignInButton = driver.findElement(By.xpath("//*[@id=\"sgnBt\"]"));
		
		return SignInButton;

	}
	
	
	

	
	public static void Search()  {
		driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("pen");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	driver.findElement(By.xpath("//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/a/h3")).click();
	//driver.findElement(By.xpath("//*[@id=\"binBtn_btn\"]"));
	String parent = driver.getWindowHandle();
	System.out.println("parent "+parent);
	
	System.out.println(driver.getTitle());
	for (String child:driver.getWindowHandles()) {
		driver.switchTo().window(child);
	}
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//*[@id=\"binBtn_btn\"]")).click();
}
	public static void Billing_details() {
		driver.findElement(By.id("addressSugg")).click();
		driver.findElement(By.id("addressSugg_manualEntryLink")).click();
	}
	public static void Billing_manual_Address() {
		driver.findElement(By.id("address1")).sendKeys("3369 Larry Street");

		driver.findElement(By.id("city")).sendKeys("San Francisco");
		Select state = new Select(driver.findElement(By.id("state")));
		state.selectByVisibleText("California");
		driver.findElement(By.xpath("//*[@id=\"zip\"]")).sendKeys("94143");
		
	}
	public static void Billing_Number() {
		
		driver.findElement(By.id("phoneFlagComp1")).sendKeys("4152274153");
	}
	public static void CheckoutButton() {
		Actions act = new Actions(driver);
		WebElement g = driver.findElement(By.id("sbtBtn"));
		act.doubleClick(g).perform();
	}
	public static void Payment_RadioButton() {
		
		driver.findElement(By.id("selectable-render-summary2")).click();
	}
	public static void Payment_with_cart() {
		driver.findElement(By.id("cardNumber")).sendKeys("5105105105105100");
		driver.findElement(By.name("cardExpiryDate")).sendKeys("06/04");
		driver.findElement(By.id("securityCode")).sendKeys("1234");
		driver.findElement(By.name("cardHolderFirstName")).sendKeys("Anu");
		driver.findElement(By.name("cardHolderLastName")).sendKeys("Nema");
	}
	public static void Save() {
		driver.findElement(By.xpath("//*[@id=\"credit-card-details\"]/div/div/div[1]/button")).click();
	}
	public static void Payment_with_Paypal() {
		//Paypal
		
		driver.findElement(By.xpath("//*[@id=\"selectable-render-summary3\"]")).click();
	}
	//public static void Payment_with_Credit() {
		//paypal Credit
		
		//driver.findElement(By.xpath("//*[@id=\"selectable-render-summary4\"]")).click();
	//}
//	public static void Payment_with_gpay() {
//		//google pay
//		
//		driver.findElement(By.xpath("//*[@id=\"selectable-render-summary5\"]")).click();
//		
//		
//	}
	public static void Shipping() {
		//if users shipping and billing address is not same then this option is valid.
		//driver.findElement(By.linkText("Change")).click();
		//driver.findElement(By.linkText("Edit")).click();
		//driver.findElement(By/linkText("Add a new address")).click();
	}
	public static void Review() {
		Select s = new Select(driver.findElement(By.name("qty-BId-{\"ItemId\":\"224596686689\"};Domain-ebay;LId-420002")));
		s.selectByVisibleText("2");

	}
	public static void Coupon() {
		driver.findElement(By.name("redemptionCode")).sendKeys("SAVESPOOKY15");
	}
	public static void Coupon_apply() {
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[2]/div/div[1]/section[4]/div/form/div[1]/div[2]/button")).click();
		
	}
	public static void Donate() {
		Select d = new Select(driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[2]/div/div[1]/section[5]/div[2]/span/select")));
		d.selectByVisibleText("US $2.00");
	}
//	public static void buy_Button() {
//		driver.switchTo().frame(driver.findElement(By.name("__detect_close_uid_d6d9b795f5_mdq6mzc6mjy__")));
//		driver.switchTo().frame(driver.findElement(By.name("srt")));
//		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
//		driver.findElement(By.xpath("//*[@id=\"buttons-container\"]/div/div/div")).click();
//		
//	}
}
