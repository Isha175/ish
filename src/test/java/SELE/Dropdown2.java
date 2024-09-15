package SELE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        Thread.sleep(1000);
        WebElement dropdown=driver.findElement(By.id("ide"));
        Select sl=new Select(dropdown);
        sl.selectByIndex(1);
        Thread.sleep(1000);
        sl.selectByIndex(3);
        Thread.sleep(1000);
        sl.deselectAll();
        Thread.sleep(1000);
	}
}
