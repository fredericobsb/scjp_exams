package exame1_pg57;

class SuperCool{
	static String os = "";
	void doStuff(){
		os += "super ";
	}
}

public class Cool extends SuperCool{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Cool().go();
	}
	void go(){
		SuperCool s = new Cool();
		Cool c = (Cool) s;
		c.doStuff();
		s.doStuff();
		this.doStuff();
		super.doStuff();
		//c.super.doStuff(); 
		//s.super.doStuff();
		//this.super.doStuff();
	}
	void doStuff(){
		os += "cool ";
	}
}
