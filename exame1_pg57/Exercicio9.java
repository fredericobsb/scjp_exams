package exame1_pg57;

public class Exercicio9 {

	static String s = "";
	public static void main(String[] args) {
		System.out.println("metodo main");
		try{
			doStuff(args);
		}
		catch(Error e){
			s += "e ";
		}
		s += "x ";
		System.out.println(s);
	}
	static void doStuff(String [] args){
		if(args.length == 0)
			throw new IllegalArgumentException();
		s += "d ";
	}

}
