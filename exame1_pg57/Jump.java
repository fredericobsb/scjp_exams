package exame1_pg57;

class Paratrooper implements Runnable{
	public void run(){
		System.out.println(Thread.currentThread().getName() + " ");
	}
}

public class Jump {
	static Paratrooper p;
	static{
		p = new Paratrooper();
	}
	//por que o fluxo do codigo vem para esse bloco quando o construtor Jump() é chamado?
	{
		Thread t1 = new Thread(p, "bob");
		t1.start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jump();
		new Thread(new Runnable(){
			public void run(){
				;
			}
		}, "carol").start();
		new Thread(new Paratrooper(), "alice").start();
	}
	Jump(){
		Thread t2 = new Thread(p, "ted");
		t2.start();
	}
}
