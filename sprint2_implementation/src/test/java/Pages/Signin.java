package Pages;

import BrowserEbay.BrowserEbay;


public class Signin extends BrowserEbay {
	
	
	//click login button
	public static void clickLogin()
	{
			locator.Locator.loginLoginButton().click();
	}
	public static void enterCredentials()
	{
		locator.Locator.loginEmailTextbox().click();
		locator.Locator.loginEmailTextbox().sendKeys("aparnagore23@gmail.com");

		locator.Locator.ContinueButton().click();
	}
	public static void Pass() {
		locator.Locator.loginPasswordTextbox().sendKeys("Abc@1234");
		
	}
	public static void SigninButton() {
		locator.Locator.SignInButton().click();
	}
	
	}
	
  

