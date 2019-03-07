package exame4_pg325;

interface Gadget {
int patent = 12345;
Gadget doStuff();
}
public class TimeMachine implements Gadget{
	int patent = 34567;
	public static void main(String[] args) {
		new TimeMachine().doStuff();
	}
	TimeMachine doStuff() {
		System.out.println( ++patent);
		return new TimeMachine();
	} 
}
