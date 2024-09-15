package prachi_gupta;
import org.testng.annotations.*;
public class Automobile {

	@Parameters({"AutomobileCompanyName"})
	@Test
	public void testcase1(String name) {
		System.out.println(name);
	}
}
