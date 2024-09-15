package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Home_and_Furniture {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		Actions ac=new Actions(driver);
		WebElement we=driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
        ac.moveToElement(we).build().perform();
        
        WebElement tv=driver.findElement(By.xpath("//a[text()='Bedroom Furniture']"));
        ac.moveToElement(tv).build().perform();
        Thread.sleep(2000);
        
        WebElement tv1=driver.findElement(By.xpath("//div[@class='_31z7R_']/descendant::a[5]"));
        ac.click(tv1).build().perform();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//a[@class='wjcEIp'])[1]")).click();
	}
}
