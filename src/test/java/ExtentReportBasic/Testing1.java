package ExtentReportBasic;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.BaseClass.DwsBaseClass;

public class Testing1 extends DwsBaseClass {
	@Test
	public void main1() {
		Reporter.log("i am in the main", true);
		assertEquals("Thor", "Thar");
	}
	

}

