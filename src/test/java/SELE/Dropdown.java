package SELE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        Thread.sleep(1000);
       
        WebElement dropdown=driver.findElement(By.id("course"));
        Select sl=new Select(dropdown);
        
// Select by index...............        
//        sl.selectByIndex(0);
//        Thread.sleep(1000);
//        sl.selectByIndex(1);
//        Thread.sleep(1000);
//        sl.selectByIndex(2);
//        Thread.sleep(1000);
//        sl.selectByIndex(3);
//        Thread.sleep(1000);
//        sl.selectByIndex(4);
//        Thread.sleep(1000);

// Select by visible text..............      
//        sl.selectByVisibleText("Java");
//        Thread.sleep(1000);
//        sl.selectByVisibleText("Dot Net");
//        Thread.sleep(1000);
//        sl.selectByVisibleText("Python");
//        Thread.sleep(1000);
//        sl.selectByVisibleText("Javascript");
//        Thread.sleep(1000);
        
// Select by value............... 
//        sl.selectByValue("select");
//        Thread.sleep(1000);
//        sl.selectByValue("java");
//        Thread.sleep(1000);
//        sl.selectByValue("net");
//        Thread.sleep(1000);
//        sl.selectByValue("python");
//        Thread.sleep(1000);
//        sl.selectByValue("js");
//        Thread.sleep(1000);
//        driver.close();
	}
}
