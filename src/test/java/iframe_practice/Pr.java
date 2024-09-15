package iframe_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Pr {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys("On the main page");
		WebElement frm3=driver.findElement(By.id("frm3"));
        driver.switchTo().frame(frm3);
        driver.findElement(By.id("name")).sendKeys("input in frame 3");
        WebElement frm1=driver.findElement(By.id("frm1"));
        driver.switchTo().frame(frm1);
        WebElement drop=driver.findElement(By.id("course"));
        Select sl=new Select(drop);
        sl.selectByIndex(2);
        driver.switchTo().parentFrame();
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("custom");
        driver.switchTo().parentFrame();
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("custom2");   
	}
}
