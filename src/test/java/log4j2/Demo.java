package log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.apache.logging.log4j.*;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Demo {

	public static WebDriver driver;
	public Logger log=LogManager.getLogger("Demo.class");
	@Test
	public void login() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.testfire.net/login.jsp");
		log.info("application launched");
		driver.findElement(By.id("uid")).sendKeys("jsmith");
		log.info("username entered");
		driver.findElement(By.id("passw")).sendKeys("demo1234");
		log.fatal("Fatal - paasword entered");
		driver.findElement(By.name("btnSubmit")).click();
		log.info("page submiited");
		
		WebElement signoff=driver.findElement(By.xpath("//font[text()='Sign Off']"));
		boolean b=signoff.isDisplayed();
		if(b==false) {
			//System.out.println("user login successfully");
			log.warn("Warn- user login successfully");
		}
		else {
			//System.out.println("unable to login");
			log.error("user not login");
		}
		driver.close();
	}
}
