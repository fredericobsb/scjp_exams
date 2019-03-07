package exame1_pg57;

public class BirdHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String r = "0";
		int x = -1, y = -5;
		if(x < 5)
			if(y > 0)
				if(x > y)
					r += "1";
				else 
					r += "2";
			else
				r += "3";
		else
			r += "4";
		System.out.println(r);
	}
}
