package rcspro.tests;

import org.testng.annotations.Test;

public class TestFive {
	@Test
	public void printnums() {

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Resolver");
			} else if (i % 3 == 0) {
				System.out.println("MThree");
			} else if (i % 5 == 0) {
				System.out.println("MFive");
			} else {
				System.out.println(i);
			}
		}
	}
}
