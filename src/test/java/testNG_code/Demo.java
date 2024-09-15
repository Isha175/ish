package testNG_code;
import org.testng.annotations.*;
public class Demo {
	@BeforeSuite
	public void beforesuite() {
		System.out.println("beforesuite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("before test");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("beforeclass");
	}

	@BeforeMethod
	public void before() {
		System.out.println("before method");
	}

	@Test
	public void ish() {
		System.out.println("test 1");
	}
	@Test
	public void ish1() {
		System.out.println("test 2");
	}
	
	@AfterMethod
	public void after() {
		System.out.println("after method\n");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("After class");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("after test");
	}
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("aftersuite");
	} 
}
