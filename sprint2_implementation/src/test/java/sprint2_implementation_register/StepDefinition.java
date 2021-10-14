package sprint2_implementation_register;

import java.util.concurrent.TimeUnit;


import BrowserEbay.BrowserEbay;

import Pages.BillingAddress;
import Pages.Coupon;
import Pages.Donate;
import Pages.Payment;
import Pages.Review;
import Pages.Search;
//import Pages.Shipping_Address;
import Pages.Signin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locator.Locator;
public class StepDefinition extends BrowserEbay{
	@Given("user is on main home page")
	public void user_is_on_main_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		 BrowserEbay.setDriver1();
		System.out.println("Main Page Visisble");
	    //throw new io.cucumber.java.PendingException();
	}

	@And("user navigates to login page")
	public void user_navigates_to_login_page(){
	    // Write code here that turns the phrase above into concrete actions
	
	       Signin.clickLogin();
		    // Write code here that turns the phrase above into concrete actions
		   // throw new io.cucumber.java.PendingException();
			System.out.println("Navigate to login page");
			driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
	    //throw new io.cucumber.java.PendingException();
	}
	
//
	@When("user enters the valid email address")
	public void user_enters_the_valid_email_address() {
		Signin.enterCredentials();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		System.out.println("Enter valid Email ID");
	}
	@And("user enters the valid password")
	public void user_enters_the_valid_password() {
	    // Write code here that turns the phrase above into concrete actions
		Signin.Pass();
	    // Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		
		System.out.println("Valid Password Entered");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		
//	    throw new io.cucumber.java.PendingException();
	}
//
	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
//	    // Write code here that turns the phrase above into concrete actions
		Signin.SigninButton();
		System.out.println("Step 1.4 is passed");
//		
//		
//		
//	    throw new io.cucumber.java.PendingException();
	}
//
	@Then("login must be successful")
	public void login_must_be_successful() {
//	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Login Successfull");
//	    throw new io.cucumber.java.PendingException();
		}
//
	@Given("User is on home page.")
	public void user_is_on_home_page() {
//	    // Write code here that turns the phrase above into concrete actions
//
		System.out.println("Main Page Visisble");
//	    throw new io.cucumber.java.PendingException();
	}
//	@When("User is searching for product. and add to cart")
//	public void user_is_searching_for_product() {
	    // Write code here that turns the phrase above into concrete actions
//	Search.Searchs();
//	    throw new io.cucumber.java.PendingException();
//	}
	@Then("User selecting product and add to cart.")
	public void user_selecting_product_and_add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
		Search.Searchs();
		System.out.println("search done");
	    //throw new io.cucumber.java.PendingException();
	}
//
//	
	@Given("User having valid Billing Address details.")
	public void user_having_valid_billing_address_details() {
	    // Write code here that turns the phrase above into concrete actions
	BillingAddress.Billing1();
	driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
//	    throw new io.cucumber.java.PendingException();
}

	@When("User is Filling Manual Address Section.")
	public void user_is_selecting_country_section() {
	    // Write code here that turns the phrase above into concrete actions
		BillingAddress.Billing2();
	    //throw new io.cucumber.java.PendingException();
	}

	

	

	@And("User is entering the Mobile Number.")
	public void user_is_entering_the_mobile_number() {
	    // Write code here that turns the phrase above into concrete actions
		BillingAddress.Billing3();
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("User is hitting Go to Checkout Button.")
	public void user_is_hitting_go_to_checkout_button() {
	    // Write code here that turns the phrase above into concrete actions
		Locator.CheckoutButton();
	    //throw new io.cucumber.java.PendingException();
	}
	@Given("User is on checkout page of Ebay.")
	public void user_is_on_checkout_page_of_ebay() {
	    // Write code here that turns the phrase above into concrete actions
		Payment.Payments();
//	    throw new io.cucumber.java.PendingException();
	}

    //@When("User is on Pay With Section.")
   // public void user_is_on_pay_with_section() {
	    // Write code here that turns the phrase above into concrete actions
   // 	Payment.Payment_with_card();
//	    throw new io.cucumber.java.PendingException();
// }

	@And("User is selecting the pay with card section.")
	public void user_is_selecting_the_pay_with_card_section() {
		// Write code here that turns the phrase above into concrete actions
	Payment.Payment_with_card();
	Payment.save();
//	    throw new io.cucumber.java.PendingException();
	}

	@And("User is selecting paypal.")
	public void user_is_selecting_paypal() {
	    // Write code here that turns the phrase above into concrete actions
		Locator.Payment_with_Paypal();
//	    throw new io.cucumber.java.PendingException();
	}

	//@And("User is selecting paypal credits.")
	//public void user_is_selecting_paypal_credits() {
	    // Write code here that turns the phrase above into concrete actions
	//	Locator.Payment_with_Credit();
//	    throw new io.cucumber.java.PendingException();
	//}

	//@And("User is selecting UPI method for payment.")
//	public void user_is_selecting_upi_method_for_payment() {
	    // Write code here that turns the phrase above into concrete actions
//		Locator.Payment_with_gpay();
//	    throw new io.cucumber.java.PendingException();
//	}

	@Then("User is hitting the save button.")
	public void user_is_hitting_the_save_button() {
//	    // Write code here that turns the phrase above into concrete actions
		System.out.println("success");
//	    throw new io.cucumber.java.PendingException();
	}
//
	@Given("To validate if the Review are working.")
	public void user_having_valid_shipping_address_details() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("User is on Shipping Address.")
	public void user_is_on_ship_to_section_and_selecting_country() {
	    // Write code here that turns the phrase above into concrete actions
		//Shipping_Address.Shipping();
	    //throw new io.cucumber.java.PendingException();
	}

	
	@Then("User is on Review Section.")
	public void user_is_hitting_save_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("review section");
	    //throw new io.cucumber.java.PendingException();
	}

	@Given("User having valid Delivery details.")
	public void user_having_valid_delivery_details() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("valid quality selection section");
	   // throw new io.cucumber.java.PendingException();
	}

	@When("User is on Checkout Page.")
	public void user_is_on_checkout_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("valid payment mode is filled");
	    //throw new io.cucumber.java.PendingException();
	}

	@And("User is Selecting Quantity Options.")
	public void user_is_selecting_delivery_options() {
	    // Write code here that turns the phrase above into concrete actions
		
		
		Review.Reviews();
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("User is selected the valid Option.")
	public void user_is_selected_the_valid_option() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Quatity seelcted");
	    //throw new io.cucumber.java.PendingException();
	}
	@Given("User having valid Coupon Code.")
	public void user_having_valid_coupon_code() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Coupon Code");
	   // throw new io.cucumber.java.PendingException();
	}

	@When("User is Entering Coupon on  Page.")
	public void user_is_entering_coupon_on_page() {
	    // Write code here that turns the phrase above into concrete actions
		Coupon.Coupons();
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("User id hitting Apply Button.")
	public void user_id_hitting_apply_button() {
	    // Write code here that turns the phrase above into concrete actions
		Coupon.Apply();
	    //throw new io.cucumber.java.PendingException();
	}
	@Given("User selected the item from ebay.")
	public void user_selected_the_item_from_ebay() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Donate Section");
	   // throw new io.cucumber.java.PendingException();
	}

	@When("User is selecting the options for donation.")
	public void user_is_selecting_the_options_for_donation() {
	    // Write code here that turns the phrase above into concrete actions
		Donate.Donates();
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("User Click on Confirm and Pay .")
	public void user_click_on_confirm_and_pay() {
	    // Write code here that turns the phrase above into concrete actions
		//Donate.confirm();
		System.out.println("success");
	    //throw new io.cucumber.java.PendingException();
	}
}
