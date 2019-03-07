package exame4_pg325;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VC {

	public static void main(String[] args)
	{
		List<Integer> x = new ArrayList<Integer>();
		Integer[] a = {3, 1, 4, 1};
		x = Arrays.asList(a);
		a[3] = 2;
		x.set(0, 7);
		for(Integer i: x) 
			System.out.print(i + " ");
		x.add(9);
		System.out.println(x);
	}
}
