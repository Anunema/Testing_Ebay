package TestingConfig;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import testingconfig.ChromeDriver;

public class GetConfigt {

	public static String readExcel(int row , int column) {
		String TestData=null;
		try{
			String filePath = System.getProperty("user.dir")+"//Excel//TestData.xlsx";
			FileInputStream file = new FileInputStream(filePath);
			XSSFWorkbook wb = new XSSFWorkbook(file);
			XSSFSheet ws = wb.getSheetAt(0);
			TestData = String.valueOf(ws.getRow(row).getCell(column));
			System.out.println(TestData);
		}
		catch(Exception e)
		{
			System.out.println("Read excel");
		}
		return TestData;
		
	}
	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\APGORE\\OneDrive - Capgemini\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
	try {
		String filelocation = System.getProperty("user.dir") + "\\Application_Configuration\\config.properties";
		File file = new File(filelocation);
		FileInputStream fileinput = new FileInputStream(file);
		Properties prop = new Properties();
		prop.load(fileinput);
		driver.get(prop.getProperty("https://www.ebay.com/")); //https://www.kohls.com/
	    driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//System.out.println(prop.getProperty("url"));
		//System.out.println(prop.getProperty("report_name"));
		//System.out.println(prop.getProperty("search_btn"));
	//	System.out.println(prop.getProperty("reset_btn"));
	//	System.out.println(prop.getProperty("delete_btn"));
	//	System.out.println(prop.getProperty("run_btn"));
	//	readExcel(0, 3);
		//driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("fuffcku");;
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Aparna");
		}catch(Exception e)
		{
		System.out.println("URL Method");
		}
}
}
