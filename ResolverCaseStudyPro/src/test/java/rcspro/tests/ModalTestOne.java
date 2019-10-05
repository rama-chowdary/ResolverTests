package rcspro.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.PrePostconditions;

public class ModalTestOne extends PrePostconditions {

	// we can take values in xml by using parameters so that we can change input values easily instead of
	// opening code everytime
	@Parameters({ "name", "city" })
	@Test
	public void openModal(String names, String cities) {

		driver.findElement(By.xpath(".//button[@data-target='#myModal']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement modalone = driver.findElement(By.xpath(".//div[contains(@class,'modal-content')]"));
		WebElement name = modalone.findElement(By.xpath(".//input[@id='name']"));
		name.sendKeys(names);
		WebElement city = modalone.findElement(By.xpath(".//input[@id='city']"));
		city.sendKeys(cities);
		modalone.findElement(By.xpath("(.//input[@type='checkbox'])[1]")).click();
		modalone.findElement(By.xpath(".//button[@id='enter']")).click();
		driver.findElement(By.xpath("(.//button[@data-dismiss='modal'])[2]")).click();
		String expectedResult = "Rama";
		String expectedcityResult = "Hyderabad";
		WebElement actualele = driver.findElement(By.xpath(".//span[@id='nameVal']"));
		WebElement actualcityele = driver.findElement(By.xpath(".//span[@id='cityVal']"));

		// Actual name is matching with Expected name
		Assert.assertEquals(actualele.getText(), expectedResult);

		// Actual city is matching with Expected city
		Assert.assertEquals(actualcityele.getText(), expectedcityResult);

	}

}
