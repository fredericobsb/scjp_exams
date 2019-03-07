package exame4_pg325;

import java.text.DateFormat;

public class Vogue {

	public static void main(String[] args) {
		DateFormat df1 = DateFormat.getInstance();
		DateFormat df2 = DateFormat.getInstance(DateFormat.SHORT);
		DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL);
		DateFormat df4 = DateFormat.getDateInstance(DateFormat.EXTENDED);
	}

}
