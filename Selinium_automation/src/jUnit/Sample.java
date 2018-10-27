package jUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Sample {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("btest");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("atest");
	}

	@Test
	void test() {
		System.out.println("test");
	}
	
	@Test
	void rest() {
		System.out.println("rest");
	}

}
