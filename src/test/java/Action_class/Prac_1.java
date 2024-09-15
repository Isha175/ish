package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Prac_1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/");
		Actions ac=new Actions(driver);
		driver.findElement(By.xpath("//a[text()='Draggable']")).click();
		WebElement we=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(we);
		WebElement frame=driver.findElement(By.id("draggable"));
		ac.dragAndDropBy(frame,0,100).release().build().perform();
		
		driver.get("https://jqueryui.com/droppable/");
		WebElement we1=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(we1);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		ac.dragAndDrop(source, target).build().perform();
		
		
		driver.get("https://jqueryui.com/resizable/");
		WebElement we2=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(we2);
		WebElement res=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
		ac.dragAndDropBy(res, 100, 0).build().perform();
		
		
		driver.get("https://jqueryui.com/selectable/");
		WebElement we3=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(we3);
		ac.keyDown(Keys.CONTROL).build().perform();
		driver.findElement(By.xpath("//li[@class='ui-widget-content ui-selectee'][1]")).click();
		driver.findElement(By.xpath("//li[@class='ui-widget-content ui-selectee'][2]")).click();
		driver.findElement(By.xpath("//li[@class='ui-widget-content ui-selectee'][3]")).click();
		driver.findElement(By.xpath("//li[@class='ui-widget-content ui-selectee'][4]")).click();
		
		
		driver.get("https://jqueryui.com/sortable/");
		WebElement we4=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(we4);
		WebElement item1=driver.findElement(By.xpath("//li[@class='ui-state-default ui-sortable-handle'][1]"));
		ac.dragAndDropBy(item1, 0,180 ).build().perform();
		
	}
}
