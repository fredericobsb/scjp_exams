package exame1_pg57;

public class Humping
{
	public static void main(String[] args)
	{
		String r = "-";
		char[] c = {'a', 'b', 'c', 'z'};
		for(char c1: c)
			switch (c1)
			{
				case 'a': 
					r += "a";
					//break;
				case 'b': 
					r += "b"; 
					break;
				default: 
					r += "X";
					//break;
				case 'z': 
					r+= "z";
					//break;
			}
		System.out.println(r);
	}
}
