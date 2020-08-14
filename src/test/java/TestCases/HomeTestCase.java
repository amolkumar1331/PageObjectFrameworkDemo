package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import BasePkg.BaseClass;
import PageObject.HomePO;

public class HomeTestCase extends BaseClass {

	@Test
	public void m1() {

		HomePO hp = PageFactory.initElements(driver, HomePO.class); 																	// HomePO(driver);
		hp.clickonSignin();

	}

}
