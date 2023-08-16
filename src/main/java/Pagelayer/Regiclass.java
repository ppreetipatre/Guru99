package Pagelayer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Baselayer.Baseclass;
import Utilitylayer.Utilsclass;


public class Regiclass {

	
	public class Methodoverloading extends Baseclass
	{
	@FindBy(name = "firstName")
	WebElement firstname;
	@FindBy(name = "lastName")
	WebElement lastname;
	@FindBy(name = "phone")
	WebElement phone1;
	@FindBy(name = "userName")
	WebElement userName;
	@FindBy(name = "address1")
	WebElement address1;
	@FindBy(name = "city")
	WebElement city1;
	@FindBy(name = "state")
	WebElement state1;
	@FindBy(name = "postalCode")
	WebElement postalCode1;
	@FindBy(name = "email")
	WebElement email11;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(name = "confirmPassword")
	WebElement confirmPassword1;
	@FindBy(name = "submit")
	WebElement submit1;


		
		public void contactinfo(String fname) {
			Utilsclass.sendkeys(firstname, fname);

		}
		public void contactinfo(String fname,String lname) {
			Utilsclass.sendkeys(firstname, fname);
			Utilsclass.sendkeys(lastname, lname);
		}

		public void contactinfo(String fname,String lname,String ph) {
			Utilsclass.sendkeys(firstname, fname);
			Utilsclass.sendkeys(lastname, lname);
			Utilsclass.sendkeys(phone1, ph);
			
		}
		public void contactinfo(String fname,String lname,String ph,String uname) {
			Utilsclass.sendkeys(firstname, fname);
			Utilsclass.sendkeys(lastname, lname);
			Utilsclass.sendkeys(phone1, ph);
			Utilsclass.sendkeys(userName, uname);
		}
		public void mailinginfo(String address)
		{
			Utilsclass.sendkeys(userName, address);
		}
		
		public void mailinginfo(String address,String city)
		{
			Utilsclass.sendkeys(userName, address);
			Utilsclass.sendkeys(city1, city);
		}
		public void mailinginfo(String address,String city,String State)
		{
			Utilsclass.sendkeys(userName, address);
			Utilsclass.sendkeys(city1, city);
			Utilsclass.sendkeys(state1, State);
		}
		public void mailinginfo(String address,String city, String State, String postalc)
		{
			Utilsclass.sendkeys(userName, address);
			Utilsclass.sendkeys(city1, city);
			Utilsclass.sendkeys(state1, State);
			Utilsclass.sendkeys(postalCode1, postalc);
		}
		
		
		
		
	}

}

	
	
	
	
	
	
	
	
	
	
	
	
	

