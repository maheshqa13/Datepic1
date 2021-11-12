package Datemonthyear;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Select_year 
{
	public static WebDriver driver;

	public static void Yearpic(String value)
	{
		List<WebElement> years = driver.findElements(By.xpath("(//table[@class='table-condensed'])[2]//td//span"));
		for(WebElement year:years) 
		{
			for(int i=0;i<=years.size()-1;i++)
			{
					
			if(year.getText().contains(value))
			{
				driver.findElement(By.xpath("(//table)[3]//tbody//td//span ["+i+"]")).click();
			}
			}
		}
	}
	
	
}

