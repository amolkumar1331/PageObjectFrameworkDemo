package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BasePkg.BaseClass;
import ExcelOperation.ExcelRead;
import PageObject.RegisterPO;

public class RegisterTestCases extends BaseClass {

	@Test(dataProvider = "testdata")
	public void Reg(String date,String month,String year,String fn, String ln, String firsna, String lastna, String post, String pass, String mob,
			String ali) {
		RegisterPO rp = PageFactory.initElements(driver, RegisterPO.class);
		rp.register(date, month,year,fn, ln, firsna, lastna, post, pass, mob, ali);
	}

	@DataProvider
	public Object[][] testdata() throws IOException {

		ExcelRead e = new ExcelRead();
		Object[][] obj = e.getData();

		return obj;
	}

}
