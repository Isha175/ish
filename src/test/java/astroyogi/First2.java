package astroyogi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First2 {
	public static void main(String[]args) throws InterruptedException {
     WebDriverManager.chromedriver().setup();
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.astroyogi.com/kundli");
	 driver.findElement(By.name("alphaOnly")).sendKeys("Phalana");
	 WebElement gender=driver.findElement(By.id("UserGender"));
	 Select sl=new Select(gender);
	 sl.selectByIndex(1);
	 WebElement date=driver.findElement(By.name("Date"));
	 Select sl1=new Select(date);
	 sl1.selectByVisibleText("10");
	 WebElement month=driver.findElement(By.name("Month"));
	 Select sl2=new Select(month);
	 sl2.selectByValue("3");
	 WebElement year=driver.findElement(By.name("Year"));
	 Select sl3=new Select(year);
	 sl3.selectByVisibleText("2011");	
	 WebElement hour=driver.findElement(By.name("Kund_F_BirthPlace_Hour"));
	 Select sl4=new Select(hour);
	 sl4.selectByIndex(6);
	 WebElement minute=driver.findElement(By.name("Kund_F_BirthPlace_Minute"));
	 Select sl5=new Select(minute);
	 sl5.selectByVisibleText("06");
	 WebElement am=driver.findElement(By.name("Kund_F_BirthPlace_AM"));
	 Select sl6=new Select(am);
	 sl6.selectByVisibleText("AM");
	 Thread.sleep(2000);
	}
}
