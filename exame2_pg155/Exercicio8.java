package exame2_pg155;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Exercicio8{
	public static void main(String[] args) {
		try {
			 File file = new File("myFile.txt");
			 PrintWriter pw = new PrintWriter(file);
			 pw.println("line 1");
			 pw.close();
			 PrintWriter pw2 = new PrintWriter("myFile.txt");
			 pw2.println("line 2");
			 pw2.close();
			 
			 } catch (IOException e) { }
	}

}
