import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.LongStream;
import java.util.stream.Stream;


public class DisplayFirst10digitsOfSum {
	
	/*5
 	37107287533902102798797998220837590246510135740250
	46376937677490009712648124896970078050417018260538
	46376937677490009712648124896970078050417018260538
	91942213363574161572522430563301811072406154908250
	23067588207539346171171980310421047513778063246676*/

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        BigInteger sum = new BigInteger("0");
        String temp;
        for(int x=0;x<n;x++){
            temp = sc.nextLine();
            BigInteger tempInt = new BigInteger(temp);      
            sum = sum.add(tempInt);
        }
        System.out.println("Sum of 5 input values ; "+sum);
        String res = sum + "";
        System.out.println("Substring of the result : "+ res.substring(0, 10));
        
        
        Stream.of("Anti","Amte","Amtu").sorted().findFirst().ifPresent(System.out::println);
        String order[]= {"Anti","Amte","Amtu"};        
        System.out.println("\n --------------\n");
        Stream.of("9","6","5").sorted().findFirst().ifPresent(System.out::println);
        System.out.println("\n --------------\n");
        Stream.of(order).sorted().findFirst().ifPresent(System.out::println);
        System.out.println("\n --------------\n");
        Stream.of(order).sorted().forEach(System.out::println);
        
        
        

	}

}
