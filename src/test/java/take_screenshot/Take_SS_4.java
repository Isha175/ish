package take_screenshot;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Take_SS_4 {
	private static FileOutputStream fos;

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		TakesScreenshot ts= (TakesScreenshot)driver;
		LocalDateTime ldt= LocalDateTime.now();
		System.out.println(ldt);
		DateTimeFormatter myformat=DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
		String str=ldt.format(myformat);
		System.out.println(str);
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		String path="C:\\Users\\RONIT PARETA\\eclipse-workspace\\Ish\\Screenshots\\"+str+".png";
	    fos = new FileOutputStream(path);
        String base64code=ts.getScreenshotAs(OutputType.BASE64);
        byte[] bytearr=Base64.getDecoder().decode(base64code);
        fos.write(bytearr);
	}
}
