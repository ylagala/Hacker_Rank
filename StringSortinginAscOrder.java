import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class StringSortinginAscOrder {
	
	   public static int StringAsIntegerCompare(String s1,String s2)
	    {
	         if(s1.length() > s2.length()) return 1;
	        if(s1.length() < s2.length()) return -1;
	        for(int i = 0; i < s1.length(); i++)
	        {
	            if((int)s1.charAt(i) > (int)s2.charAt(i)) return 1;
	            if((int)s1.charAt(i) < (int)s2.charAt(i)) return -1;
	        }
	        return 0;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner in = new Scanner(System.in);
		        int n = in.nextInt();
		        String[] unsorted = new String[n];
		        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
		            unsorted[unsorted_i] = in.next();
		        }
		        
		        
		       Arrays.sort(unsorted,new Comparator<String>() {
		            @Override
		            public int compare(String a, String b) 
		            {
		                return StringAsIntegerCompare(a,b);
		            }
		        });
		        
		        for(int i=0;i<unsorted.length;i++)
		        System.out.println(unsorted[i]);
		    }
		 
		
	}


