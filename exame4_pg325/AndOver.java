package exame4_pg325;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AndOver {
	public static void main(String[] args) {
		List g = new ArrayList();
		g.add(new Gaited("Eyra"));
		g.add(new Gaited("Vafi"));
		g.add(new Gaited("Andi"));
		Iterator i2 = g.iterator();
		while(i2.hasNext()){
			 System.out.print((Gaited) i2.next().name + " ");
		} 
	} 
}
	 class Gaited {
	 public String name;
	 Gaited(String n) { name = n; }
}
