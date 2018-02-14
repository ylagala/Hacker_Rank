
public class Swap2Strings {

	public static void main(String[] args) {
		String s1 = "Yesh";
		String s2 = "Resh";
		
		s1 = s1 + s2;
		System.out.println(s1);
		s2 = s1.substring(0,s1.length()-s2.length());
		System.out.println(s2);
		s1 = s1.substring(s2.length());
		System.out.println(s1+ " -- swapped-- " +s2);
		

	}

}
