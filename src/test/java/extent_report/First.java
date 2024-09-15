package extent_report;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class First {
  @Test
	public void extentreport() throws IOException {
		ExtentReports er=new ExtentReports();
		ExtentSparkReporter esr=new ExtentSparkReporter("C:\\Users\\RONIT PARETA\\eclipse-workspace\\Ish\\Test_ExtentReport\\report.html");
		er.attachReporter(esr);
		ExtentTest test1= er.createTest("test1");
		test1.pass("this test is pass");
		test1.fail("this test is fail");
		ExtentTest test2=er.createTest("test2");
		test2.pass("pass");
		test2.assignAuthor("Isha");
//		esr.config(ExtentSparkReporterConfig.builder()
//				.theme(Theme.DARK)
//				.documentTitle("My report")
//				.build());
//		er.flush();
	//	Desktop.getDesktop().browse(new File("C:\\\\Users\\\\RONIT PARETA\\\\eclipse-workspace\\\\Ish\\\\Test_ExtentReport\\report.html").toURI());
		
		
		
		
	}
}
