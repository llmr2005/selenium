package testNG;

import org.testng.annotations.Test;

public class DependencyTest {

	@Test
	public void start() {
		System.out.println("Starting the server");
	}

	// Set dependency on start method
	@Test(dependsOnMethods = { "start" })
	public void init() {
		System.out.println("Initializing the data for processing!");
	}

	// Set Dependencies on start and init tests
	@Test(dependsOnMethods = { "start", "init" })
	public void process() {
		System.out.println("Processing the data!");
	}

	@Test(dependsOnMethods = { "process" })
	public void stop() {
		System.out.println("Stopping the server");
	}
}
