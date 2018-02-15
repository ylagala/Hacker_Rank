
public class Swap2Numbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		a = a ^ b ; // a = a+b b =b
		System.out.println(a); //30
		System.out.println(b); //20
		b = a ^ b ; // a =30 b = a-b =10
		System.out.println(a);
		System.out.println(b);
		a = a ^ b ; // a=a-b b=b
		
        System.out.println(a + "   " + b);
	}

}
