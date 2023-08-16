package Baselayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass 
{
	protected  static  WebDriver driver ;
	
	public static void initialization()
	{
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	driver.manage().deleteAllCookies();
	
	
	
	
	
	
	}
	
	
	
}
