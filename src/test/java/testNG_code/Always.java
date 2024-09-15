package testNG_code;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Always {
  @Test(priority=1)
  public void begin() {
	  System.out.println("This is the initial step");
	  Assert.fail();
  }
  
  @Test(priority=2, dependsOnMethods="begin",alwaysRun=true)
  public void ready() {
	  System.out.println("This is the next step");
  }
  
  @Test()
  public void steady() {
	  System.out.println("This is the staedy method");
  }
  
  @Test(priority=4, dependsOnMethods= {"begin","ready","steady"})
  public void go() {
	  System.out.println("This is the go method");
  }
}
