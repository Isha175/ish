package prachi_gupta;
import org.testng.annotations.*;
public class TestNG_Attributes {
   
	@Test(description="this is description 1")
	public void testcase1() {
		System.out.println("Mobile login test case");
	}
	
	@Test
	public void testcase2() {
		System.out.println("Web login test case");
	}
	
	@Test
	public void testcase3() {
		System.out.println("API login test case");
	}
}
