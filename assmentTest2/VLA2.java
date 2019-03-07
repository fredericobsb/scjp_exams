package assmentTest2;

import java.util.*;
public class VLA2 implements Comparator<VLA2>{
int dishSize;
public static void main(String[] args)
{
	VLA2[] va = {new VLA2(40), new VLA2(200), new VLA2(60)};
	Arrays.sort(va, va[0]);//sempre ordena do mesmo jeito, mesmo que mude de va[0] para va[1]: 200, 60, 40.
	//a linha abaixo busca o índice do 'new VLA2(40)' no array va.
	int index = Arrays.binarySearch(va, new VLA2(30), va[0]);
	System.out.print(index + " ");
	index = Arrays.binarySearch(va, new VLA2(80), va[0]);//20 -> -4, 80 -> -2
	System.out.print(index);
 }
 public int compare(VLA2 a, VLA2 b){
	 int result = b.dishSize - a.dishSize;
	 return result;
 }
 VLA2(int d) { dishSize = d; }
 }
