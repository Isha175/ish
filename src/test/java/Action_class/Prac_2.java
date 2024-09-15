package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prac_2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions ac=new Actions(driver);
		driver.get("https://jqueryui.com/");
		driver.findElement(By.xpath("//a[text()='Draggable']")).click();
		WebElement we=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(we);
		WebElement drag=driver.findElement(By.id("draggable"));
		ac.dragAndDropBy(drag, 100, 0).release().build().perform();
		Thread.sleep(2000);
		driver.navigate().back();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[text()='Droppable']")).click();
		WebElement we1=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(we1);
		WebElement drag1=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		ac.dragAndDrop(drag1, drop).build().perform();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[text()='Resizable']")).click();
		WebElement we2=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(we2);
		WebElement re=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		ac.dragAndDropBy(re, 100, 50).build().perform();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[text()='Selectable']")).click();
		WebElement we3=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(we3);
		WebElement item1=driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-selectee'])[1]"));
		WebElement item2=driver.findElement(By.xpath("(//li[@class='ui-widget-content ui-selectee'])[5]"));
		ac.dragAndDrop(item1, item2).build().perform();
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[text()='Sortable']")).click();
		WebElement we4=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(we4);
		WebElement sort=driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[2]"));
		ac.dragAndDropBy(sort, 0, 100).build().perform();
        
	}

}
