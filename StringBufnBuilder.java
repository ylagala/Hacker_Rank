
public class StringBufnBuilder {

	public static void main(String[] args) {
		String str = new String("yeshwanth");
		StringBuffer sb = new StringBuffer(str);

		System.out.println(sb.charAt(0));
		sb.append("yesh");
		System.out.println(sb);
		System.out.println(sb.codePointAt(0));
		System.out.println(sb.codePointBefore(1));
		System.out.println(sb.codePointCount(0, sb.length()));
		
		

	}

}
