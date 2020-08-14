package BasePkg;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static FileInputStream fp;
	public static Properties prop;

	@BeforeSuite
	public void launchBrowser() throws IOException {
		fp = new FileInputStream("D:\\Class\\PageObjectFramewor\\src\\test\\java\\Resource\\config.properties");
		prop = new Properties();
		prop.load(fp);
		if (prop.get("Browser").equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\Class\\PageObjectFramewor\\src\\test\\java\\Resource\\chromedriver_Version83.exe");
			driver = new ChromeDriver();
		} else if (prop.get("Browser").equals("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();

		} else {
			System.out.println("Browser nor found");
		}

		driver.manage().window().maximize();
		driver.get(prop.getProperty("URL"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	/*@Test
	public void validateURL() {

		String actualurl = driver.getCurrentUrl();
		String expectedURL = "http://automationpractice.com/index.php";

		Assert.assertEquals(actualurl, expectedURL);
	}

	@Test
	public void validatetitle() {
		String currenttitle = driver.getTitle();
		String expectedtitle = "My Store";

		Assert.assertEquals(currenttitle, expectedtitle);
	}*/

	/*@AfterSuite
	public void closebrowser() {
		if (!driver.equals(null)) {
			driver.quit();
		}

	}*/

}
