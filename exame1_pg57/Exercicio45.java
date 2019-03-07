package exame1_pg57;

public class Exercicio45 {

	public static void main(String[] args) {
		 String s = "1234";
		 StringBuilder sb = new StringBuilder(s.substring(2).concat("56").replace("7","6"));
		 System.out.println(sb.append("89").insert(3,"x"));//34568989 -> adiciona 'x' no indice 3.
	}

}
