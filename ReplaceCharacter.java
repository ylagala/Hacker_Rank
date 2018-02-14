import java.util.regex.Pattern;


public class ReplaceCharacter {

	public static void main(String[] args) {
		
		//Using replace all method
		String str ="Hacker Rank Training";
		char c = 'i';
		int count =0;
		
		//find no of occurrence and then replace.
		//System.out.println(str.chars().filter(ch -> ch == c).count());
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) == c)
			{
				count++;
			}
		}
		System.out.println(count);
		str = str.replaceAll("a", "z");
		System.out.println(str);
		
		
		//Exploring Replace and ReplaceAll method
		
		String s1 = "Hacker,./ Rank Java Capgemini Java";
		s1 = s1.replaceAll("[,./ ]", "");
		s1 = s1.replaceFirst("Java", " ");
		System.out.println(s1);
		
		String Str = new String("Welcome to example.com");
	      
	      
	      Str = Str.replaceFirst("(.*)", "java") ;
	      System.out.println(Str);
		
		

	}

}
