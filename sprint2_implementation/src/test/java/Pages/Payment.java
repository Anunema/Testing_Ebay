package Pages;

import locator.Locator;



public class Payment{
	
	public static void Payments() {

	Locator.Payment_RadioButton();
	}
	public static void Payment_with_card(){
	Locator.Payment_with_cart();
	}
	public static void save() {
		Locator.Save();
	}
	//public static void Payment_with_credit() {
	//Locator.Payment_with_Credit();
	//}
	public static void Payment_paypal() {
	Locator.Payment_with_Paypal();
	}
//	public static void Payment_with_gpay() {
//		Locator.Payment_with_gpay();
//	}
}
		
	
	

