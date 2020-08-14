package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccoutPO {

	@FindBy(id = "email_create")
	WebElement emailtxt;

	@FindBy(xpath = "//*[@id='SubmitCreate']/span")
	WebElement cretaccbtn;

	public void signup() {
		emailtxt.sendKeys("amolk1@gmail.com");
		cretaccbtn.click();
	}

}
