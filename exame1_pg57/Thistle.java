package exame1_pg57;

class Weed
{
	protected static String s = "";
	final void grow()//retire final e vai compilar
	{
		s += "grow ";
	}
	static final void growFast()
	{
		s += "fast ";
	}
}
public class Thistle extends Weed
{
	void grow()
	{ 
		s += "t-grow "; 
	}
	
	void growFast() 
	{ 
		s+= "t-fast "; 
	}
	
 }
