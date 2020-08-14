package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BasePkg.BaseClass;
import PageObject.AccoutPO;

public class AccoutTest extends BaseClass {

	@Test
	public void signupAcc() {

		AccoutPO ac = PageFactory.initElements(driver, AccoutPO.class);
		ac.signup();
	}

}
