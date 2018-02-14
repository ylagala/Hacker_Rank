import java.util.Arrays;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;


public class ArraysExamples {

	public static void main(String[] args) {
		int[] i = {1,7,3,6,5,4};
		//Arrays.sort(i);
		
		for (int j : i ) {
			System.out.println(j);
		}
		
		System.out.println(Arrays.toString(i));
		
		//Copy of and range methods in array
		int[] k = Arrays.copyOf(i, 5);
		int[] k1 = Arrays.copyOfRange(k, 2, 10);
				
		System.out.println(Arrays.toString(k)); //Used for printing array values.
		System.out.println(Arrays.toString(k1));
		
		//parallel sort method is used for 
		// large amount of data. It is better to use serial sort for smaller data.
		//Only difference b/w parallel and serial sort is performance.
		Arrays.parallelSort(i, 1, 5);
		//For each loop
		IntConsumer intConsumer = n -> System.out.print(n + " ");
		Arrays.stream(i).forEach(intConsumer);
		System.out.println();
		
		//Arrays.parallelPrefix(i, (left, right) -> left * right);
	    //System.out.println(Arrays.toString(i)); 
		
		Arrays.parallelPrefix(i, 1,4, (left, right) -> left + right);
	    System.out.println(Arrays.toString(i)); 
	    
	    System.out.println("********************");
	    
	    int[] set  = new int[10];
	    Arrays.parallelSetAll(set,(a) -> a * 2);
	    System.out.println(Arrays.toString(set)); 

	}

}
