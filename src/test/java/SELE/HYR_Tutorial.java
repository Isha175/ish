package SELE;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HYR_Tutorial {

	public static void main(String[] args) throws InterruptedException {
	   WebDriverManager.chromedriver();
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
    // Thread.sleep(500);
    // WebElement amount= driver.findElement(By.xpath("//td[text()='5000']"));
       Thread.sleep(500);
       
       List<WebElement>lst=driver.findElements(By.xpath("//td[text()<='5000']"));  
       
//       for(WebElement we:lst) {
//    	   System.out.println(we.getText());
//       }
       
       long sum=0;
       for(WebElement we:lst) {
    	   String str=we.getText();
    	   int l=Integer.parseInt(str);
    	   System.out.println("Value="+l);
    	   sum=l+sum;
       }
       System.out.println(sum);
       driver.close();
	}

}
