
public class CountNoOfWords {

	public static void main(String[] args) {
		String str = "Hello,Capgemini.Hi%yesh/yes;res'atest";
		String[] wordCount = str.trim().split("[,./;:'*-+&^%$# ]");
		System.out.println(wordCount.length);

	}

}
