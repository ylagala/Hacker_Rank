import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class CollectionsExample {

	public static void main(String[] args) {
		List<Double> list = new ArrayList<>();
		list.add(0.0);
		list.add(2.5);
		list.add(3.5);
		list.add(12456.79524);

		Collections.sort(list);
		System.out.println(list + " After sorting the list ");
		Collections.shuffle(list);
		System.out.println(list + " After shuffling the list ");
		// list = Collections.EMPTY_LIST;
		
		System.out.println("Emptying the list using Collections.EMPTY_LIST : "
				+ list);
		boolean b = Collections.addAll(list);
		System.out.println("Collections.addAll method: " + b);

		System.out.println("Binary Search method: "+Collections.binarySearch(list, 12456.79524));

		System.out.println("Printing index value : "+list.indexOf(0.0));  

		List<Double> list1 = new ArrayList<>();
		double[] dob = new double[4];
		list1.addAll(Arrays.stream(dob).boxed().collect(Collectors.toList()));  // adding array values to the array list
		System.out.println("Destination array list: "+list1);
		System.out.println(list);
		Collections.copy(list1, list); // Will copy the values present in list(src) to list1(dst) if the list1 size is small then it will throw exception.
		System.out.println("Collection.copy() : "+list1); 
        
		System.out.println("Disjoint : "+Collections.disjoint(list, list1)); // If any one value is common in 2 arraylists then it will return false.
		System.out.println(list1);
		list1.set(1, 2.0); // sets the values at the specified index location.
		list1.set(0, 2.4);
		list1.set(2, 2.5);
		list1.set(3, 2.6);
		
		
		
		System.out.println(list1);
		System.out.println("Fetching max value from the array list: "+Collections.max(list1));
	    Collections.reverse(list1); // Reverse the complete array list it will be useful to display the values in descending order.
		
	
		
		System.out.println("list before using retain all method: "+list);
		System.out.println("list1 before using retain all method: "+list1);
		
		list1.retainAll(list); // Deletes list1 values which are not present in list.
		
        System.out.println("list after using retain all method: "+list);
		System.out.println("list1 after using retain all method: "+list1);
		
		System.out.println(Collections.synchronizedList(list)); // Create threadsafe list
		System.out.println(list);
		Collections.swap(list, 0, 1); // Used for swapping the list based on index values given 
		System.out.println(list);
		
		
		System.out.println(Collections.singletonList(list)); // creates seriable and singleton list
		
		Collections.rotate(list, 2); 
		// rotate methods is used for rotating the list of values based on specified index. 
		//eg: if index is 2 it will pick the values from index 2 and places it in front of the list remaining values will be shifted to right.
		System.out.println("After rotating the list : "+ list);
		
		
		
		
		
	}

}
