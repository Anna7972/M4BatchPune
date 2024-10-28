package ExtentReportBasic;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.BaseClass.DwsBaseClass;

public class Testing4 extends DwsBaseClass {
	@Test
	public void main4() {
		Reporter.log("I am in main4", true);
	}

}
