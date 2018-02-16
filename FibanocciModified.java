import java.math.BigInteger;
import java.util.Scanner;


public class FibanocciModified {
	static BigInteger fibonacciModified(BigInteger t1, BigInteger t2, int n) {
        BigInteger [] t = new BigInteger[n];
        for(int i=0; i<n; i++)
        {

            if(i == 0) 
                t[i] = t1;    
            else if(i == 1)           
                t[i] = t2 ;
            else
                t[i] = t[i-2].add(t[i-1].multiply(t[i-1])) ;         
        }
        return t[t.length-1];
        
    }

    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);*/
    	BigInteger t1 = new BigInteger("0");
    	BigInteger t2 = new BigInteger("1");
        int n = 10;
    	BigInteger result = fibonacciModified(t1,t2,n);
        System.out.println(result);
        //in.close();
    }
}
