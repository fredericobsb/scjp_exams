package exame4_pg325;

public class Maize
{
	public static void main(String[] args)
	{
		String s = "12";
		s = s.concat("ab");
		s = go(s);
		System.out.println(s);
	}
	static String go(String s)
	{
		 s.concat("56");
		 return s;
	}
}
