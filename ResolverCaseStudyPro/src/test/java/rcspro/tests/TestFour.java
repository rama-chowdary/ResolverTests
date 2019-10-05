package rcspro.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.PrePostconditions;

public class TestFour extends PrePostconditions {
	@Test
	public void testfourmthd() {

		Actions act = new Actions(driver);
		WebElement dragbtn = driver.findElement(By.id("drag1"));
		WebElement dropbtn = driver.findElement(By.id("div1"));

		// Dragging button from source to target
		act.dragAndDrop(dropbtn, dragbtn).perform();

	}
}
