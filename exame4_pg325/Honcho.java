package exame4_pg325;

public class Honcho{
	static boolean b1 = false;
	static int z = 7;
	static Long y;
	public static void main(String[] args)
	{
		for(int i = 0; i < 4; i++)
			go(i);
	}
	 static void go(int x)
	 {
		 try
		 {
			 if((x == 0) && (!b1 && z == 7)) 
				 System.out.print("0 ");
			 if(x < 2 ^ x < 10) 
				 System.out.print("1 ");
			 if((x == 2) && (y == null | (y.longValue() == 0))) 
				 System.out.print("2 ");
			 if(z <= (x + 4)) 
				 System.out.print("3 ");
		 }
		 catch(Exception e)
		 { 
			 System.out.print("e "); 
		 }
	 } 
}
