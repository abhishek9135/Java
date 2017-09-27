import java.util.*;
import java.text.*;
public class DateTimeProgram {
	public static void main(String args[]) {
		Date today;
		Locale currentLocale=new Locale("fr", "FR");
		String dateOut;
		DateFormat dateFormatter;

		dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT,
							   currentLocale);
		today = new Date();
		dateOut = dateFormatter.format(today);

		System.out.println(dateOut + " " + currentLocale.toString());
	}
}
