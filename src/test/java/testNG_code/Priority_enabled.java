package testNG_code;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Priority_enabled {
  // If you do not set priority of test cases then it will alphabetical order of method names it will execute
  // you have to priortize test cases else testNG will take alphabetical order sequence in execution	
	
  @Test(priority=3,enabled=false)
  public void registerUser() {
	  System.out.println("user registration");
  }

  @Test(priority=1)
  public void validLoginCredentials() {
	  System.out.println("valid login");
  }
  
  @Test(priority=6)
  public void home() {
	  System.out.println("home page visibility");
  }
  
  @Test(priority=2)
  public void benificiary() {
	  System.out.println("benificiary");
  }
  
  @Test(priority=4)
  public void validatingBenificiary() {
	  System.out.println("validatingBenificiary");
  }
  @Test(priority=5)
  public void logout() {
	  System.out.println("user logout");
  }

}
