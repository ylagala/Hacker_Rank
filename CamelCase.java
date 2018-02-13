import java.util.Scanner;


public class CamelCase {

	   	    public static void main(String[] args) {
	        String s = "saveChangesInTheEditor";
	        int count = 0;
	        for (String w : s.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])")) {
	            count++;
	       }
	        System.out.println(count);
	       
	    }

}
