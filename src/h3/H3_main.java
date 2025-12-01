package h3;

public class H3_main {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {1,2,4};
		int[] c = {1,3,2};
		int[] d = {1,2};
		int[] e = {1,2,3};
		int[] f = {1,1,2};
		
		System.out.println(compareArrays(a,b));
		System.out.println(compareArrays(a,c));
		System.out.println(compareArrays(a,d));
		System.out.println(compareArrays(a,e));
		System.out.println(compareArrays(a,f));
		System.out.println(compareArrays(c,e));
		
	  }
	
	public static boolean compareArrays(int[] a, int[] b) {
		if (a.length != b.length) {
			return false;
		}
		
		for (int i = 0; i < a.length; i++) {
			int value =a[i];
			int countA = 0;
			int countB = 0;
			
			for (int j = 0; j < a.length; j++) {
				if (a[j]== value) {
					countA++;
				}
			}
			
			for (int j = 0; j < b.length; j++) {
				if (b[j] == value) {
					countB++;
				}
			}
				if (countA != countB) {
					return false;
				}
		}
			
		return true ;
		}
		
	}

	


