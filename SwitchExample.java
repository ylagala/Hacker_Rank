
public class SwitchExample {

	public static void main(String[] args) {
		String s ="hi";
		int i = 2;
		char c = 'c';
		float f = (float) 10.2;
		Double d = 10.0;
		long l = 100;
		
		switch (s) {
		case "h": System.out.println("inside h");
			break;
		case "hi": System.out.println("inside h");
		break;
		default: System.out.println("String not matched");
			break;
		}
		
		switch (i) {
		case 1: System.out.println("inside case 1");
			break;
		case 2: System.out.println("inside case 2");
		break;
		default: System.out.println("Int value not matched");
			break;
		}
		
		switch (c) {
		case 'a': System.out.println("inside case a");
			break;
		case 'b': System.out.println("inside case b");
		break;
		default: System.out.println("Char value not matched");
			break;
		}
		
		/*
		 * Switch allows int,char,string and enum only
		 * 
		 * 
		 * switch(l){
		case 1.0: System.out.println("inside float 1.0");
		break;
		default: System.out.println("inside default");
		break;
		} */
		
		
		
		
		

	}

}
