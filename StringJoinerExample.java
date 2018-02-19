import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;


public class StringJoinerExample {

	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner("|");
		sj.add("Capgemini");
		sj.add("Pvt");
		sj.add("Limited");
		
		System.out.println(sj);
		
		StringJoiner sj1 = new StringJoiner("|", "Today's Date:", " Date Format: DD/MM/YYYY");
		sj1.add("19");
		sj1.add("02");
		sj1.add("2018");
        
		System.out.println(sj1);
		
		List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");


		String result = list.stream().map(x -> x).collect(Collectors.joining(" | "));
		System.out.println(result);
		
		
	}

}
