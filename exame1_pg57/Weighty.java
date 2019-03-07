package exame1_pg57;

class Big {
	void doStuff(int x) { }
}
class Heavy extends Big {
	void doStuff(byte b) { }//COMPILA
	//protected void doStuff(int x) throws Exception { }//Illegal override
}
public class Weighty extends Heavy {
  void doStuff(byte x) { }//COMPILA
  //String doStuff(int x) { return "hi"; }
 // public int doStuff(int x) { return 7; }
 private int doStuff(char c) throws Error { return 1; }//COMPILA
 }
