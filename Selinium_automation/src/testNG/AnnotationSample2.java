package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AnnotationSample2 {
  @Test
  public void f() {
	  System.out.println("@Test");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("@BeforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@AfterClass");
  }
  @Test
  public void lakshman() {
	  System.out.println("@lakshman");
  }

}
