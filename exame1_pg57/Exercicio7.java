package exame1_pg57;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Exercicio7 {

	public static void main(String[] args) {
		Date d = new Date();
		 DateFormat df;
		 Locale[] la = {new Locale("it", "IT"), new Locale("pt")};
		 for(Locale l: la) {
		 df = DateFormat.getDateInstance(DateFormat.FULL, l);
		 System.out.println(d.format(df));
		 }
	}
}
