package ExtentReportBasic;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.crm.BaseClass.DwsBaseClass;

public class Testing5 extends DwsBaseClass{
	@Test
	public void main5() {
		Reporter.log("I am in main5", true);
	}

}
