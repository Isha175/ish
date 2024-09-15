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
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Log_events {
	
	@Test
	public void extentreport() throws IOException {
		ExtentReports er=new ExtentReports();
		ExtentSparkReporter esr=new ExtentSparkReporter("C:\\Users\\RONIT PARETA\\eclipse-workspace\\Ish\\Test_ExtentReport\\report1.html");
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
		ExtentTest Test=er.createTest("test");
		Test.log(Status.INFO,"<b>info</b>")
		.log(Status.PASS, "pass")
		.log(Status.FAIL,"fail")
		.log(Status.SKIP,"skip")
		.log(Status.WARNING,"warning")
		.log(Status.WARNING,"warning2");
		Test.assignAuthor("IshaReport");
		
		String JSONData= "{'name':'abhi garg','job':'hr'}";
		Test.info(MarkupHelper.createCodeBlock(JSONData,CodeLanguage.JSON));
		
		try {
			int i=10/0;
		} catch (Exception e) {
			er.createTest("Custom Exception").info(e.toString());
		}
		er.flush();
	}
}
