/**
 * Hacker Rank Day1
 */

/**
 * Concepts: String, String Buffer and String Builder 
 *
 */
public class StringPractice {

	public static void main(String[] args) {
		System.out.println("*****String Practice*****");
		
		
		String str= "Hacker Rank Day1";
		System.out.println("*****"+str+"*****");
		System.out.println("Print length of the input string :"+str.length());
		
		System.out.println();
		System.out.println("*** Create a String using char Array ***");
		char[] chr = {'h', 'a' ,'c', 'k','e', 'r','.'};
		String cStr = new String(chr);
		System.out.println("*****"+cStr+"*****");
		System.out.println();
		System.out.println("*** isEmpty(),charAt(),codepointAt(),codePointBefore(), codePointAt() *** String methods ***");
		System.out.println("***** Method isEmpty():"+cStr.isEmpty()+"*****");
		System.out.println("*****charAt() Method :"+cStr.charAt(0)+"*****");
		System.out.println("codePointAt() method is used for printing the ASCII value of the String :"+cStr.codePointAt(1));
		System.out.println(cStr.codePoints().count());
		
		int i = cStr.codePointAt(6);
		System.out.println(i);
		
		Double d = (double) cStr.codePointBefore(7);
		System.out.println(d);
		
		System.out.println();
		System.out.println("***** CompareTo() Method ****");
		String s1 = "YLAGALA";
		String s2 = "ylagala";
		System.out.println("negative ASCII value is printed as s1 < s2 :" + s1.compareTo(s2)); // 
		System.out.println("positive ASCII value is printed as s1 < s2 :"+ s2.compareTo(s1));
		System.out.println("0 is printed as both the strings are equal : "+s1.compareToIgnoreCase(s2));

		
		System.out.println();
		System.out.println("***** String concat() method Concatenates the specified string to the end of this string.*****");
		String str1 = "yla" ;
		String str2 = "gala";
		System.out.println(str1.concat(str2));
		
		System.out.println();
		System.out.println("***** String equals() methods *****");
		String estr1 = "yesh";
		String estr2 = "YESH";
		System.out.println(estr1.equals(estr2));
		System.out.println(estr1.equalsIgnoreCase(estr2));
		
		
		String s = "saveChangesInTheEditor";
        int count = 0;
        for (String w : s.split("(?<!(^|[A-Z]))(?=[A-Z])|(?<!^)(?=[A-Z][a-z])")) {
            count++;
       }
        System.out.println(count);
		
		
	}

}
