
package take_screenshot;

import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Take_SS_2 {
	//private static FileOutputStream fos;
	private static FileOutputStream fs;

	public static void main(String[] args) throws IOException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		TakesScreenshot ts= (TakesScreenshot)driver;
//		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
//		String path="C:\\Users\\RONIT PARETA\\eclipse-workspace\\Ish\\Screenshots\\image3.png";
//	    fos = new FileOutputStream(path);
//      byte[] bytearr=ts.getScreenshotAs(OutputType.BYTES);
//      fos.write(bytearr);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.linkedin.com/pulse/lean-six-sigma-definition-kpis-alan-pe%C3%B1a");
		TakesScreenshot ts=(TakesScreenshot)driver;
		String path="C:\\Users\\RONIT PARETA\\eclipse-workspace\\Ish\\Screenshots\\six.png";
		fs = new FileOutputStream(path);
		byte[]arr=ts.getScreenshotAs(OutputType.BYTES);
		fs.write(arr);
	}
}

