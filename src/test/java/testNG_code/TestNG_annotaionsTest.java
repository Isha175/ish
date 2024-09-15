package testNG_code;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG_annotaionsTest {
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("This is beforeSuite annotation");
  }

  @BeforeTest
  public void BeforeTest() {
	  System.out.println("This is BeforeTest annotation");
  }

  @BeforeClass
  public void BeforeClass() {
	  System.out.println("This is BeforeClass annotation");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is beforeMethod annotation");
  }

  @Test
  public void f() {
	  System.out.println("This is f");
  }
  
  @Test
  public void f1() {
	  System.out.println("This is f1");
  }
  
  @AfterMethod
  public void AfterMethod() {
	  System.out.println("This is AfterMethod annotation");
  }

  @AfterClass
  public void AfterClass() {
	  System.out.println("This is AfterClass annotation");
  }

  @AfterTest
  public void AfterTest() {
	  System.out.println("This is AfterTest annotation");
  }

  @AfterSuite
  public void AfterSuite() {
	  System.out.println("This is AfterSuite annotation");
  }

}
