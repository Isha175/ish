package testNG_code;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BM_T_AMTest {
	  @BeforeMethod
	  public void userRegistration() {
		  System.out.println("user is getting registered");
	  }
		
	  @Test
	  public void userLogin() {
		  System.out.println("user is able to login");
	  }
	  
	  @Test
	  public void userMoneyControl(){
		  System.out.println("user is able to transfer fund");
	  }
	  
      @AfterMethod
      public void userLogout() {
    	  System.out.println("user is able to logout");
  }
      
}
