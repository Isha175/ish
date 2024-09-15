package SELE;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Window_handle2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String pwindow=driver.getWindowHandle();
		System.out.println(pwindow);
		driver.findElement(By.id("name")).sendKeys("parent window text");
		driver.findElement(By.id("newWindowBtn")).click();
		Set<String> cwindow=driver.getWindowHandles();
		for(String str:cwindow) {
			if(!str.equals(pwindow)) {
				driver.switchTo().window(str);
				String title=driver.getTitle();
				System.out.println(title);
				driver.close();
			}
		}
		driver.switchTo().window(pwindow);
		driver.findElement(By.xpath("//input[@class='whTextBox']")).clear();
		driver.findElement(By.xpath("//input[@class='whTextBox']")).sendKeys("Text at parent page child again");
	}
}
