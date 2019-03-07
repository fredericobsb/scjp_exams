package exame2_pg155;

public class Stubborn implements Runnable{

	static Thread t1;
	static int x = 5;
	public void run()
	{
		System.out.println("entrei no metodo run" + Thread.currentThread().getName());
		if(Thread.currentThread().getId() == t1.getId())
			shove();
		else 
			push();
	}
	 static synchronized void push()
	 { 
		 System.out.println("entrei no metodo PUSH" + Thread.currentThread().getName());
		 shove(); 
	 }

	 static void shove()
	 {
		 System.out.println("entrei no metodo shove" + Thread.currentThread().getName());
		 synchronized(Stubborn.class)
		 {
			 System.out.println("entrei no syncrhonized. vixe!" + Thread.currentThread().getName());
			 System.out.println(x-- + " ");
			 try 
			 { 
				 System.out.println("entrei no try, pra dormir 2000" + Thread.currentThread().getName());
				 Thread.sleep(2000); 
			 } 
			 catch (Exception e) 
			 { 
				 ; 
			 }
		}
		 if(x > 0) 
			 push();
	 } 

	 public static void main(String[] args)
	 {
		 t1 = new Thread(new Stubborn());
		 t1.start();
		 new Thread(new Stubborn()).start();
	 }
}
