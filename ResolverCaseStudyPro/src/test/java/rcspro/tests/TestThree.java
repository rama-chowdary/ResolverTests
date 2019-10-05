package rcspro.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.PrePostconditions;

public class TestThree extends PrePostconditions {
	
	@Parameters("cityval")
	@Test
	public void SearchUSAMthd(String searchcity) {

		WebElement searchinput = driver.findElement(By.xpath(".//input[@id='searchMe']"));
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		searchinput.sendKeys(searchcity);

		// using Control A to select all

		searchinput.sendKeys(Keys.CONTROL + "a");
		searchinput.sendKeys(Keys.DELETE);

		List<WebElement> tabrows = driver.findElements(By.xpath(".//tbody[@id='someTable']/tr"));
		int actualrowsizerowsize = tabrows.size();

		// Expected row count matches with actual row count
		Assert.assertEquals(actualrowsizerowsize, 4);

	}
}
