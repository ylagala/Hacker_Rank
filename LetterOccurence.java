import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class LetterOccurence {

	public static void main(String[] args) {
		
	    //Using Pattern and Matcher classes 
		String s ="elephant javep";
		Pattern pattern = Pattern.compile("[*e]");
		Matcher matcher = pattern.matcher(s);
		int count = 0;
		while (matcher.find()) {
		    count++;
		}
		System.out.println(count);
		
		//using JAVA8 Feature
		String str = "yeshwe";
		//long count1 = str.chars().filter(ch -> ch == 'e').count();
		System.out.println(str.chars().filter(ch -> ch == 'e').count());
		
		// Imperative approach
		String s1 = "heyeeee";
		char chr = 'e';
		int count2 = 0;
		  
		for (int i = 0; i < s1.length(); i++) {
		    if (s1.charAt(i) == chr) {
		        count2++;
		    }
		}
		System.out.println(count2);
		

	}

	
}
