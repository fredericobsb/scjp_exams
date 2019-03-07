package exame4_pg325;

public class Cult extends Thread
{
	static int count = 0;
	public void run()
	{
		for(int i = 0; i < 100; i++) 
		{
			if(i == 5 && count < 3) 
			{
				Thread t = new Cult(names[count++]);
				t.start();
				try
				{
					//t.join();
					Thread.currentThread().join();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
			System.out.print(Thread.currentThread().getName() + " ");
		}
	 }
	 public static void main(String[] args)
	 {
		 new Cult("t0").start();
	 }
	 Cult(String s)
	 {
		 super(s); 
	 }
	 String[] names = {"t1", "t2", "t3"};
 }
