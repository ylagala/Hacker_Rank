import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;


public class IntStreamExample {

	public static void main(String[] args) {
		
		
		System.out.println("Topic: intstream,longstream and doublestream ********  ");
      int[] i = new int[] {1,10,23,5,18};
      int sum = IntStream.of(i).sum();
      
      IntStream.range(1, 10).skip(2).forEach(System.out::print);
      
      System.out.println();
      System.out.println(IntStream.range(1, 10).average().getAsDouble()+"**Int stream range average**");
      System.out.println(IntStream.range(1, 10).sum()+"**Int stream range sume**");
      System.out.println(IntStream.range(2, 10).reduce(10, (a,b)-> b-a)+"**Int stream reduce method**");
      
      OptionalInt max = IntStream.of(i).max();
      OptionalInt min = IntStream.of(i).min();
      System.out.println("Max value of int array : "+max.getAsInt());
      System.out.println("Min value of int array : "+min.getAsInt());
      System.out.println("Sum of int array is :"+sum);
        
      long[] l = new long[] {1,100000,23,5,18};
      long lsum = LongStream.of(l).sum();
      System.out.println("Sum of long array is: "+lsum);
      System.out.println("Max value of long array is: "+LongStream.of(l).max().getAsLong());
      System.out.println("Min value of long array is: "+LongStream.of(l).min().getAsLong());
      
      double[] d = {1.0, 2.3, 5.4};
      double dsum = DoubleStream.of(d).sum();
      System.out.println("Sum of double array is : "+dsum);
      System.out.println("Max value of double array is :"+ DoubleStream.of(d).max().getAsDouble());
      System.out.println("Min value of double array is :"+ DoubleStream.of(d).min().getAsDouble());
      
      System.out.println("********Convert int array to array list using java 8 feature**********");
      int[] k = new int[] {10,20,30,40,50};
      List<Integer> list = new ArrayList<>();
      
      list = Arrays.stream(k).boxed().collect(Collectors.toList());
      System.out.println("Printing array list values : "+list); 
      System.out.println(list.stream().collect(Collectors.toList()));
      
      boolean b = list.stream().allMatch(n -> n >10 );
      System.out.println("Above line prints true if each and every value in array list is greater than 10" +b);
      
      boolean b1 = list.stream().anyMatch(n -> n >10 );
      System.out.println("Above line prints true if any one value in array list is greater than 10 "+b1);
      
      System.out.println("********Convert array list to int array using java 8 feature**********");
      System.out.println(Arrays.toString(list.stream().mapToInt(j -> j).toArray()));
      
      
      IntStream is = IntStream.concat(IntStream.of(6,5,7,1, 2, 3, 3),IntStream.of(9,8));
      // boolean d = is.allMatch(n-> n > 0 );
       System.out.println(Arrays.toString(is.toArray()));

      
      
      
      
            
      
      

	}

}
