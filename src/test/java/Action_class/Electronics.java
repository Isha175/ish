package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Electronics {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Actions ac=new Actions(driver);
		WebElement we=driver.findElement(By.xpath("//span[text()='Electronics']"));
		ac.moveToElement(we).build().perform();
		
		WebElement health=driver.findElement(By.xpath("//div[@class='_16rZTH']/descendant::a[6]"));
		ac.moveToElement(health).build().perform();
		Thread.sleep(1000);
		
		WebElement ws=driver.findElement(By.xpath("//div[@class='_31z7R_']/descendant::a[10]"));
		ac.click(ws).build().perform();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@class='wjcEIp'])[1]")).click();
		Thread.sleep(1000);
		
        WebElement atc=driver.findElement(By.xpath("//li[@class='col col-6-12']/child::button[@class='QqFHMw vslbG+ In9uk2']"));
        ac.click(atc).build().perform();
        Thread.sleep(1000);
	}

}
