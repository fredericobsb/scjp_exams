package exame1_pg57;

class Locker extends Thread
{
	private static Thread t;
	public void run()
	{
		if(Thread.currentThread() == t)
		{
			System.out.println("1 ");
			synchronized(t)
			{
				doSleep(2000);
				System.out.println("thread dormindo 2 segundos");
			}
			System.out.println("2 ");
		}
		else
		{
			System.out.println("3 ");
			synchronized(t)
			{
				doSleep(1000);
				System.out.println("thread dormindo 1 segundo ");
			}
			System.out.println("4 ");
		}
	}
	private void doSleep(long delay)
	{
		try 
		{ 
			Thread.sleep(delay); 
		} 
		catch(InterruptedException ie) 
		{ 
			; 
		}
	}
	public static void main(String args[])
	{
		t = new Locker();
		t.start();
		new Locker().start();
	} 
}
