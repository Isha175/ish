package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_QA_text_compare {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(1000);
		Actions ac=new Actions(driver);
		Thread.sleep(1000);
        WebElement input1=driver.findElement(By.id("currentAddress"));
        WebElement input2=driver.findElement(By.id("permanentAddress"));
        input1.sendKeys("Rajasthan");
        
        ac.keyDown(Keys.CONTROL);
        ac.sendKeys("a");
        ac.keyUp(Keys.CONTROL);
        ac.build().perform();
        
        ac.keyDown(Keys.CONTROL);
        ac.sendKeys("c");
        ac.keyUp(Keys.CONTROL);
        ac.build().perform();
        
        ac.sendKeys(Keys.TAB);
        ac.build().perform();
        
        ac.keyDown(Keys.CONTROL);
        ac.sendKeys("v");
        ac.keyUp(Keys.CONTROL);
        ac.build().perform();
	}

}
