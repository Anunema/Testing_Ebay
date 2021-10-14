package BrowserEbay;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import Pages.RegisterBusinessAccount;
//import Pages.RegisterPersonalAccount;
//import Pages.SignUpPage;

public class BrowserEbay {

	public static WebDriver driver;
	//Browser setup
	public static void setDriver1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\selenium\\chromedriver.exe");
	     driver = new ChromeDriver();	
	     driver.get("https://www.ebay.com/");
	     driver.manage().window().maximize();
	}
}

