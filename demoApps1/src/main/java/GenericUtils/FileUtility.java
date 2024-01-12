package GenericUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileUtility {
	public String fatchDataFromProperityFile(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Ankit\\Desktop\\Automation\\Automation\\TestData\\CommonData.properties");
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}
	public String fatchStringDataFromExcelSheet(String sheetName,int rowNo, int cellNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Ankit\\Desktop\\Automation\\Automation\\TestData\\book1.xlsx");
		return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();
	}
//	public double fatchNumericDataFromExcelSheet(String sheetName,int rowNo, int cellNo) throws EncryptedDocumentException, IOException
//	{
//		FileInputStream fis=new FileInputStream("C:\\Users\\Ankit\\Desktop\\Automation\\Automation\\TestData\\book1.xlsx");
//		return WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNo).getCell(cellNo).getNumericCellValue();
//	}

}
