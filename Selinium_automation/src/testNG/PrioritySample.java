package testNG;

import org.testng.annotations.Test;

public class PrioritySample {
  @Test(priority=0)
  public void test() {
	  System.out.println("test");
  }
  @Test(priority=1,enabled=false)
  public void rest() {
	  System.out.println("rest");
  }
  @Test(priority=2)
  public void f() {
	  System.out.println("f");
  }
  @Test(priority=3)
  public void d() {
	  System.out.println("d");
  }
  @Test(priority=4)
  public void v() {
	  System.out.println("v");
  }
  @Test(priority=5)
  public void m() {
	  System.out.println("m");
  }
}
