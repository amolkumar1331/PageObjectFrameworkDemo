package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePO {

	@FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
	WebElement signInbtn;

	public void clickonSignin() {
		signInbtn.click();
	}
}
