package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sortable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/sortable/");
        Thread.sleep(1000);
        Actions ac=new Actions(driver);
        WebElement we=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(we);
        Thread.sleep(1000);
        WebElement source=driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][1]"));
        Thread.sleep(2000);
        ac.dragAndDropBy(source, 0,130).build().perform();
        Thread.sleep(5000);
	}
}
