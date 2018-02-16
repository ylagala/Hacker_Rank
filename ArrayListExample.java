import java.util.ArrayList;
import java.util.Arrays;
import java.util.Spliterator;


public class ArrayListExample {

	public static void main(String[] args) {
     ArrayList<Integer> al = new ArrayList<>();
     al.add(10);
     al.add(20);
     al.add(30);
     
     System.out.println("Displaying al arraylist values after performing add operation: "+al);
     
     ArrayList<Integer> al1 = new ArrayList<>(al);
     System.out.println("printing al1 arraylist values: " +al1);
     
     ArrayList<Integer> al2 = new ArrayList<>(al);
     al2.addAll(al1);
     System.out.println("after performing addAll operation to al2 arraylist : "+ al2);
     
     //clear the values al array list
     al.clear();
     System.out.println("After clearing al array list: "+al);
     
     //cloning the array list 
     ArrayList<Integer> al3 = new ArrayList<>();
     al3 = (ArrayList<Integer>) al1.clone();
     
     System.out.println("al3 arraylist after cloning : "+al3);
     
     //Equals method comparison
     System.out.println("Arraylist equals method: "+al1.equals(al3));
     //fetching size of an array
     System.out.println("size of array list : "+al2.size());
     System.out.println(al1);
     System.out.println(al2);
     System.out.println(al3);
     //Contains and COntainsAll method in array list.
     System.out.println("Contains method compares int values only not complete array list: "+al1.contains(al3));
     System.out.println("ContainsAll compares array list values: "+al1.containsAll(al3));
     
     al1.forEach(System.out::println);
     
     System.out.println("toarray method : "+Arrays.toString(al1.toArray()));
     System.out.println(al1.size());
     al1.trimToSize();
        
     
     // Split Iterator in java 8
     al1.spliterator().forEachRemaining(System.out::println); 
     Spliterator spl = al1.spliterator();
   
     System.out.println();
     System.out.println(spl.getExactSizeIfKnown());
     System.out.println(spl.estimateSize());
     //spl.forEachRemaining(System.out::print);
     System.out.println(spl.characteristics());
     Spliterator spl1 = spl.trySplit();
     spl1.forEachRemaining(System.out::println);
     System.out.println("*****");
     spl.forEachRemaining(System.out::println);
     System.out.println(spl.SUBSIZED);
     System.out.println(spl.SORTED);
     System.out.println(spl.SIZED);
     System.out.println(spl.ORDERED);
     System.out.println(spl.NONNULL);
     System.out.println(spl.CONCURRENT);
     System.out.println(spl.DISTINCT);
     System.out.println(spl.IMMUTABLE);
     
     
     
     
     
          
     
		

	}

}
