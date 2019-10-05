package rcspro.tests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.PrePostconditions;

public class TestTwo extends PrePostconditions {
	
	@Parameters({"inputval","inputvaltwo"})
	@Test
	public void Test2availoptions(String inputskill,String inputskilltwo) {
		driver.findElement(By.xpath(".//button[@data-toggle='dropdown']")).click();
		WebElement inputxt = driver.findElement(By.xpath(".//input[@id='myInput']"));
		inputxt.sendKeys(inputskill);
		WebDriverWait wait = new WebDriverWait(driver, 2000);
		List<WebElement> eletxt = wait.until(
				ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(".//li[contains(text(),'Angular')]")));

		List<String> expectedresting = new ArrayList<String>();
		expectedresting.add("Angular 2");
		expectedresting.add("Angular");
		String angactualoptns = null;
		String str = null;
		for (int i = 0; i < eletxt.size(); i++) {
			angactualoptns = eletxt.get(i).getText();
			/* System.out.println(angactualoptns); */
			for (int j = 0; j < expectedresting.size(); j++) {
				str = expectedresting.get(j);
			}

		}

		// Expected visible options matches with Actual visible options.
		Assert.assertEquals(angactualoptns, str);

		inputxt.clear();
		inputxt.sendKeys(inputskilltwo);
	}
}
