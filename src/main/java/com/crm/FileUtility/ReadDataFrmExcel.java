package com.crm.FileUtility;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class ReadDataFrmExcel {
	@Test
	public static void Login() throws EncryptedDocumentException, IOException {
		String email = ExcelFile.excel("Sheet1", 0, 0);
		System.out.println(email);
		String pass=ExcelFile.excel("Sheet1", 0, 1);
		System.out.println(pass);
	}

}
