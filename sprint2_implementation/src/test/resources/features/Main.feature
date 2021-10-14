#BuyProduct
@login
Feature: feature to test the  Buy Product module functionality
Scenario: To validate the sign in functionality using personal account
Given user is on main home page
And user navigates to login page
When user enters the valid email address
And user enters the valid password
When user clicks on login button
Then login must be successful

@Search
Scenario: To validate if the search section is working.
Given User is on home page.
Then User selecting product and add to cart.

@Billing_Address
Scenario: To validate if the Billing Address section is working.
Given User having valid Billing Address details.
When User is Filling Manual Address Section.
And User is entering the Mobile Number.
Then User is hitting Go to Checkout Button.

@Payment
Scenario: To validate if the payment section is working.
Given User is on checkout page of Ebay.
And User is selecting the pay with card section.
And User is selecting paypal.
#And User is selecting paypal credits.
#And User is selecting UPI method for payment.
Then User is hitting the save button.

#@Shipping_Address
#Scenario: To validate if the Shipping Address section is working.
#Given User having valid Shipping Address details.
#When User is on Shipping Address.
#Then User is on Review Section.

@Review
Scenario: To validate if the Review are working.
Given User having valid Delivery details.
When User is on Checkout Page.
And User is Selecting Quantity Options.
Then User is selected the valid Option.

@Coupon
Scenario: To validate if the Coupon  are working.
Given User having valid Coupon Code.
When User is Entering Coupon on  Page.
Then User id hitting Apply Button.

@Donate
Scenario: To validate if the Donate Charity section is working.
Given User selected the item from ebay.
When User is selecting the options for donation.
Then User Click on Confirm and Pay .

