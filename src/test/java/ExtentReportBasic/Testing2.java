package ExtentReportBasic;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.BaseClass.DwsBaseClass;

public class Testing2 extends DwsBaseClass {
	@Test
	public void main2() {
		Reporter.log("I am in main2", true);
	}

}
