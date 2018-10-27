package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Validation {
	@Test
	public void f() {
		String abc = "Lakshman";
		String bcd = "lakshman";
		System.out.println("before validation using if condition");
		if (abc.equalsIgnoreCase(bcd)) {
			System.out.println("both are matching");

		} else {
			System.out.println("both are not matching");
		}
		System.out.println("after validation using if condition");
		System.out.println("*********************************");
	}

	@Test
	public void assertionsample() {
		String abc = "Lakshman";
		String bcd = "lakshman";
		System.out.println("before validation using if condition");
		Assert.assertEquals(abc, bcd);
//		if (abc.equals(bcd)) {
//			System.out.println("both are matching");
//
//		} else {
//			System.out.println("both are not matching");
//		}
		System.out.println("after validation using if condition");
	}
	
}
