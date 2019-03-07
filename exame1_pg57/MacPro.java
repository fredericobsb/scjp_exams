package exame1_pg57;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MacPro extends Laptop
{
	public static void main(String[] args)
	{
		new MacPro().crunch();
	}
	// insert code here
	//void crunch(){}//compila
	//void crunch()throws Exception{}//nao compila
	//void crunch(int x)throws Exception{}// dá erro em new MacPro().crunch();
	//void crunch()throws RuntimeException{}//compila
	void crunch()throws FileNotFoundException{}//dá erro em new MacPro().crunch();
}
class Laptop
{
	void crunch() throws IOException { }
}
