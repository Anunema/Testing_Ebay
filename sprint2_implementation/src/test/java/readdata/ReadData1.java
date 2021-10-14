package readdata;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData1 {

	public static String readExcel(int row , int column) {
		String TestData=null;
		try{
			String filePath = System.getProperty("user.dir")+"//Excel//TestData.xlsx";
			FileInputStream file = new FileInputStream(filePath);
			XSSFWorkbook wb = new XSSFWorkbook(file);
			XSSFSheet ws = wb.getSheetAt(0);
			TestData = String.valueOf(ws.getRow(row).getCell(column));
			//System.out.println(testData);
		}
		catch(Exception e)
		{
			System.out.println("Read excel");
		}
		return TestData;
}
	public static String config(String dt) {
		try {
			String filelocation = System.getProperty("user.dir") + "\\Application_Configuration\\config.properties";
			File file = new File(filelocation);
			FileInputStream fileinput = new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fileinput);
			String data= prop.getProperty(dt);
			return data;
		}
		catch(Exception e)
		{
			System.out.println("Read ");
			}
		return null;
		
	}
}
