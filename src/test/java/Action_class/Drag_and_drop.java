package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_and_drop {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://jqueryui.com/droppable/");
    Thread.sleep(2000);
    Actions ac=new Actions(driver);
    WebElement we=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
    driver.switchTo().frame(we);
    Thread.sleep(2000);
    WebElement source=driver.findElement(By.id("draggable"));
    WebElement targrt=driver.findElement(By.id("droppable"));
//    ac.dragAndDrop(source, targrt).release().build().perform();
//    ac.dragAndDropBy(source, 200, 200).release().build().perform();
    ac.clickAndHold(source).moveToElement(targrt).release().build().perform();
	}
}
