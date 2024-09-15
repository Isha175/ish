package prachi_gupta;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_Provider {
	@Test(dataProvider="searchdataset", dataProviderClass=DP.class)
	public void login(String country, String Monument ) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys(country +" "+ Monument);
		driver.findElement(By.name("btnK")).submit();
	}
}
