package testNG_code;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dependencies {
  public static WebDriver driver;
  
  @BeforeMethod
  public void start() {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.mycarhelpline.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @Test(priority=1, enabled=true)
  public void LandingPage() {
	  System.out.println(driver.getCurrentUrl());
	  String currentURL="https://www.mycarhelpline.com/";
	  if(currentURL.equals("https://www.mycarhelpline.com/")) {
		  System.out.println("Test case LandingPage is pass");
	  }
	  else {
		  System.out.println("Test case Landing page is fail");
	  }
	  Assert.fail();
  }
  
  @Test(priority=2, enabled=true, dependsOnMethods="LandingPage")
  public void calculator() {
	  driver.findElement(By.linkText("Calculator")).click();
  }
  
  @Test(priority=3, enabled=true, dependsOnMethods= {"LandingPage","calculator"})
  public void home() {
	  driver.findElement(By.linkText("Home")).click();
  }
  
  
  @AfterMethod
  public void tearDown() {
	  driver.quit();
  }

}
