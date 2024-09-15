package SELE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HYR_Tutorial2_Contains_method {

	public static void main(String[] args) throws InterruptedException {
	   WebDriverManager.chromedriver();
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       Thread.sleep(500);
       driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
       Thread.sleep(500);
      // driver.findElement(By.xpath("//a[contains(text(),'Sign in into account')]")).click();
      // driver.findElement(By.xpath("//a[starts-with(text(),'Sign in into account')]")).click();
       driver.findElement(By.xpath("(//div[@class='container']/child::input[@type='text'])[1]")).sendKeys("Isha");
       Thread.sleep(500);
       driver.findElement(By.xpath("(//div[@class='container']/child::input[@type='text'])[2]")).sendKeys("Pareta");
       Thread.sleep(500);
      // driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[1]")).sendKeys("ishapareta22@gmail.com");
       driver.findElement(By.xpath("//div[@class='container']/child::input[@type='text'][3]")).sendKeys("ishapareta22@gmail.com");
       Thread.sleep(500);
       driver.findElement(By.xpath("//div[@class='container']/child::div[2]/input")).sendKeys("123@isha");
       Thread.sleep(500);
       driver.findElement(By.xpath("//div[@class='container']/child::input[@type='password']")).sendKeys("123@isha");
       Thread.sleep(500);
       driver.findElement(By.xpath("//td[text()='Francisco Chang']/preceding-sibling::td[1]/child::input")).click();
       Thread.sleep(500);  //checkbox
//       driver.findElement(By.xpath("//div[@class='container']/descendant::input[@type='submit']")).click(); //REFERESH
//       Thread.sleep(500);
//       driver.findElement(By.xpath("(//div[@class='container']/descendant::button[@type='reset'])[2]")).click(); //RESET
//       Thread.sleep(500);
//       driver.findElement(By.xpath("(//div[@class='container']/child::input[@type='text'])[1]")).sendKeys("Isha");
//       Thread.sleep(500);
//       driver.findElement(By.xpath("(//div[@class='container']/child::input[@type='text'])[2]")).sendKeys("Pareta");
//       Thread.sleep(500);
//       driver.findElement(By.xpath("(//div[@class='container']/descendant::button[@type='reset'])[1]")).click(); // CLEAR
//       Thread.sleep(500);
       driver.close();
	}

}
