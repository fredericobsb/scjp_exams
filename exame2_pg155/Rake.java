package exame2_pg155;

class GardenTool {
	static String s = "";
	String name = "Tool ";
	String teste = "Teste";
	GardenTool(String arg)
	{
		this(); 
		s += name; 
	}
	GardenTool()
	{ 
		s += "gt "; 
	}
}
public class Rake extends GardenTool {
	{ 
		name = "Rake "; 
	}
	Rake(String arg)
	{ 
		s += name;
	}
	public static void main(String[] args)
	{
		new GardenTool("hey ");
		new Rake("hi ");
		System.out.println(s);
	}
	{ 
		name = "myRake ";
	}
 }
