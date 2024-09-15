package iframe_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame_web_element {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        Thread.sleep(2000);
        driver.findElement(By.id("name")).sendKeys("Input at main page");
        WebElement frm=driver.findElement(By.id("frm1"));
        driver.switchTo().frame(frm);
        Thread.sleep(2000);
        WebElement we=driver.findElement(By.id("ide")); 
        Select sl=new Select(we);
        sl.selectByIndex(1);
        driver.switchTo().defaultContent();
        Thread.sleep(2000);
        driver.findElement(By.id("name")).sendKeys("Input at main page after child");
	}
}
