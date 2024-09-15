package prachi_gupta;
import org.testng.annotations.*;
public class Software_company {

	@Parameters({"SoftwareCompanyName"})
	@Test
	public void test1(String name) {
		System.out.println(name);
	}
}
