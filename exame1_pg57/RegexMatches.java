package exame1_pg57;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

	   public static void main( String args[] ) {
	      // String to be scanned to find the pattern.
	      /*
		   String cep1 = "75134-290";
	      String cep2 = "75134-29a";
	      String pattern = "\\d{5}-\\d{2}";
			*/
		   String linha1 = "Palavra que será pega pelo ReGeX";
		   String pattern = "0([0-7])?";//só maiuscula
	      // Create a Pattern object
	      Pattern r = Pattern.compile(pattern);

	      // Now create matcher object.
	      Matcher m = r.matcher(linha1);
	      while(m.find( ))
	      {
	         System.out.println(m.group());
	      }
	   }
	}
