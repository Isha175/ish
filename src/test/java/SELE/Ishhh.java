package SELE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ishhh {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(500);
//		driver.get("http://altoro.testfire.net/login.jsp");
//		driver.findElement(By.name("uid")).sendKeys("jsmith");
//		driver.findElement(By.name("passw")).sendKeys("demo1234");
//		driver.findElement(By.name("btnSubmit")).click();

//      driver.get("https://magento.softwaretestingboard.com/");
//      driver.findElement(By.linkText("Sign In")).click();
//      driver.findElement(By.id("email")).sendKeys("test1605@test.com");
//      driver.findElement(By.id("pass")).sendKeys("Test1234");
//      driver.findElement(By.id("send2")).click();

		driver.get("http://altoro.testfire.net/");
		Thread.sleep(500);
		driver.findElement(By.tagName("font")).click();
		Thread.sleep(500);
		//driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr/td[2]/input"))
				//.sendKeys("jsmith");
		driver.findElement(By.xpath("//input[@id='uid']")).sendKeys("jsmith");
		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[2]/td[2]/input"))
//				.sendKeys("demo1234");
		driver.findElement(By.xpath("//input[@id='passw']")).sendKeys("demo1234");
		Thread.sleep(500);
//		driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/form/table/tbody/tr[3]/td[2]/input"))
//				.click();
		driver.findElement(By.xpath("//input[@name='btnSubmit']")).click();
		
//		driver.findElement(By.linkText("Transfer Funds")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//h1[starts-with(text(),'Hello')]")).click();
//		driver.findElement(By.partialLinkText("hcl-software.com")).click();
//		Thread.sleep(500);
//		driver.navigate().back();
//		Thread.sleep(500);
//		driver.findElement(By.partialLinkText("View Recent")).click();
//		Thread.sleep(500);
//		driver.findElement(By.tagName("img")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.className("subheader")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.linkText("INSIDE ALTORO MUTUAL")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.linkText("SMALL BUSINESS")).click();
//		Thread.sleep(1000);
		driver.close();
	}

}
