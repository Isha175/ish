package prachi_gupta;
import org.testng.annotations.*;
public class Testcase_1 {
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("before suite");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("after suite");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("before test");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("after test");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("before class");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("after class");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("before method");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method");
	}
	
	@Test
	public void test1() {
		System.out.println("This is test1\n");
	}
	
	@Test
	public void test2() {
		System.out.println("This is test2\n");
	}
	
	
}
