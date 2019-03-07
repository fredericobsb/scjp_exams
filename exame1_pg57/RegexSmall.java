package exame1_pg57;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexSmall {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("a");
		Matcher m = p.matcher("abaabaaba");//imprime 0,2,3,5,6,8
		while(m.find())
		{
			System.out.print(m.start() + " ");//mostra os indices onde aparecem o padrao passado.
		}
		Pattern p2 = Pattern.compile("\\w");//qualquer digito, letra ou underscore.
		Matcher m2 = p2.matcher("a 1 56 _Z");//imprime 0,2,4,5,7,8
		while(m2.find())
			System.out.print(m2.start() + " ");
		
		Pattern p3 = Pattern.compile("0[xX][0-9a-fA-F]");
		Matcher m3 = p3.matcher("12 0x 0x12 0Xf 0xg");
		while(m3.find())
			System.out.print(m3.start() + " ");
		
		Pattern p4 = Pattern.compile("\\d+");//1 ou mais digitos
		Matcher m4 = p4.matcher("1 a12 234b");
		while(m4.find())
			System.out.println(m4.start() + " " + m4.group(0));
		
		Pattern p5 = Pattern.compile("[^abc]");//imprime tudo, menos abc.
		Matcher m5 = p5.matcher("abc 98 d c e");
		while(m5.find())
			System.out.println(m5.start() + " " + m5.group(0));
		
		Pattern p6 = Pattern.compile("proj1([^,])*");//imprima 0 ou mais caracteres que comecem com 'proj1' e nao tenham virgula.
		Matcher m6 = p6.matcher("proj3.txt,proj1sched.pdf,proj1,proj2,proj1.java");
		while(m6.find())
			System.out.println(m6.start() + " " + m6.group(0));
		
		Pattern p7 = Pattern.compile("\\d\\d\\d([-\\s])?\\d\\d\\d\\d");//imprima 0 ou uma ocorrencia de 3 digitos seguidos 
		Matcher m7 = p7.matcher("1234-567");                           //de '-' ou ' ' e seguidos de mais 4 digitos.
		if(m7.find())
			System.out.println(m7.start() + " " + m7.group(0));
		else
			System.out.println("nao achei!");
		
		Pattern p8 = Pattern.compile("\\d{3}([-\\s])?\\d{4}");//idem ao de cima, mas com sintaxe reduzida.
		Matcher m8 = p8.matcher("1234-567");
		if(m8.find())
			System.out.println(m8.start() + " " + m8.group(0));
		else
			System.out.println("nao achei!");
	}

}
