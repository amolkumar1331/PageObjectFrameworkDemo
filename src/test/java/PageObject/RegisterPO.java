package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPO {

	@FindBy(id = "id_gender1")
	WebElement title;

	@FindBy(id = "customer_firstname")
	WebElement fname;

	@FindBy(id = "customer_lastname")
	WebElement lname;

	@FindBy(id = "passwd")
	WebElement password;

	@FindBy(id = "days")
	WebElement dobdate;

	@FindBy(id = "months")
	WebElement dobmonth;

	@FindBy(id = "years")
	WebElement dobyear;

	@FindBy(id = "firstname")
	WebElement firstname;

	@FindBy(id = "lastname")
	WebElement lastname;

	@FindBy(id = "address1")
	WebElement addres;

	@FindBy(id = "city")
	WebElement city;

	@FindBy(id = "id_state")
	WebElement state;

	@FindBy(id = "postcode")
	WebElement postcode;

	@FindBy(id = "id_country")
	WebElement coutry;

	@FindBy(id = "phone_mobile")
	WebElement mobile;

	@FindBy(id = "alias")
	WebElement alias;

	@FindBy(xpath = "//*[@id='submitAccount']/span")
	WebElement regibtn;

	public void register(String date, String month, String year, String fn, String ln, String firsna, String lastna,
			String post, String pass, String mob, String ali) {
		title.click();
		fname.sendKeys(fn);
		lname.sendKeys(ln);
		password.sendKeys(pass);
		Select sel = new Select(dobdate);
		sel.selectByValue(date);

		sel = new Select(dobmonth);
		sel.selectByValue(month);
		sel = new Select(dobyear);
		sel.selectByValue(year);

		firstname.sendKeys(firsna);
		lastname.sendKeys(lastna);
		addres.sendKeys();
		city.click();
		state.click();
		postcode.sendKeys(post);
		coutry.click();
		mobile.sendKeys(mob);
		alias.sendKeys(ali);
		regibtn.click();

	}

}
