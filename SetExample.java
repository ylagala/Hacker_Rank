import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;


public class SetExample {

	public static void main(String[] args) {
		//Adding values using add() method
		Set<Integer>  s = new TreeSet<>();
		s.add(1);
		s.add(21);
		s.add(31);
		System.out.println(s);
		
		// Adding set values using constructor
		TreeSet ts = new TreeSet<>(s);
		System.out.println(ts);
		
		// Adding values using addall() method
		TreeSet ts1 = new TreeSet<>();
		ts1.addAll(ts);
		/*ts1.add(11);
		ts1.add(21);
		ts1.add(31);*/
		System.out.println(ts1);
		
		System.out.println(ts1.ceiling(2)); // either equal or next highest no.
		System.out.println(ts1.floor(20)); //either equal or lowest no
        System.out.println(ts1.contains(10));
        System.out.println(ts1.containsAll(ts)); // Checks whether 
        System.out.println(ts1.equals(s));// compares both the treesets and returns T/F
        System.out.println(ts1.first()); // prints the first value of treeset
        System.out.println(ts1.higher(21)); // will print the highest value based on input
		ts1.descendingIterator().forEachRemaining(System.out::println); // prints values after iterating
		System.out.println(ts1.descendingSet()); // prints set values
		System.out.println(ts1.descendingIterator()); // prints hashcode
	    System.out.println(ts1.size());
	    System.out.println(ts1.isEmpty());
	    System.out.println(ts1.last());
	    System.out.println(ts1.pollFirst());
	    System.out.println(ts1.pollLast());
	    TreeSet tss = new TreeSet<>();
	    tss.add(4);
	    tss.add(7);
	    tss.add(3);
	    System.out.println(tss);
	    System.out.println(Arrays.toString(tss.parallelStream().toArray()));
	    
	    System.out.println(tss.remove(3));System.out.println(tss);
	    tss.add(1);
	    System.out.println("s***" + s);
	    System.out.println(tss);
	    
	    tss.removeAll(s);
	    System.out.println(s);
	    System.out.println(tss);
	    
	    System.out.println("-------retain----------");
	    tss.add(1);
	    tss.retainAll(s);
	    System.out.println("retain all s" +s);
	    System.out.println("retain all tss "+tss);
	    
	    System.out.println(ts.tailSet(21,true)); 
	    // 21 represents array value , true represents inclusive of 21 so o/p will be >=21
	    System.out.println(ts.tailSet(21,false)); 
	    // 21 represents array value , false represents exclusive of 21 so o/p will be > 21
	    System.out.println(ts.tailSet(21));
	    
	    System.out.println(ts.headSet(21,true));
	    System.out.println(ts.headSet(21));
	    
	    System.out.println(ts.higher(21));
	    System.out.println(ts.lower(21));
	    
	    ts.spliterator().forEachRemaining(System.out::println);
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
