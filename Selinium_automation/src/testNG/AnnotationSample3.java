package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AnnotationSample3 {
  @Test
  public void f() {
	  System.out.println("@Test");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("@BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("@AfterMethod");
  }
  
  @Test
  public void lakshman() {
	  System.out.println("lakshman");
  }

}
