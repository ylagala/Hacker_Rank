import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.IntStream;


public class FlipBitDemo {

	public static void main(String[] args) {
		BigInteger bi  = new BigInteger("8"); // 1000
		BigInteger output  = new BigInteger("40"); // 101000
		
		System.out.println(bi); // 1000 = 8
        System.out.println(bi.flipBit(0)); //1000 + 1(0th position) = 1001 = 9
        System.out.println(bi.flipBit(1)); //1000 + 1(1st position) =1010 =10
        System.out.println(bi.flipBit(2)); // 1000 + 1(2nd position)=1100 = 12
        System.out.println(bi.flipBit(3)); // 1000 +1(3rd position) 1 1 will produce 0 so ans is = 0000 =0
        System.out.println(bi.flipBit(4)); // 1000 + 1(4th position) =11000 = 24
        System.out.println(bi.flipBit(5)); // 1000 + 1(5th position) =101000 = 40
        
        for(int i=0;i<100;i++)
        {
        	BigInteger res = bi.flipBit(i);
        	if(res.equals(output)) System.out.println("The index position to be changed is :"+i);
        }
        
        BigDecimal i = new BigDecimal("10");
        System.out.println("Printing float value of big decimal : "+i.floatValue());
        
      System.out.println(output.bitCount() + "is the bit count of output variable(it counts only the values which are having 1)");
      System.out.println(output.andNot(bi)+ ": struggling with andnot operation"); // output = 0010 1000 AND (bi = 8(1000) !8 is (1111 0111) ) = 0010 0000
      System.out.println(output.bitLength() + ": is the bit length of output variable");
      System.out.println(output.clearBit(3)+" : clears the bit at 3rd index position");// 3 indicates index position
      System.out.println(output.add(bi) +": adding 2 big integer values");
      System.out.println(output.and(bi)+" AND operation for output and BI variables"); //0010 1000 AND 0000 1000 = 0000 1000 ans is 8
      System.out.println(output.not()+": Not methods returns negative value if and only if the input variable is non-negative.");
      System.out.println(output.gcd(bi)+"; Prints greatest common divisor");
      
      BigInteger lsb = new BigInteger("0"); // 1010
      System.out.println(lsb.getLowestSetBit()+": prints negative value because we dont have any '1' binary value in lsb variable");
      
      BigInteger lsb1 = new BigInteger("10"); // 1010
      System.out.println(lsb1.getLowestSetBit()+ ": used for printing lowest index postion of '1'");
      
      System.out.println(output.divide(bi)+ ": used for printing Quotient ");
      System.out.println(Arrays.toString(output.divideAndRemainder(bi)) + ": used for printing Quotient and remainder");
        
        
	}

}
