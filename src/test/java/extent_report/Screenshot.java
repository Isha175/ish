package extent_report;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {
@Test
	public void teakescreenshot() throws IOException {
	    ExtentReports er=new ExtentReports();
	    ExtentSparkReporter esr=new ExtentSparkReporter("C:\\Users\\RONIT PARETA\\eclipse-workspace\\Ish\\Test_ExtentReport//ss.html");
	    er.attachReporter(esr);
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		String path="C:\\Users\\RONIT PARETA\\eclipse-workspace\\Ish\\Screenshots\\ss.png";
		File trgfile=new File(path);
		FileUtils.copyFile(srcfile, trgfile);
		er.createTest("SCREENSHOT").info("this is info message").addScreenCaptureFromPath(path)
		.assignDevice("<b>windows10</b>")
		.assignCategory("<b>Smoke Testing</b>");
		driver.close();
		er.flush();
		
	}
}
