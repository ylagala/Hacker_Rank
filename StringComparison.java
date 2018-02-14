
public class StringComparison {

	public static void main(String[] args) {
		String str = "yesh";
		String str2 = "Yesh";
		
		if(str == str2) System.out.println(true);
		else System.out.println(false);
		
		if(str.equalsIgnoreCase(str2)) System.out.println(true);
		else
			System.out.println(false);
		
		System.out.println(str.compareToIgnoreCase(str2));
		System.out.println(str.compareTo(str2));
		
		System.out.println(str.contains("y"));
		System.out.println(str.contentEquals(str2));
		System.out.println(str.concat(" "+str2));
		String h = str.concat(" "+str2);
		System.out.println(h.hashCode());
		String h1 = str + " " + str2 ;
		System.out.println(h1.hashCode());
		
		System.out.println(h.contentEquals(h1));
		
	
	}

}
