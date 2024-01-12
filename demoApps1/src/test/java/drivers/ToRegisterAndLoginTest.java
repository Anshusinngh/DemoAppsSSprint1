package drivers;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericUtils.BaseClass;
import GenericUtils.FileUtility;
import POM.Registration2Page;

public class ToRegisterAndLoginTest  extends BaseClass {
	@Test(priority=1)
	public void toRegister() throws EncryptedDocumentException, IOException 
	{
	FileUtility f=new FileUtility();

	String name=f.fatchStringDataFromExcelSheet("sheet1", 0, 0);
	String email=f.fatchStringDataFromExcelSheet("sheet1", 0, 1);
	String password=f.fatchStringDataFromExcelSheet("sheet1", 0, 2);
	Registration2Page register=new Registration2Page(driver);
	register.registerUser(name,email,password);
	}

}
