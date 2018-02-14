import java.util.Arrays;


public class StringOccurence {

	public static void main(String[] args) {
		String str= "anps, anps, anps, bbo, ehllo";
	    String[] s= str.trim().split("[, ]");
	    int count=0;
	    Arrays.sort(s);
	    for(int i = 0;i< s.length; i++){
	        String temp = s[i];
	        count++;
	        System.out.print(temp+" ");
	        
	        for(int j = i+1; j < s.length; j++){
	            String temp2 = s[j];
	            if(temp.compareTo(temp2) == 0){
	                System.out.print(temp2+" ");
	                i++;
	            }
	        }
	        System.out.println();
	    }
	    

	}

}
