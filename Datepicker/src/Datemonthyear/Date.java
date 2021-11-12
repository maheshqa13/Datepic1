package Datemonthyear;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date 
{
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\mahes\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://webdriveruniversity.com/Datepicker/index.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='form-control']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//table//th[@class=\"datepicker-switch\"])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//table//th[@class=\"datepicker-switch\"])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//table//th[@class=\"datepicker-switch\"])[3]")).click();
		Thread.sleep(1000);
		//Select_year.Yearpic("2022");
		driver.findElement(By.xpath("(//table)[3]//tbody//td//span [3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//table)[2]//tbody//td//span [3]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//table[1]//td)[18]")).click();
	}
}
