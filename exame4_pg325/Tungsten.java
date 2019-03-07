package exame4_pg325;

abstract class Thing { 
	static String s = ""; 
	Thing() {
		s += "t ";
	} 
}
class Steel extends Thing {
	Steel() { 
		s += "s "; 
	}
	Steel(String s1) {
		s += s1;
		new Steel();
	}
}
public class Tungsten extends Steel {
	Tungsten(String s1) {
		s += s1;
		new Steel(s);
	}
	public static void main(String[] args) {
	new Tungsten("tu ");
	System.out.println(s);
	} 
}
