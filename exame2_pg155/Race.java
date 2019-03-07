package exame2_pg155;

public class Race{
	public static void main(String[] args){
		Horse h = new Horse();
		Thread t1 = new Thread(h, "Andi");
		Thread t2 = new Thread(h, "Eyra");
		new Race().go(t2);
		t1.start();
		t2.start();
	 }
	 void go(Thread t)
	 {
		 t.start();
	 }
}
class Horse implements Runnable {
	
	 public void run(){
		 System.out.print(Thread.currentThread().getName() + " ");
	 } 
 }
