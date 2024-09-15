package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resizable_adjust {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/resizable/");
        Thread.sleep(1000);
        Actions ac=new Actions(driver);
        WebElement we=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(we);
        Thread.sleep(1000);
        WebElement we1=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
        ac.dragAndDropBy(we1, 400, 150).release().build().perform();
        
	}

}
