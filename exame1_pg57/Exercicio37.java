package exame1_pg57;

public class Exercicio37
{
	static String s = "";
	public static void main(String[] args)
	{
		try
		{
			doStuff();
		}
		catch(Exception ex)
		{
			s += "c1 ";
		}
		System.out.println(s);
	}
	static void doStuff() throws RuntimeException
	{
		try
		{
			s += "t1 ";
			throw new IllegalArgumentException();
		}
		catch(IllegalArgumentException ie)
		{
			s += "c2 ";
		}
		throw new IllegalArgumentException();
	}
}
