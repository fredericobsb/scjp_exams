package exame1_pg57;
public class Grids{
	 public static void main(String[] args)
	 {
		 int [][] ia2;
		 int [] ia1 = {1,2,3};
		 Object o = ia1;
		 ia2 = new int[3][3];
		 ia2[0] = (int[])o;
		 ia2[0][0] = (int[])o;//NAO COMPILA
	 } 
}
