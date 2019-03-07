package exame4_pg325;

public class Exercicio42 {
	public static void main(String[] args)
	{
		System.out.println("main");
		try
		{
			throw new Error();
		}
		catch (Error e)
		{
			try
			{
				throw new RuntimeException();
			}
			catch (Throwable t)
			{ 
				t.printStackTrace();
			}
		}
		System.out.println("phew");
	}
}
