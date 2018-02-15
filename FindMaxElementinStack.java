import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;


public class FindMaxElementinStack {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		List<Integer> list = new ArrayList<>();
		/* Deque<Integer> stack = new ArrayDeque();
	     Integer max = Integer.MIN_VALUE;

	
		/*10
		1 97
		2
		1 20
		2
		1 26
		1 20
		2
		3
		1 91
		3 */
		/* for ( int i=0; i<n1; i++ )
	            switch( in.nextInt() ) {
	                case 1: 
	                    int n = in.nextInt();
	                    max = Math.max( n, max );
	                    stack.push( max );
	                    break;
	                case 2:
	                    stack.pollFirst();
	                    if ( stack.isEmpty() )
	                        max = Integer.MIN_VALUE;
	                    else
	                        max = stack.peek();
	                    break;
	                case 3: System.out.println( max ); break;
	            }*/
		
		for ( int i=0; i<n1; i++ )
		{
			int k = in.nextInt();
			switch (k) {
			case 1: list.add(in.nextInt());
			break;
			
			case 2 : list.remove(list.size()-1);
			break;
			
			case 3: System.out.println(Collections.max(list));
			break;
			}
		}
		

	}

}
