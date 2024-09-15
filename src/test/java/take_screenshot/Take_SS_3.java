package take_screenshot;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Take_SS_3 {
	private static FileOutputStream fos;

	public static void main(String[] args) throws IOException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		TakesScreenshot ts= (TakesScreenshot)driver;
//		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
//		String path="C:\\Users\\RONIT PARETA\\eclipse-workspace\\Ish\\Screenshots\\image2.png";
//	    fos = new FileOutputStream(path);
//        String base64code=ts.getScreenshotAs(OutputType.BASE64);
//        byte[] bytearr=Base64.getDecoder().decode(base64code);
//        fos.write(bytearr);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		TakesScreenshot ts=(TakesScreenshot)driver;
		String path="C:\\Users\\RONIT PARETA\\eclipse-workspace\\Ish\\Screenshots//isha.png";
		FileOutputStream fs=new FileOutputStream(path);
		String code=ts.getScreenshotAs(OutputType.BASE64);
		Base64.getDecoder().decode(code);
	
	}
}
