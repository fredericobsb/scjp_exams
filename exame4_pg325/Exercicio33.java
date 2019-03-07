package exame4_pg325;

public class Exercicio33 {

	public static void main(String[] args) {
		 int count = 0;
		 outer:
		 for(int x = 0; x < 5; x++)
		 {
		    middle:
		    for(int y = 0; y < 5; y++)
		    {
		       if(y == 1) 
		    	   continue middle;
		       if(y == 3) 
		    	   break middle;
		       count++;
		    }
		    if(x > 2) 
		    	continue outer;
		    count = count + 10;
		 }
		 System.out.println("count: " + count);
	}
}
