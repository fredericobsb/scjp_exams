package exame2_pg155;

import java.util.*;
class Snack {
static List<String> s1 = new ArrayList<String>();
}
public  class Chips extends Snack{
	public static void main(String[] args){
		List c1 = new ArrayList();
		s1.add("1"); s1.add("2");
		c1.add("3"); c1.add("4");
		getStuff(s1, c1);
	 }
 static void getStuff(List<String> a1, List a2){
	 for(String s1: a1) 
		 System.out.print(s1 + " ");
	 for(String s2: a2) 
		 System.out.print(s2 + " ");
 } }
