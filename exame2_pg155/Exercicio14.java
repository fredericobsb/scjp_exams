package exame2_pg155;

public class Exercicio14 {

	public static void main(String[] args) {
		String s = "4.5x4.a.3";//separe por ponto seguido de alguma letra? "4.5x4.a.3y" - >4, 5x4, a
		 String[] tokens = s.split("\\s");
		 for(String o: tokens)
		 System.out.print(o + " ");
		 System.out.print(" ");
		 tokens = s.split("\\..");
		 for(String o: tokens)
		 System.out.print(o + " ");

	}

}
