package take_screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Take_SS {
	public static void main(String[] args) throws IOException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		TakesScreenshot ts= (TakesScreenshot)driver;
//		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
//        File srcFile=ts.getScreenshotAs(OutputType.FILE);
//        String path="C:\\Users\\RONIT PARETA\\eclipse-workspace\\Ish\\Screenshots\\image1.png";
//        File tagetFile= new File(path);
//        try {
//			FileUtils.copyFile(srcFile,tagetFile);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://my.iq-india.com/sAttendance");
		TakesScreenshot ts=(TakesScreenshot)driver;
        File srcfile=ts.getScreenshotAs(OutputType.FILE);
        String path="C:\\Users\\RONIT PARETA\\eclipse-workspace\\Ish\\Screenshots\\iq.png";
        File trgfile=new File(path);
        FileUtils.copyFile(srcfile, trgfile);
		
		
	}
}
