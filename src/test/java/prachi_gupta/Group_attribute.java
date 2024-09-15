package prachi_gupta;
import org.testng.annotations.*;
public class Group_attribute {

	@Test(groups="Software company")
	public void infosys() {
		System.out.println("Infosys");
	}
	
	@Test
	public void wipro() {
		System.out.println("Wipro");
	}
	
	@Test(groups="Automobile")
	public void tata() {
		System.out.println("TaTa");
	}
	
	@Test(groups="Automobile")
	public void maruti() {
		System.out.println("Maruti");
	}
}
