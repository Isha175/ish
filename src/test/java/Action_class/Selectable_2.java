package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable_2 {

	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://jqueryui.com/selectable/");
//        Actions ac=new Actions(driver);
//        WebElement item1=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
//        driver.switchTo().frame(item1);
//        ac.keyDown(Keys.CONTROL).build().perform();
//        driver.findElement(By.xpath("(//ol[@id='selectable']/child::li)[1]")).click();
//        driver.findElement(By.xpath("(//ol[@id='selectable']/child::li)[2]")).click();
//        driver.findElement(By.xpath("(//ol[@id='selectable']/child::li)[3]")).click();
        
//.....................................OR..........................................
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
        Actions ac=new Actions(driver);
        WebElement we=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(we);       
        WebElement item1=driver.findElement(By.xpath("(//ol[@id='selectable']/child::li)[1]"));
        WebElement item4=driver.findElement(By.xpath("(//ol[@id='selectable']/child::li)[4]"));
        ac.clickAndHold(item1).moveToElement(item4).release().build().perform();
	}
}
