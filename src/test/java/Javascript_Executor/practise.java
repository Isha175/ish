package Javascript_Executor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class practise {

	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();	
    WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();	
	driver.get("http://altoro.testfire.net/");
	Thread.sleep(1000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("document.getElementsByTagName('font')[0].click()");
	Thread.sleep(1000);
	js.executeScript("document.getElementsByTagName('input')[2].value='jsmith'");	
	Thread.sleep(1000);
	js.executeScript("document.getElementsByTagName('input')[3].value='demo1234'");
	Thread.sleep(1000);
	js.executeScript("document.getElementsByTagName('input')[4].click()");
	Thread.sleep(1000);
	js.executeScript("document.getElementsByTagName('a')[5].click()");
	Thread.sleep(1000);
	js.executeScript("document.getElementsByTagName('a')[6].click()");
	Thread.sleep(1000);
	js.executeScript("document.getElementsByTagName('a')[7].click()");
	Thread.sleep(1000);
	js.executeScript("document.getElementsByTagName('a')[4].click()");
	Thread.sleep(1000);
	}
}
