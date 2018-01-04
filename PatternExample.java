import java.util.*;
import java.util.regex;
public class PatternExample {
	public static void main(String[] args) {
		Pattern pattern = pattern.compile(".xx.");
		Matcher matcher = pattern.matcher("MxxY");
		//System.out.println("Input String matches regex - "+matcher.matches());
		pattern = Pattern.compile("*xx*");
	}
}