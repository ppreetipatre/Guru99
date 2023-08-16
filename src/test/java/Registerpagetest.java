import org.testng.annotations.BeforeTest;

import Baselayer.Baseclass;
import Pagelayer.Registerfunction;

public class Registerpagetest extends Baseclass
{
	private Registerfunction Registerfunction;
	@BeforeTest
	public void setup()
	{
		Baseclass.initialization();
	}
	
	public void validateregisterfunc()
	{
		Registerfunction r1 = new Registerfunction();
		Registerfunction.registerfunctionality("preeti","patre", "6523415","preeti@gmail.com", "", null, null, null, null, null, null);
		
	}
}
