import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class EqualStack {

	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
	        
		    int h1[] = {3,2,1,1,1}; // sum of arrays equals to  5
	    
	        int h2[] = {4,3,2};
	       
	        int h3[] = {1,1,4,1};
	        int height = 0;
	        
	       System.out.println("hello h1");
	       for(int i=0; i<h1.length-1; i++) {
	        	for(int j=1; j<=h1.length-1; j++)
	        	{
	        		if( (h1[i] + h1[j]) == 5) {
	        		 System.out.println(h1[i] + "  " + h1[j]);	
	        		}
	        	}
	        }
	        System.out.println("hello h2");
	        
	        for(int i=0; i<h2.length-1; i++) {
	        	for(int j=1; j<=h2.length-1; j++)
	        	{
	        		if( (h2[i] + h2[j]) == 5) {
	        		 System.out.println(h2[i] + "  " + h2[j]);	   
	        		 
	        		 
	        		}
	        	}
	        }
	        
	        System.out.println("hello h3");
	        for(int i=0; i<h3.length-1; i++) {
	        	for(int j=1; j<=h3.length-1; j++)
	        	{
	        		if( (h3[i] + h3[j]) == 5) {
	        		 System.out.println(h3[i] + "  " + h3[j]);	
	        		 
	        		}
	        	}
	        }
	        
	      /* Arrays.parallelPrefix(h1, (a, b) -> (a + b));
	        Arrays.parallelPrefix(h2, (a, b) -> (a + b));
	        Arrays.parallelPrefix(h3, (a, b) -> (a + b));
	      Arrays.stream(h1).forEach(System.out::print);
	      System.out.println("*********");
	      Arrays.stream(h2).forEach(System.out::print);
	      System.out.println("*********");
	      Arrays.stream(h3).forEach(System.out::print);
	      System.out.println("*********");*/
	      
	    /*  System.out.println(Arrays.stream(h1).summaryStatistics().getSum());
	        System.out.println(Arrays.stream(h1).sum());
	        System.out.println("************"); //if (h1[i] == h2[j] && h2[j] == h3[k])
	        Arrays.stream(h2).filter(n -> (n<= 5 )).forEach(System.out::println);
	        System.out.println("************");
	        Arrays.stream(h3).filter(n -> (n <= 5 )).forEach(System.out::println);*/
	}

}
