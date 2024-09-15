package SELE;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_in_Selenium2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        Thread.sleep(5000);
        driver.findElement(By.id("promptBox")).click();
        Thread.sleep(5000);
//        Alert al=driver.switchTo().alert();
//        Thread.sleep(5000);
//       // al.accept();
//        //al.dismiss();
//        al.sendKeys("Test QA");
//        al.accept();
//        Thread.sleep(5000);
//        WebElement output=driver.findElement(By.xpath("//div[@id='output']"));
//        String str=output.getText();
//        System.out.println(str);
          driver.close();
	}
}
