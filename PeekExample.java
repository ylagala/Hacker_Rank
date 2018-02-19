import java.math.BigInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class PeekExample {

	
	public static void main(String[] args) {
		 // generating odd numbers
		 Stream.iterate(1, (Integer n) -> n + 1)
	      .peek(n -> System.out.println("number generated: - " + n))
	      .filter(n -> (n % 2 == 1))
	      .peek(n -> System.out.println("Odd number filter passed for - " + n))
	      .limit(10)
	      .count();
		 
		 // generating even numbers
		 Stream.iterate(1, (Integer n) -> n + 1)
	      //.peek(n -> System.out.println("number generated: - " + n))
	      .filter(n -> (n % 2 == 0))
	      .peek(n -> System.out.println("Even number filter passed for - " + n))
	      .limit(10)
	      .count();
		 
		// generating multiples of 5
		 Stream.iterate(1, (Integer n) -> n + 1)
	      //.peek(n -> System.out.println("number generated: - " + n))
	      .filter(n -> (n % 5 == 0))
	      .peek(n -> System.out.println("Even number filter passed for - " + n))
	      .limit(10)
	      .count();
		 
		 System.out.println("****************************");
		 //Fibonacci Series
		 BigInteger bi = new BigInteger("1");
		 BigInteger bi1 = new BigInteger("1");
		 
		 Stream.iterate(new BigInteger[] {bi,bi1},p -> new BigInteger[] {p[1], p[0].add(p[1])})
		        .limit(60)
		        .skip(8) //skips first 8 values
		        .forEach(p -> System.out.println(p[0]));
				 
		 
		        
						 
						 
				 
			
				 
			


	}

}
