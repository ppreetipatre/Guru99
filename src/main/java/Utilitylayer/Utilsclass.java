package Utilitylayer;

import org.openqa.selenium.WebElement;

import Baselayer.Baseclass;

public class Utilsclass extends Baseclass
{
	public static void sendkeys(WebElement wb, String value)
	{
		if(wb.isDisplayed()&&wb.isEnabled())
		{
			wb.sendKeys(value);
		}
		
	}
	
	public static void click(WebElement wb)
	{
		if(wb.isDisplayed()&&wb.isEnabled())
		{
			wb.click();
		}
	}
	
	
	
}
