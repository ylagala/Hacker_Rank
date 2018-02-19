import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.stream.Stream;


public class MapsExample {

	public static void main(String[] args) {
		HashMap hm = new HashMap<>();
		hm.put(1, "Yesh");
		hm.put(2, "Resh");
		hm.put(3, "RiYa");
		
		System.out.println("Using put method :"+hm);
		System.out.println("Using Get Method: "+hm.get(3));
		
		HashMap hm1 = new HashMap<>();
		hm1.putAll(hm);
		System.out.println("PutAll() method: "+hm1);
		
		//Iterating and displaying the values present in Hashmap 
		//using Set,Iterator and Entryset methods
		  // Get a set of the entries
	      Set set = hm.entrySet();
	      // Get an iterator
	      Iterator i = set.iterator();
	      // Display elements 
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.println(me.getKey() + ": " + me.getValue());
	      }
	      
	      System.out.println("isEmpty() method: "+hm.isEmpty());
	      hm.clear();
	      System.out.println("Erasing the data present in hashmap using clear method: "+hm);
		
	      HashMap hm2 = (HashMap) hm1.clone();
	      System.out.println("returning hashmap values using shallow cloning: "+ hm2);
	      
	      System.out.println("Compare values using equals method after cloning: "+hm2.get(1).equals(hm1.get(1)));
	      System.out.println("ContainsKey method: "+hm1.containsKey(1));
	      System.out.println("****PutIfAbsent method will insert the key and the value if key doesnt exist****");
	      hm1.putIfAbsent(4, "YiRa");
	      System.out.println("PutIfAbsent method: "+hm1);
	      hm1.putIfAbsent(3, "YiRaa");
	      System.out.println("PutIfAbsent method: "+hm1);
	      
	      System.out.println("Size() method: "+hm1.size());
	      
	     System.out.println("ContainsKey method : "+ hm1.containsKey(1)); 
	     System.out.println("Contains Value Method: "+ hm1.containsValue("RiYa"));
	     System.out.println("To print hashmap values using values() method: "+hm1.values());
	     System.out.println("To print hashmap keys using keySet() method : "+hm1.keySet());
	     System.out.println("remove method using hashmap key : "+hm1.remove(1));
	     System.out.println(hm1);
	     System.out.println("Remove method using hashmap key and value : "+hm1.remove(4,"YiRa"));
	     System.out.println(hm1);
	     System.out.println("hashmap replace(key,value) method : "+hm1.replace(2, "Yesh"));
	     System.out.println(hm1);
	     System.out.println("hashmap replace(key,old value, new value) method : "+ hm1.replace(3, "RiYa","Resh"));
	     System.out.println(hm1);
	     
	     HashMap<Integer, Integer> hmm = new HashMap<>();
	     hmm.put(1, 2);
	     System.out.println(hmm);
	     hmm.replaceAll((key, oldValue) -> oldValue * oldValue);
	     System.out.println(hmm);
	     
	     
	     Map<Integer,Integer> numbers = new HashMap<>();
	        for (int in = 1; in <= 10; ++in) {
	            numbers.put(in, in);
	        }
	        System.out.println("Original: " + numbers);
	 
	        numbers.replaceAll((key, oldValue) -> oldValue/5);
	        System.out.println("Squared: " + numbers);
	     
	     
	     
	      
	      
	    
	      
		
		
		

	}

}
