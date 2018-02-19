import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		int h1[] = new int[n1];
		for (int h1_i = (n1 - 1); h1_i >= 0; h1_i--) {
			h1[h1_i] = in.nextInt();
		}
		int h2[] = new int[n2];
		for (int h2_i = (n2 - 1); h2_i >= 0; h2_i--) {
			h2[h2_i] = in.nextInt();
		}
		int h3[] = new int[n3];
		for (int h3_i = (n3 - 1); h3_i >= 0; h3_i--) {
			h3[h3_i] = in.nextInt();
		}
		Arrays.parallelPrefix(h1, (a, b) -> (a + b));
		
		Arrays.parallelPrefix(h2, (a, b) -> (a + b));
		Arrays.parallelPrefix(h3, (a, b) -> (a + b));

		int i = h1.length - 1, j = h2.length - 1, k = h3.length - 1, height = 0;
		
		/*
		 * 
		 * 5 3 4
3 2 1 1 1
4 3 2
1 1 4 1
*/
		while (i >= 0 && j >= 0 && k >= 0) {  
			if (h1[i] == h2[j] && h2[j] == h3[k]) {
				height = h1[i];
				break;
			} else if (h1[i] > h2[j]) {
				i--;
			} else if (h2[j] > h3[k]) {
				j--;
			} else {
				k--;
			}
		}
		System.out.println(height);
	}
}