package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
		Thread.sleep(1000);
        Actions ac=new Actions(driver);
        WebElement we=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(we);
        ac.keyDown(Keys.CONTROL).click().build().perform();
        
        WebElement item1=driver.findElement(By.xpath("(//ol[@id='selectable']/child::li[@class='ui-widget-content ui-selectee'])[1]"));
        item1.click();
        
        WebElement item2=driver.findElement(By.xpath("(//ol[@id='selectable']/child::li[@class='ui-widget-content ui-selectee'])[2]"));
        item2.click();
      
        WebElement item3=driver.findElement(By.xpath("(//ol[@id='selectable']/child::li[@class='ui-widget-content ui-selectee'])[3]"));
        item3.click();
        
        WebElement item4=driver.findElement(By.xpath("(//ol[@id='selectable']/child::li[@class='ui-widget-content ui-selectee'])[4]"));
        item4.click();
        
        Thread.sleep(2000);
        driver.close();

	}
}
