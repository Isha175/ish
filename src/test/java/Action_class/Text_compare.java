package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Text_compare {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://text-compare.com/");
		Thread.sleep(1000);
        Actions ac=new Actions(driver);
        WebElement input1=driver.findElement(By.id("inputText1"));
        Thread.sleep(1000);
        WebElement input2=driver.findElement(By.id("inputText2"));
        Thread.sleep(1000);
        input1.sendKeys("This is automation testing");
        
        ac.keyDown(Keys.CONTROL);
        ac.sendKeys("a");
        ac.keyUp(Keys.CONTROL);
        ac.build().perform();
        
        ac.keyDown(Keys.CONTROL);
        ac.sendKeys("c");
        ac.keyUp(Keys.CONTROL);
        ac.build().perform();
        
        ac.sendKeys(Keys.TAB);
        
        ac.keyDown(Keys.CONTROL);
        ac.sendKeys("v");
        ac.keyUp(Keys.CONTROL);
        ac.build().perform();
        
        String txt1=input1.getText();
        String txt2=input2.getText();
        if(txt1.equals(txt2)) {
        	System.out.println("Test case is pass");
        }else {
        	System.out.println("Test case is fail");
        }
	}
}
