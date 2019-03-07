package exame1_pg57;

import java.sql.Array;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Decaf {
	static String arg1 = "0([0-7])?";// ? = 0 ou 1 vez. Encontre onde começa com 0 seguido de um numero de 0 a 7 
														//que apareça 0 ou uma vez.
	static String arg2 = "1012 0208 430";
	public static void main(String[] args)
	{
		 Pattern p = Pattern.compile(arg1);
		 Matcher m = p.matcher(arg2);
		 while(m.find())
		 System.out.println(m.start() + " " + m.group() + " ");
		 
		 Pattern p1 = Pattern.compile("0([0-7])*");//imprima onde começa com 0 seguido de zero ou sete 0 vez ou mais de 1 vez.
		 Matcher m1 = p1.matcher("1012 0208 430");//imprime 012, 020, 0
		 while(m1.find())
			 System.out.println(m1.start() + " " + m1.group(0));
		 
		 Pattern p2 = Pattern.compile("0([0-7])+");// + = 1 ou mais vezes.
		 Matcher m2 = p2.matcher("1012 0208 430");//imprime 012, 020
		 while(m2.find())
			 System.out.println(m2.start() + " " + m2.group(0));
	}
}
