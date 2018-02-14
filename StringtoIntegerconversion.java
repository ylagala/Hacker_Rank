import java.math.BigDecimal;


public class StringtoIntegerconversion {

	public static void main(String[] args) {
		//String to int conversion
		String str = "123";
		int i = Integer.parseInt(str);
		System.out.println(i);
		
		//String to float
		float f= Float.parseFloat(str);
		System.out.println(f);
		
		//String to Long
		long l = Long.parseLong(str);
		System.out.println(l);
		
		//String to double
		Double d = Double.parseDouble(str);
		System.out.println(d);
		
		//int to double
		int i1 = 10;
		Double d1 = (double) i1;
		i1 = d1.intValue();
		System.out.println(i1);
		System.out.println(d1);
		
		Double d2 = 10.23;
		Double d3 = 10.25;
		System.out.println(d2*d3);
		
		BigDecimal b = new BigDecimal(d2*d3);
		b = b.setScale(3, BigDecimal.ROUND_UP);
		System.out.println(b);
		
		

	}

}
