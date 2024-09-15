package Action_class;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboard_operations {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/key_presses");
        Actions ac=new Actions(driver);
 //       ac.sendKeys(Keys.ALT).build().perform();
        ac.sendKeys(Keys.ARROW_UP).build().perform();
	}
}
