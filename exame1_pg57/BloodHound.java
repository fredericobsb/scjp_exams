package exame1_pg57;

class Dog 
{
	void makeNoise()
	{ 
		System.out.print("bark "); 
	}
	static void play() 
	{ 
		System.out.print("catching "); 
	}
}
class Bloodhound extends Dog 
{
	void makeNoise() 
	{ 
		System.out.print("howl "); 
	}
	public static void main(String[] args) 
	{
		new Bloodhound().go();
		super.play();//nao posso usar super em contexto estático.
		super.makeNoise();
	}
	void go() 
	{
		super.play();
		makeNoise();
		super.makeNoise();
	} 
}
