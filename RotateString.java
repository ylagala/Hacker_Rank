
public class RotateString {

	public static void main(String[] args) {
		String inputString  = "Hacker Rank Training Day2";
		String reverseString = "" ;
		String[] words = inputString.trim().split(" ");
		
		for(int i=0; i<words.length; i++)
		{
			String word = words[i];//hacker
			String reverseWord = "";
			for (int j = word.length()-1; j >= 0; j--) 
			{
				reverseWord = reverseWord + word.charAt(j);
			}
			System.out.println(reverseWord);
			int length = reverseWord.length();
			
			reverseWord = reverseWord.charAt(length-1) + reverseWord.substring(0, length-1);
			reverseString = reverseString + reverseWord + " ";
				
		}
		
		System.out.println(reverseString);
		
	}

}
