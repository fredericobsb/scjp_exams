package exame2_pg155;

public class Kant extends Philosopher {
	// insert code here
	//Kant() { this("Bart"); }
	//Kant(String s) { super(s); }
	//B. Kant() { super("Bart"); }
	//Kant(String s) { super(s); }
	//C. Kant() { super(); }
	//Kant(String s) { super(s); }
	//D. Kant() { super("Bart"); }
	//Kant(String s) { this(); }
	//E. Kant() { super("Bart"); }
	//Kant(String s) { this("Homer"); }
	//insert code abovve
	public static void main(String[] args) {
	new Kant("Homer");
	new Kant();
	}
	}
	 class Philosopher {
	 Philosopher(String s) { System.out.print(s + " "); }
	 }
