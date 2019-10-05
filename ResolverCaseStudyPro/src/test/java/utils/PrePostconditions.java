package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class PrePostconditions {

	public static WebDriver driver;

	@BeforeTest
	public void gotourl() {
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/venky/Desktop/AutomationChallenge/index.html");
		driver.manage().window().maximize();

	}
}
