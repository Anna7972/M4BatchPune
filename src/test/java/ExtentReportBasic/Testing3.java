package ExtentReportBasic;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.BaseClass.DwsBaseClass;

public class Testing3 extends DwsBaseClass{
	@Test
	public void main3() {
		Reporter.log("I am in main3", true);
		assertEquals("main2", "main3");
	}

}
