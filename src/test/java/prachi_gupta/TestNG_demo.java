package prachi_gupta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_demo {
	@Test
    public void verify() {
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.google.com/");
    	String actual=driver.getTitle();
    	String expected="Google";
    	Assert.assertEquals(actual,expected);
    	driver.close();
    }
}
