package scrolling_in_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class By_scrollTo_method {

	public static void main(String[] args) throws InterruptedException {
    ChromeDriverManager.chromedriver().setup();
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.hyrtutorials.com/");
    Thread.sleep(1000);
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("window.scrollTo(0,2000)");
    Thread.sleep(5000);
    js.executeScript("window.scrollTo(0,1000)");
    Thread.sleep(5000);
    js.executeScript("window.scrollBy(0,500)");
    Thread.sleep(5000);
//    driver.findElement(By.xpath("//a[@class='back-to-top']")).click();
	}
}
