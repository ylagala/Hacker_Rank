import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class StringOccur {

	public static void main(String[] args) {
		String str= "Java Hacker Java Rank Java Capgemini Hacker Rank";
		String[] s = str.trim().split(" ");
		//System.out.println(s.length);
		Arrays.sort(s);
		
		 Map<String,Integer> repeatationMap= new HashMap<String,Integer>();
		    for(String str1 : s){
		        if(repeatationMap.containsKey(str1)) {
		            repeatationMap.put(str1,repeatationMap.get(str1) + 1);
		            System.out.println(repeatationMap.get(str1) + str1);
		        }
		        else {
		            repeatationMap.put(str1, 1);
		        }
		    }

		    int count = 0;
		    for(int repatCount : repeatationMap.values()){
		        if(repatCount > 1) {
		            count++;
		        }
		    }
		    
		    System.out.println(count);

		

	}

}
