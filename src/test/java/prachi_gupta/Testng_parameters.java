package prachi_gupta;
import org.testng.annotations.*;
public class Testng_parameters {

	@Test(description="parameters execution")
	@Parameters({"i","j"})
	public void add(int a, int b) {
		System.out.println("add : "+(a+b));
	}
	
	@Test
	@Parameters({"i","j"})
	public void sub(int a,int b) {
		System.out.println("sub : "+(a-b));
	}
	
	@Test
	@Parameters({"i","j"})
	public void multi(int a,int b) {
		System.out.println("multi : "+(a*b));
	}
}
