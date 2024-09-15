package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Right_click {

	public static void main(String[] args) throws InterruptedException {
	 WebDriverManager.chromedriver().setup();
     ChromeDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     Thread.sleep(1000);
     driver.get("https://swisnl.github.io/jQuery-contextMenu/3.x/demo.html#example-code-simple-context-menu");
     Actions ac=new Actions(driver);
     WebElement we=driver.findElement(By.xpath("//span[text()='right click me']"));
     ac.contextClick(we).build().perform();
//     WebElement we1=driver.findElement(By.xpath("//span[text()='Copy']"));
//     ac.click(we1).build().perform();
     Thread.sleep(1000);
     WebElement we2=driver.findElement(By.xpath("//span[text()='Edit']"));
     ac.click(we2).build().perform();
	}
}
