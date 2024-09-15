package omayo_blogspot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class First {
	WebDriver driver;
	@Test
     public void first() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.name("q")).sendKeys("selenium"+Keys.ENTER);
	}
	
	@Test(timeOut=1000)
	public void more() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Actions as=new Actions(driver);
		WebElement we2=driver.findElement(By.xpath("//a[@id='b-more']"));
		as.moveToElement(we2).click().build().perform();
		Thread.sleep(3000);
		WebElement we=driver.findElement(By.id("bm-email"));
		as.moveToElement(we).click().build().perform();
//		WebElement we1=driver.findElement(By.xpath("//span[text()='SeleniumByArun']"));
//		as.click(we1).build().perform();
	}
}
