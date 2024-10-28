package Task;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginUsingExcel {
	@BeforeMethod
	public static void excelMethod() throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("../com.crm.AdvanceSeleniumM4/src/test/resources/Task1.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	Sheet sheet=wb.getSheet("Sheet1");
	String email = sheet.getRow(0).getCell(0).toString();
	String pass=sheet.getRow(0).getCell(1).toString();
	System.out.println(email);
	System.out.println(pass);
	}
}
