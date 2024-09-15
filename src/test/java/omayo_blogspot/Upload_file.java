package omayo_blogspot;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_file {

	@Test
	public void file() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.id("uploadfile")).sendKeys("C:\\Users\\RONIT PARETA\\OneDrive\\Desktop\\C.V._ISHA PARETA.docx");
	}
}
