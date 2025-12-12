package h2;

import java.util.Arrays;

public class H2_alt6 {

	public static void main(String[] args) {
	
		int[] r1 = change(new int[] {2,7,1,9}, new int[] {5,6,7}, 2, 4);
		System.out.println(Arrays.toString(r1));
		
		int[] r2 = change(new int[] {2,7,1,9}, new int[] {2,7,1,9}, 2, 4);
		System.out.println(Arrays.toString(r2));
		
		int[] r3 = change(new int[] {2,7,1,9}, new int[] {2,7,1,9}, 3, 2);
		System.out.println(Arrays.toString(r3));
	}
	
	public  static int[] change(int[] a, int[] b, int start, int end) {
		
		if (end <= start) {
			return new int[0];
		}
	
		if (Arrays.compare(a, b) !=0) {
			return Arrays.copyOfRange(a, 0, a.length);
		}

		Arrays.sort(a);
		return Arrays.copyOfRange(a, start, end);
	}

}
