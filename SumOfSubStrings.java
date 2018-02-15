import java.math.BigInteger;
import java.util.Scanner;


public class SumOfSubStrings {

	static long substrings(String balls) {
		int len = balls.length();
		long sum = 0;
		String[] s = new String[len];
		for(int i=0; i<=len-1; i++)
		{
			for(int j=i; j<=len; j++){
			 s[i] = balls.substring(i,j);
			 if(i != j )
			 sum = sum +Long.valueOf(s[i]);
			}
		}
		
		return sum;
        
    }

	public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String balls = in.next();
	        long result = substrings(balls);
	        System.out.println(result);
	        
	        
	        in.close();
	    }

	}
