package scrolling_in_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class By_scroll_Into_View_method {

	public static void main(String[] args) throws InterruptedException {
    ChromeDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    JavascriptExecutor js=(JavascriptExecutor)driver;
    driver.get("https://www.hyrtutorials.com/");
    WebElement we=driver.findElement(By.xpath("//a[text()='Yada Giri Reddy ']"));
    js.executeScript("arguments[0].scrollIntoView()",we);
    we.click();
	}
}
