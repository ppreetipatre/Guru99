package Pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselayer.Baseclass;
import Utilitylayer.Utilsclass;

public class Registerfunction extends Baseclass 
{
	@FindBy(name="firstName")
	WebElement firstname;
	@FindBy(name="lastName")
	WebElement lastname;
	@FindBy(name="phone")
	WebElement phone1;
	@FindBy(name="userName")
	WebElement userName;
	@FindBy(name="address1")
	WebElement address1;
	@FindBy(name="city")
	WebElement city1;
	@FindBy(name="state")
	WebElement state1;
	@FindBy(name="postalCode")
	WebElement postalCode1;
	@FindBy(name="email")
	WebElement email11;
	@FindBy(name="password")
	WebElement password ;
	@FindBy(name="confirmPassword")
	WebElement confirmPassword1;
	@FindBy(name="submit")
	WebElement submit1;
	@FindBy(linkText=" sign-in ")
	WebElement  signin1 ;

	public Registerfunction()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void registerfunctionality(String fname, String lname,String Phone,String email,String address,String City,String State,String Postal,String Uname,String Password,String cpassword)
	{
	Utilsclass.sendkeys(firstname, fname);
	Utilsclass.sendkeys(lastname, lname);
	Utilsclass.sendkeys(phone1, Phone);
	Utilsclass.sendkeys(userName, email);
	Utilsclass.sendkeys(address1, address);
	Utilsclass.sendkeys(city1, City);
	Utilsclass.sendkeys(state1, State);
	Utilsclass.sendkeys(postalCode1, Postal);
	Utilsclass.sendkeys(userName, Uname);
	Utilsclass.sendkeys(password, Password);
	Utilsclass.sendkeys(confirmPassword1, cpassword);
	Utilsclass.click(submit1);
	Utilsclass.click(signin1);
	Utilsclass.sendkeys(userName, Uname);
	Utilsclass.sendkeys(password, Password);
	}
	
	
	
	
	
	
}
