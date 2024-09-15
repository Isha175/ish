package Javascript_Executor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class first2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://altoro.testfire.net/login.jsp");
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
//		WebElement uname=driver.findElement(By.id("uid"));
//		js.executeScript("arguments[0].value='jsmith'", uname);
//		WebElement pass=driver.findElement(By.id("passw"));
//		js.executeScript("arguments[0].value='demo1234'", pass);
//	    WebElement login=driver.findElement(By.name("btnSubmit"));
//        js.executeScript("arguments[0].click()", login);
		
//		........................OR...............................
		
		WebElement uname=driver.findElement(By.id("uid"));
		WebElement pass=driver.findElement(By.id("passw"));
		WebElement login=driver.findElement(By.name("btnSubmit"));
		js.executeScript("arguments[0].value='jsmith'", uname);
		js.executeScript("arguments[0].value='demo1234'", pass);
        js.executeScript("arguments[0].click()", login);
	}

}
