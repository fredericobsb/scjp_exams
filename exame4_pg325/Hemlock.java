package exame4_pg325;

public class Hemlock{
	static StringBuffer sb;
	StringBuffer sb2;
	public static void main(String[] args)
	{
		sb = sb.append(new Hemlock().go(new StringBuffer("hey")));
		System.out.println(sb);
	}
	{
		sb2 = new StringBuffer("hi ");
	}
	StringBuffer go(StringBuffer s)
	{
		System.out.print(s + " oh " + sb2);
		return new StringBuffer("ey");
	}
	static
	{
		sb = new StringBuffer("yo ");
	}
 }