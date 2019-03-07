package exame2_pg155;

public class SimplesThreadEstudo extends Thread{

	static int [] numeros = {1,2,3,4};
	
	public SimplesThreadEstudo(String letras){
		//entraLetra();
	}
	public SimplesThreadEstudo(int [] numeros){
		//entraLetra();
	}
	static Thread  a, b, c;
	
	public static void main(String[] args) {
		a = new Thread(new SimplesThreadEstudo("A,B,C,D"));
		b = new Thread(new SimplesThreadEstudo(numeros));
		
		a.start();
		b.start();
	}
	
	 void entraLetra()
	{
		System.out.println("entrei no metodo entraLetra()" + Thread.currentThread().getName());
		try
		{
			for(int i = 0; i < 3; ++i)
				System.out.println(Thread.currentThread().getName() + "imprimindo");
			/*
			System.out.println("entrei no TRY do metodo entraLetra()" + Thread.currentThread().getName());
			if(Thread.currentThread().getId() == a.getId())
			{
				Thread.sleep(5000);
				System.out.println("Thread do 5000: " + Thread.currentThread().getId() + " acordou e esta imprimindo");
			}
			if(Thread.currentThread().getId() == b.getId())
			{
				Thread.sleep(10000);
				System.out.println("Thread do 10000: " + Thread.currentThread().getId() + " acordou e esta imprimindo");
			}
			*/
				
		}
		catch(Exception e)
		{
			System.out.println("erro no try de entraLetra()" + Thread.currentThread().getName());
		}
	}

	@Override
	public void run()//run *************************************************
	{
		System.out.println("entrei no RUN " + Thread.currentThread().getName());
		//entraLetra();
		
		if(Thread.currentThread().getId() == a.getId())
		{
			System.out.println("condicao A");
			entraLetra();
			try
			{
				System.out.println("Tread: " + Thread.currentThread().getName() + " entrou no try e vai mimir");
				Thread.sleep(5000);
			}
			catch(Exception e){
				System.out.println("erro no try");
			}
		}
		if(Thread.currentThread().getId() == b.getId())
		{
			System.out.println("condicao B");
			entraLetra();
			try
			{
				Thread.sleep(5000);
			}
			catch(Exception e){
				System.out.println("erro no try");
			}
			
		}
		/*	
		if(Thread.currentThread().getId() == b.getId())
			System.out.println("numeros");
		*/
	}
	synchronized void teste(){
		System.out.println("sincronized metodo");
	}
}

